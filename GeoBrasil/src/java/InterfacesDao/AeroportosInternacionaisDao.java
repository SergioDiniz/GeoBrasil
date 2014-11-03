/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesDao;

import Classes.AeroportosInternacionais;
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
public class AeroportosInternacionaisDao implements AeroportosInternacionaisDaoIT{

    Connection con;
    
    public AeroportosInternacionaisDao() throws SQLException {
        this.con = new Conexao().criarConexao();
    }

    
    
    @Override
    public AeroportosInternacionais pesquisarAeroportoInternacioal(String aeroporto) {
        
        AeroportosInternacionais aero = new AeroportosInternacionais();
        String sql = "select a.nome, a.geom, ST_AsSVG(geom) from aeroportos a \n" +
                    "where a.nome ilike ?";
        
        try{
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setString(1, aeroporto);
            
            ResultSet result = stat.executeQuery();
            result.next();
            
            aero.setNome(result.getString(1));
            aero.setThe_geom(result.getString(2));
            aero.setSVG(result.getString(3));
            
            aero.setViewBoxEstado(pesquisarViewBoxDoEstadoDoAeroporto(aeroporto));
            
            result.close();
            stat.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return aero;
        
    }
    
    
    public String pesquisarViewBoxDoEstadoDoAeroporto(String aeroporto) {
        
        String viewBoxEstado = null;
        String sql = "select e.estado from aeroportos a, estado e \n" +
                    "where ST_Within (a.geom, e.the_geom) and a.nome ilike ?";
        
        try{
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setString(1, aeroporto);
            
            ResultSet result = stat.executeQuery();
            result.next();
            
            viewBoxEstado = new Gerenciador().getViewBox(result.getString(1));
            
            result.close();
            stat.close();            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return viewBoxEstado;
        
    }    
    
}
