/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesDao;

import Classes.Pais;
import Conexao.Conexao;
import Gerenciador.Gerenciador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SergioD
 */
public class PaisDao implements PaisDaoIT{
    Connection con;
    
    public PaisDao() throws SQLException {
        this.con = new Conexao().criarConexao();
    }

    @Override
    public Pais getBrasil() {
        String sql = "select nome, the_geom, ST_AsSVG(the_geom) from pais where nome ilike 'brasil'";
        Pais pais = new  Pais();
        
        try {
            PreparedStatement stat = con.prepareStatement(sql);
            ResultSet result = stat.executeQuery();
            result.next();
            
            pais.setNome(result.getString(1));
            pais.setThe_geom(result.getString(2));
            pais.setSVG(result.getString(3));
            
            result.close();
            stat.close();
            

            pais.setViewBox(new Gerenciador().getViewBoxBrasil()); 
            
        } catch (SQLException ex) {
            System.out.println("ERRO " + ex.getMessage());
        }        
        
        
        return pais;
    }
    
}
