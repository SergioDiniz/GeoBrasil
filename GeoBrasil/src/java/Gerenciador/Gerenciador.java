/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gerenciador;

import Classes.Estado;
import InterfacesDao.EstadoDao;
import java.sql.SQLException;

/**
 *
 * @author SergioD
 */
public class Gerenciador {
    
    public Estado pesquisarEstado(String nomeEstado) throws SQLException{
        EstadoDao estadoD = new EstadoDao();
        return estadoD.pesquisarEstado(nomeEstado);
    }
    
}
