/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesDao;

import Classes.Estado;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SergioD
 */
public class EstadoDao implements EstadoDaoIT{

    private Connection con;

    public EstadoDao() throws SQLException {
        this.con = new Conexao().criarConexao();
    }
    
    
    
    @Override
    public Estado pesquisarEstado(String nome) {
        // Consulta no bando BDNC que retorna a sigla, the_geom e o SVG de um estado
        String sql = "select uf, the_geom, ST_AsSVG(the_geom) as SVG from estado where uf ilike ?";
        Estado estado = new Estado();
        
        try {
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setString(1, nome);
            
            ResultSet result = stat.executeQuery();
            result.next();
            
            estado.setNome(result.getString(1));
            estado.setThe_geom(result.getString(2));
            estado.setSVG(result.getString(3));
            
            result.close();
            stat.close();
            
            
        } catch (SQLException ex) {
            System.out.println("ERRO " + ex.getMessage());
        }
        
        
        
        return estado;
    }
    
}
