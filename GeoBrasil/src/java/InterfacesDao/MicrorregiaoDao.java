package InterfacesDao;

import Classes.Microrregiao;
import Classes.Municipio;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Gerenciador.Gerenciador;
import java.util.ArrayList;
/**
 *
 * @author Fatinha de Sousa
 */
public class MicrorregiaoDao implements MicrorregiaoDaoIT {

    private Connection conn;
    private String microrregiao;
    private String estado;

    public MicrorregiaoDao() throws SQLException {
        this.conn = new Conexao().criarConexao();
    }

    @Override
    public Microrregiao buscarMicrorregiao(String microrregiao_Estado) {
        String microrregiaoEstado[] = new String[2];
        microrregiaoEstado = microrregiao_Estado.split(" - ");
        this.microrregiao = microrregiaoEstado[0];
        this.estado = microrregiaoEstado[1];
        
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
            
            micro.setMunicipios(pesquisarTodosOsMunicipiosDentroDeMicrorregiao(microrregiao, estado));
            micro.setViewBox(new Gerenciador().getViewBoxMicrorregiao(microrregiao, estado));
            
        } catch (SQLException ex) {
            Logger.getLogger(MicrorregiaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return micro;
    }
    

    public ArrayList<Municipio> pesquisarTodosOsMunicipiosDentroDeMicrorregiao(String microrregiao, String estado) throws SQLException{
        String sql = "select m.nome, m.the_geom, ST_AsSVG(m.the_geom) from municipio m, estado e, microrregiao mi\n" +
                     "where ST_Within(m.the_geom, mi.the_geom) and mi.nome ilike ? and e.estado ilike ?";
        
        ArrayList<Municipio> municipios = new ArrayList();
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, microrregiao);
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