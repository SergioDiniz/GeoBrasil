/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesDao;

import Classes.Municipio;
import Classes.MunicipiosEmRaio;
import Conexao.Conexao;
import Gerenciador.Gerenciador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SergioD
 */
public class MunicipiosEmRaioDao {
    Connection con;

    public MunicipiosEmRaioDao() throws SQLException {
        this.con = new Conexao().criarConexao();
    }
    
    public MunicipiosEmRaio pesquisarMunicipiosEmUmRadio(String municipio_Estado_Raio){
        String[] municipioEstadoRaio = new String[3];
        municipioEstadoRaio = municipio_Estado_Raio.split(" - ");
        String municipio = municipioEstadoRaio[0];
        String estado = municipioEstadoRaio[1];
        Float raio = Float.parseFloat(municipioEstadoRaio[2]);
        
        
        MunicipiosEmRaio municipios = new MunicipiosEmRaio();
        String sql = "select ms.nome, ms.the_geom, ST_AsSVG(ms.the_geom) from municipio ms, municipio m, estado e " +
                    "where ST_Distance(ST_Centroid(ms.the_geom), ST_Centroid(m.the_geom)) * 40075/360 <= ?" +
                    "and m.nome ilike ? and e.estado ilike ?";
        
        try{
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setFloat(1, raio);
            stat.setString(2, municipio);
            stat.setString(3, estado);
            
            ResultSet result = stat.executeQuery();
            while(result.next()){
                Municipio muni = new Municipio();
                
                muni.setNome(result.getString(1));
                muni.setThe_geom(result.getString(2));
                muni.setSVG(result.getString(3));
                muni.setViewBox(new Gerenciador().getViewBoxMunicipio(municipio, estado));
                
                municipios.getMunicipios().add(muni);
           
            }
            result.close();
            stat.close();
            
            municipios.setEstado( new Gerenciador().pesquisarEstado(estado));
            
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        return municipios;
        
    }
    
}
