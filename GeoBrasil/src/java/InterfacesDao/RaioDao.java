/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesDao;

import Classes.Municipio;
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
public class RaioDao {
    Connection con;

    public RaioDao() throws SQLException {
        this.con = new Conexao().criarConexao();
    }
    
    public ArrayList<Municipio> pesquisarMunicipiosEmUmRadio(String municipio_Estado_Raio){
        String[] municipioEstadoRaio = new String[3];
        municipioEstadoRaio = municipio_Estado_Raio.split(" - ");
        String municipio = municipioEstadoRaio[0];
        String estado = municipioEstadoRaio[1];
        Float raio = Float.parseFloat(municipioEstadoRaio[2]);
        
        
        ArrayList<Municipio> municipios = new ArrayList();
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
                muni.setThe_geom(result.getString(3));
                muni.setViewBox(new Gerenciador().getViewBoxMunicipio(municipio, estado));
                
                municipios.add(muni);
                
                
                
                
            }
            result.close();
            stat.close();
            
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        return municipios;
        
    }
    
}
