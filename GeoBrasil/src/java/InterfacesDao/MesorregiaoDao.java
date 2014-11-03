package InterfacesDao;

import Classes.Mesorregiao;
import Classes.Municipio;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Gerenciador.Gerenciador;
/**
 *
 * @author Fatinha de Sousa
 */
public class MesorregiaoDao implements MesorregiaoDaoIT {

    private Connection conn;
    private String mesorregiao;
    private String estado;

    public MesorregiaoDao() throws SQLException {
        this.conn = new Conexao().criarConexao();
    }

    @Override
    public Mesorregiao buscarMesorregiao(String mesorregiao_Estado) {
        String mesorregiaoEstado[] = new String[2];
        mesorregiaoEstado = mesorregiao_Estado.split(" - ");
        this.mesorregiao = mesorregiaoEstado[0];
        this.estado = mesorregiaoEstado[1];       
        
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
            meso.setViewBox(new Gerenciador().getViewBoxMesorregiao(mesorregiao, estado));
            meso.setMunicipios(pesquisarTodosOsMunicipiosDentroDeMesorregiao(mesorregiao, estado));
            
        } catch (SQLException ex) {
            Logger.getLogger(MesorregiaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return meso;
    }

    public ArrayList<Municipio> pesquisarTodosOsMunicipiosDentroDeMesorregiao(String mesorregiao, String estado) throws SQLException{
        String sql = "select m.nome, m.the_geom, ST_AsSVG(m.the_geom) from municipio m, estado e, mesorregiao me\n" +
                    "where ST_Within(m.the_geom, me.the_geom) and me.nome ilike ? and e.estado ilike ?";
        
        ArrayList<Municipio> municipios = new ArrayList();
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, mesorregiao);
            stat.setString(2, estado);

            ResultSet result = stat.executeQuery();
            while(result.next()){
                Municipio muni = new Municipio();
                
                muni.setNome(result.getString(1));
                muni.setThe_geom(result.getString(2));
                muni.setSVG(result.getString(3));
                
                municipios.add(muni);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger("ERRO " + ex.getMessage());
        }

        return municipios;
        
    }    
    
}
