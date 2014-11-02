/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesDao;

import Classes.Municipio;
import java.sql.Connection;
import Conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author SergioD
 */
public class MunicipioDao implements MunicipioDaoIT{
    Connection con;

    public MunicipioDao() throws SQLException {
        this.con = new Conexao().criarConexao();
    }

    @Override
    public Municipio pesquisarMuncipio(String municipio, String estado) {
        Municipio muni = new Municipio();
        String sql = "select m.nome, m.the_geom, ST_AsSVG(m.the_geom) as SVG from municipio m, estado e \n" +
"where ST_Within(m.the_geom, e.the_geom) and m.nome ilike ? and e.uf ilike ?";
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

        } catch (SQLException ex) {
            Logger.getLogger(MunicipioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return muni;
    }
 
}
