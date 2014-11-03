package InterfacesDao;

import Classes.Estado;
import Classes.Regiao;
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
            
            
            r.setEstados(pesquisarTodosOsEstadoDentroDeRegiao(regiao));
            r.setViewBox(new Gerenciador().getViewBoxRegiao(regiao));
            
        } catch (SQLException ex) {
            Logger.getLogger(RegiaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return r;
    }
    
        
    public ArrayList<Estado> pesquisarTodosOsEstadoDentroDeRegiao(String regiao) throws SQLException{
        String sql = "select e.estado, e.the_geom, ST_AsSVG(e.the_geom) from estado e, regiao r\n" +
                     "where ST_Within(e.the_geom, r.the_geom) and r.nome ilike ?";
        
        ArrayList<Estado> estados = new ArrayList();
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, regiao);

            ResultSet result = stat.executeQuery();
            while(result.next()){
                Estado estado = new Estado();
                
                estado.setNome(result.getString(1));
                estado.setThe_geom(result.getString(2));
                estado.setSVG(result.getString(3));
                
                estados.add(estado);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger("ERRO " + ex.getMessage());
        }

        return estados;
        
    }
}
