package xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


/**
 *
 * @author Fatinha de Sousa
 */
public class GerenciadorXml {

    public void criaXml(String municipio, String arquivo) throws SQLException, MalformedURLException, IOException{
        
        GerenciadorCoordenada gerenciador = new GerenciadorCoordenada();
        Coordenadas coordenada = gerenciador.buscarCoordenada(municipio);
        
        
        URL url = new URL("http://servicos.cptec.inpe.br/XML/cidade/7dias/"+coordenada.getLatitude()+"/"+coordenada.getLongitude()+"/previsaoLatLon.xml");
        InputStream input = url.openStream();
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader buffer = new BufferedReader(reader);
        
        File xml = new File(arquivo);
        xml.createNewFile();
        FileOutputStream file = new FileOutputStream(xml);
        
        String linha = "";
        while (reader.ready()) {
            linha = buffer.readLine();
            file.write(linha.getBytes());

        }

        input.close();
        reader.close();
        buffer.close();
        file.close();
        
    }
    
    public String lerXml(String arquivo) throws JDOMException, IOException{
        
        File xml = new File(arquivo);
        SAXBuilder builder = new SAXBuilder();
        Document documento = builder.build(xml);
        Element element = documento.getRootElement();
        
        List<Element> elements = element.getChildren();
        
        String cabecalho = "\nPrevisão do tempo de " + element.getChildText("nome") + "-" + element.getChildText("uf")
                + " para os próximos 7 dias\n"
                + "última atualizacao feita em " + element.getChildText("atualizacao") + "\n";
        
        String conteudo = "";
        
        for (Element elemento : elements) {
            if (elemento.getChildText("dia") == null) {
                continue;
            }
            conteudo += "\nDia: " + elemento.getChildText("dia") + "\n"
                      + "Tempo:" + elemento.getChildText("tempo") + "\n"
                      + "Maxima:" + elemento.getChildText("maxima") + "\n"
                      + "Minima:" + elemento.getChildText("minima") + "\n"
                      + "iuv:" + elemento.getChildText("iuv") + "\n";

        }
        
        return cabecalho+conteudo;
    }
    
    public void deleteXml(String nomeArquivoXml) {
        File arqXml = new File(nomeArquivoXml);
        if (arqXml.exists()) {
            arqXml.delete();
        }
    }
}
