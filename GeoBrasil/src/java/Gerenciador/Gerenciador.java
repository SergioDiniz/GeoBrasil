/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gerenciador;

import Classes.Estado;
import Classes.Mesorregiao;
import Classes.Municipio;
import InterfacesDao.EstadoDao;
import InterfacesDao.MesorregiaoDao;
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
    
    public Municipio pesquisarMunicipio(String municipio_Estado) throws SQLException{
        MunicipioDao municipioD = new MunicipioDao();
        return municipioD.pesquisarMuncipio(municipio_Estado);
    }
    
    
    public Mesorregiao pesquisarMesorregiao(String mesorregiao_Estado) throws SQLException{
        MesorregiaoDao mesorregiaoDao = new MesorregiaoDao();
        return mesorregiaoDao.buscarMesorregiao(mesorregiao_Estado);
    }
    
    
    
    public String getViewBox(String geometria) throws SQLException{
        ViewBoxDao viewBox = new ViewBoxDao();
        return viewBox.getViewBox(geometria);
    }
    
    public String getViewBoxMunicipio(String municipio, String estado) throws SQLException{
        ViewBoxDao viewBox = new ViewBoxDao();
        return viewBox.getViewBoxMunicipio(municipio, estado);
    }
    
}
