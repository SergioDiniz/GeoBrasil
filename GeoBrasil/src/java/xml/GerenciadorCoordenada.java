package xml;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fatinha de Sousa
 */

public class GerenciadorCoordenada {

    private Connection conn;
    
    public GerenciadorCoordenada() throws SQLException{
        this.conn = new Conexao().criarConexao();
    }
    
    public Coordenadas buscarCoordenada(String municipio) throws SQLException{
        String latitude;
        String longitude;
        String aux;
        String [] coordenadas;
        Coordenadas coordenada = null;
        
        String sql = "select st_astext(st_centroid(the_geom)) from municipio where nome ilike ?";
        
        PreparedStatement stat = this.conn.prepareStatement(sql);
        stat.setString(1, municipio);
        
        ResultSet rs = stat.executeQuery();
        rs.next();
        
        aux = rs.getString("st_astext").replace("POINT(", "").replace(")", "").replace(" ", "<>");
        coordenadas = aux.split("<>");
        
        latitude = coordenadas[1];
        longitude = coordenadas[0];
        
        coordenada = new Coordenadas(latitude, longitude);
        
        return coordenada;
    }
}
