/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import Classes.Estado;
import Classes.Mesorregiao;
import Classes.Municipio;
import InterfacesDao.EstadoDao;
import InterfacesDao.EstadoDaoIT;
import java.sql.Connection;
import java.sql.SQLException;
import Conexao.Conexao;
import Gerenciador.Gerenciador;
import InterfacesDao.AeroportosInternacionaisDao;
import InterfacesDao.MunicipioDao;
import java.io.IOException;
import java.util.ArrayList;
import org.jdom2.JDOMException;
import xml.Coordenadas;
import xml.GerenciadorCoordenada;
import xml.GerenciadorXml;
/**
 *
 * @author SergioD
 */
public class App {
<<<<<<< HEAD
    public static void main (String[] args) throws SQLException{     
        Gerenciador g = new Gerenciador();
        AeroportosInternacionaisDao ad = new AeroportosInternacionaisDao();
        
        System.out.println(ad.pesquisarAeroportoInternacioal("Salgado Filho").getViewBoxEstado());
=======
    public static void main (String[] args) throws SQLException, IOException, JDOMException{     
        
        GerenciadorCoordenada gerenciador = new GerenciadorCoordenada();
        Coordenadas coordenadas = gerenciador.buscarCoordenada("Cajazeiras");
>>>>>>> ad895eec5a5e9ca939c6a932186a093f199afb74
        
        System.out.println("Longitude: " +coordenadas.getLongitude());
        System.out.println("Latitude: " +coordenadas.getLatitude());
        
        GerenciadorXml gXml = new GerenciadorXml();
        
        gXml.criaXml("Cajazeiras", "cajazeiras");
        String xml = gXml.lerXml("cajazeiras");
        
        System.out.println(xml);
    }
}
