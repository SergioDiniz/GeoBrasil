/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesDao;

import Classes.Estado;
import Classes.Municipio;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SergioD
 */
public interface EstadoDaoIT {
    
    public Estado pesquisarEstado(String nome);
    
}
