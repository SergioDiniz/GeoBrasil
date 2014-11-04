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
import InterfacesDao.ViewBoxDao;
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
    public static void main (String[] args) throws SQLException, IOException, JDOMException{     
            Gerenciador g = new Gerenciador();
            System.out.println(g.pesquisarAeroportos("Salgado Filho").getEstado().getNome());
    }
}
