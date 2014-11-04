/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesDao;

import Classes.Municipio;
import java.sql.Connection;
import Conexao.Conexao;
import Gerenciador.Gerenciador;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import xml.GerenciadorXml;
/**
 *
 * @author SergioD
 */
public class MunicipioDao implements MunicipioDaoIT{
    Connection con;
    String municipio;
    String estado;
    
    public MunicipioDao() throws SQLException {
        this.con = new Conexao().criarConexao();
    }

    @Override
    public Municipio pesquisarMuncipio(String municipio_Estado) {
        String municipioEstado[] = new String[2];
        municipioEstado = municipio_Estado.split(" - ");
        this.municipio = municipioEstado[0];
        this.estado = municipioEstado[1];
        
        Municipio muni = new Municipio();
        String sql = "select m.nome, m.the_geom, ST_AsSVG(m.the_geom) as SVG from municipio m, estado e\n" +
                        "where ST_Within(m.the_geom, e.the_geom) and m.nome ilike ? and e.estado ilike ?";
        try {
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setString(1, municipio);
            stat.setString(2, estado);
            
            ResultSet result = stat.executeQuery();
            result.next();
            
            muni.setNome(result.getString(1));
            muni.setThe_geom(result.getString(2));
            muni.setSVG(result.getString(3));
            
            result.close();
            stat.close();
            
            muni.setViewBox(new Gerenciador().getViewBoxMunicipio(municipio, estado));
            muni.setCidade(new GerenciadorXml().getObjeto(municipio, estado));
            
        } catch (SQLException | JAXBException | IOException ex) {
            Logger.getLogger(MunicipioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return muni;
    }

    public String getMunicipio(String s) {
        pesquisarMuncipio(s).getNome();
        return this.municipio;
    }

    
    
    
 
}
