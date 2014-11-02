/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author SergioD
 */
public class Conexao {
    
    private final String URL = "jdbc:postgresql://localhost:5432/bdnc";
    private final String username = "postgres";
    private final String senha = "12345";
    
    
    public Connection criarConexao() throws SQLException{
        DriverManager.registerDriver(new org.postgresql.Driver());
        Connection con = DriverManager.getConnection(URL, username, senha);
        return con;
    }
    
}
