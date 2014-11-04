package xml;

import Classes.Cidade;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;



/**
 *
 * @author Fatinha de Sousa
 */
public class GerenciadorXml {

    
    
    public Cidade getObjeto(String municipio, String estado) throws JAXBException, SQLException, IOException{
        JAXBContext cvt = JAXBContext.newInstance(Cidade.class);
        Unmarshaller unmarshaller = cvt.createUnmarshaller();
        
        String xml = getXML(municipio, estado);
        
        Cidade pDoTempo = (Cidade) unmarshaller.unmarshal(new ByteArrayInputStream(xml.getBytes()));
        
        return pDoTempo;
    }    

    public String getXML(String municipio, String estado) throws SQLException, MalformedURLException, IOException{
        
        GerenciadorCoordenada gerenciador = new GerenciadorCoordenada();
        Coordenadas coordenada = gerenciador.buscarCoordenada(municipio, estado);
        
        URL url = new URL("http://servicos.cptec.inpe.br/XML/cidade/7dias/"+coordenada.getLatitude()+"/"+coordenada.getLongitude()+"/previsaoLatLon.xml");
        InputStream input = url.openStream();
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader buffer = new BufferedReader(reader);
        
        String linha = "";
        while (reader.ready()) {
            linha += buffer.readLine();
        }

        input.close();
        reader.close();
        buffer.close();
        
        return linha;
    }
    


}
