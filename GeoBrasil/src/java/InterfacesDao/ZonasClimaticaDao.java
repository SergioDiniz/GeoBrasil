/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesDao;

import Classes.ZonasClimatica;
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
public class ZonasClimaticaDao implements ZonasClimaticaDaoIT{
    
    Connection con;
    
    public ZonasClimaticaDao() throws SQLException {
        this.con = new Conexao().criarConexao();
    }

    @Override
    public ZonasClimatica pesquisarZonasClimatica(String clima) {
        ZonasClimatica zonaC = new ZonasClimatica();
        String sql = "select c.zona, c.geom, ST_AsSVG(c.geom) from climas c where c.zona ilike ?";
        
        try{
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setString(1, clima);
            
            ResultSet result = stat.executeQuery();
            result.next();
            
            zonaC.setNome(result.getString(1));
            zonaC.setThe_geom(result.getString(2));
            zonaC.setSVG(result.getString(3));
            
            zonaC.setViewBoxBrasil(new Gerenciador().getViewBoxBrasil());
            result.close();
            stat.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }        
        
        return zonaC;
        
    }
 
    
    
    
}
