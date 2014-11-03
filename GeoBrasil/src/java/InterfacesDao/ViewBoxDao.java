/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Conexao.Conexao;


/**
 *
 * @author SergioD
 */
public class ViewBoxDao {
    
    public String getTamanhoViewBox(String geometria) throws SQLException{
        Connection connection = new Conexao().criarConexao();
        String sql = "SELECT getTamanhoViewBox('"+geometria+"') as viewBox";
        
        String viewBox = null;
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            resultSet.next();
            viewBox = resultSet.getString("viewBox");
        }finally{
            connection.close();
        }
        return viewBox;
    }


    public String getViewBoxMunicipio(String municipio, String estado) throws SQLException{
        String sql = "SELECT CAST(ST_xmin(box2d(ST_Envelope(m.the_geom))) as varchar) || ' ' ||\n" +
                    "CAST(ST_ymax(box2d(ST_Envelope(m.the_geom))) * -1 as varchar) || ' ' || \n" +
                    "CAST(ST_xmax(box2d(ST_Envelope(m.the_geom))) - ST_xmin(box2d(ST_Envelope(m.the_geom))) as varchar) || ' ' || \n" +
                    "CAST(ST_ymax(box2d(ST_Envelope(m.the_geom))) - ST_ymin(box2d(ST_Envelope(m.the_geom))) as varchar) AS viewBox \n" +
                    "FROM municipio m, estado e WHERE nome ilike ? and e.estado ilike ? group by m.the_geom ";
        String viewBox = null;
        Connection con = new Conexao().criarConexao();
        try{
           PreparedStatement stat = con.prepareStatement(sql);
           stat.setString(1, municipio);
           stat.setString(2, estado);
           
           ResultSet resut = stat.executeQuery();
           resut.next();
           
           viewBox = resut.getString(1);
           stat.close();
        }finally{
            con.close();
        }
        return viewBox;
    }    

    
    
    public String getViewBoxMicrorregiao(String microrregiao, String estado) throws SQLException{
        String sql = "SELECT CAST(ST_xmin(box2d(ST_Envelope(m.the_geom))) as varchar) || ' ' ||\n" +
                    "CAST(ST_ymax(box2d(ST_Envelope(m.the_geom))) * -1 as varchar) || ' ' || \n" +
                    "CAST(ST_xmax(box2d(ST_Envelope(m.the_geom))) - ST_xmin(box2d(ST_Envelope(m.the_geom))) as varchar) || ' ' || \n" +
                    "CAST(ST_ymax(box2d(ST_Envelope(m.the_geom))) - ST_ymin(box2d(ST_Envelope(m.the_geom))) as varchar) AS viewBox \n" +
                    "FROM microrregiao m, estado e WHERE m.nome ilike ? and e.estado ilike ? group by m.the_geom ";
        String viewBox = null;
        Connection con = new Conexao().criarConexao();
        try{
           PreparedStatement stat = con.prepareStatement(sql);
           stat.setString(1, microrregiao);
           stat.setString(2, estado);
           
           ResultSet resut = stat.executeQuery();
           resut.next();
           
           viewBox = resut.getString(1);
           stat.close();
        }finally{
            con.close();
        }
        return viewBox;
    }    
    
    public String getViewBoxMesorregiao(String mesorregiao, String estado) throws SQLException{
        String sql = "SELECT CAST(ST_xmin(box2d(ST_Envelope(m.the_geom))) as varchar) || ' ' ||\n" +
                    "CAST(ST_ymax(box2d(ST_Envelope(m.the_geom))) * -1 as varchar) || ' ' || \n" +
                    "CAST(ST_xmax(box2d(ST_Envelope(m.the_geom))) - ST_xmin(box2d(ST_Envelope(m.the_geom))) as varchar) || ' ' || \n" +
                    "CAST(ST_ymax(box2d(ST_Envelope(m.the_geom))) - ST_ymin(box2d(ST_Envelope(m.the_geom))) as varchar) AS viewBox \n" +
                    "FROM mesorregiao m, estado e WHERE m.nome ilike ? and e.estado ilike ? group by m.the_geom ";
        String viewBox = null;
        Connection con = new Conexao().criarConexao();
        try{
           PreparedStatement stat = con.prepareStatement(sql);
           stat.setString(1, mesorregiao);
           stat.setString(2, estado);
           
           ResultSet resut = stat.executeQuery();
           resut.next();
           
           viewBox = resut.getString(1);
           stat.close();
        }finally{
            con.close();
        }
        return viewBox;
    }       
    
    
    public String getViewBox(String geometria) throws SQLException{
        String sql = "SELECT CAST(ST_xmin(box2d(ST_Envelope(the_geom))) as varchar) || ' ' || " +
                    "CAST(ST_ymax(box2d(ST_Envelope(the_geom))) * -1 as varchar) || ' ' || " +
                    "CAST(ST_xmax(box2d(ST_Envelope(the_geom))) - ST_xmin(box2d(ST_Envelope(the_geom))) as varchar) || ' ' || " +
                    "CAST(ST_ymax(box2d(ST_Envelope(the_geom))) - ST_ymin(box2d(ST_Envelope(the_geom))) as varchar) AS viewBox " +
                    "FROM estado WHERE uf ilike ?";
        String viewBox = null;
        Connection con = new Conexao().criarConexao();
        try{
           PreparedStatement stat = con.prepareStatement(sql);
           stat.setString(1, geometria);
           ResultSet result = stat.executeQuery();
           result.next();
           
           viewBox = result.getString(1);
           result.close();
        }finally{
            con.close();
        }
        return viewBox;
    }
    
    
}
