/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gerenciador;

import Classes.Estado;
import Classes.Municipio;
import InterfacesDao.EstadoDao;
import InterfacesDao.MunicipioDao;
import InterfacesDao.ViewBoxDao;
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
    
    public Municipio pesquisarMunicipio(String municipio, String estado) throws SQLException{
        MunicipioDao municipioD = new MunicipioDao();
        return municipioD.pesquisarMuncipio(municipio, estado);
    }
    
    public String getViewBoxEstado(String estado) throws SQLException{
        ViewBoxDao viewBox = new ViewBoxDao();
        return viewBox.getViewBoxEstado(estado);
    }
    
}
