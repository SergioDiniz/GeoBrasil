package InterfacesDao;

import Classes.Microrregiao;
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
public class MicrorregiaoDao implements MicrorregiaoDaoIT {

    private Connection conn;

    public MicrorregiaoDao() throws SQLException {
        this.conn = new Conexao().criarConexao();
    }

    @Override
    public Microrregiao buscarMicrorregiao(String microrregiao, String estado) {

        Microrregiao micro = new Microrregiao();
        String sql = "select m.nome, m.the_geom, ST_AsSVG(m.the_geom) as SVG from microrregiao m, estado e "
                + "where st_Within(m.the_geom, e.the_geom) and m.nome ilike ? and e.estado ilike ?";
        
        try {
            PreparedStatement stat = this.conn.prepareStatement(sql);
            stat.setString(1, microrregiao);
            stat.setString(2, estado);
            
            ResultSet rs = stat.executeQuery();
            rs.next();
            
            micro.setNome(rs.getString(1));
            micro.setThe_geom(rs.getString(2));
            micro.setSVG(rs.getString(3));
            
        } catch (SQLException ex) {
            Logger.getLogger(MicrorregiaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return micro;
    }
}