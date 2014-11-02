/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import Classes.Estado;
import Classes.Municipio;
import InterfacesDao.EstadoDao;
import InterfacesDao.EstadoDaoIT;
import java.sql.Connection;
import java.sql.SQLException;
import Conexao.Conexao;
import Gerenciador.Gerenciador;
import java.util.ArrayList;
/**
 *
 * @author SergioD
 */
public class App {
    public static void main (String[] args) throws SQLException{     
        EstadoDao ed = new EstadoDao();
        ArrayList<Municipio> municipios = new ArrayList();
        
        municipios = ed.pesquisarTodosOsMunicipiosDentroDeEstado("pb");
        
        System.out.println(municipios.get(1).getNome());
        
    }
}
