package InterfacesDao;

import Classes.Regiao;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fatinha de Sousa
 */

public class RegiaoDao implements RegiaoDaoIT{
    
    private Connection conn;
    
    public RegiaoDao() throws SQLException{
        this.conn = new Conexao().criarConexao();
    }
    
    @Override
    public Regiao buscarRegiao(String regiao){
        
        Regiao r = new Regiao();
        String sql = "select r.nome, r.the_geom, ST_AsSVG(r.the_geom) as SVG from regiao r where nome ilike ?";
        
        try {
            PreparedStatement stat = this.conn.prepareStatement(sql);
            stat.setString(1, regiao);
        
            ResultSet rs = stat.executeQuery();
            rs.next();
            
            r.setNome(rs.getString(1));
            r.setThe_geom(rs.getString(2));
            r.setSVG(rs.getString(3));
            
        } catch (SQLException ex) {
            Logger.getLogger(RegiaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return r;
    }
}
