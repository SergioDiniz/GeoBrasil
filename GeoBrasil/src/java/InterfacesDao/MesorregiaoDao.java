package InterfacesDao;

import Classes.Mesorregiao;
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
public class MesorregiaoDao implements MesorregiaoDaoIT {

    private Connection conn;

    public MesorregiaoDao() throws SQLException {
        this.conn = new Conexao().criarConexao();
    }

    @Override
    public Mesorregiao buscarMesorregiao(String mesorregiao, String estado) {
        Mesorregiao meso = new Mesorregiao();

        String sql = "select m.nome, m.the_geom, ST_AsSVG(m.the_geom) as SVG from mesorregiao m, estado e "
                + "where st_Within(m.the_geom, e.the_geom) and m.nome ilike ? and e.estado ilike ?";

        try {
            PreparedStatement stat = this.conn.prepareStatement(sql);
            stat.setString(1, mesorregiao);
            stat.setString(2, estado);

            ResultSet rs = stat.executeQuery();
            rs.next();

            meso.setNome(rs.getString(1));
            meso.setThe_geom(rs.getString(2));
            meso.setSVG(rs.getString(3));

            rs.close();
            stat.close();
        } catch (SQLException ex) {
            Logger.getLogger(MesorregiaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return meso;
    }
}
