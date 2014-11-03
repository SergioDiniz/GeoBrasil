/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gerenciador;

import Classes.Estado;
import Classes.Mesorregiao;
import Classes.Microrregiao;
import Classes.Municipio;
import Classes.Regiao;
import InterfacesDao.EstadoDao;
import InterfacesDao.MesorregiaoDao;
import InterfacesDao.MicrorregiaoDao;
import InterfacesDao.MunicipioDao;
import InterfacesDao.RegiaoDao;
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
    
    public Microrregiao pesquisarMicrorregiao(String microrregiao_Estado) throws SQLException{
        MicrorregiaoDao microrregiaoDao = new MicrorregiaoDao();
        return microrregiaoDao.buscarMicrorregiao(microrregiao_Estado);
    }
    
    public Regiao pesquisarRegiao(String regiao) throws SQLException{
        RegiaoDao r = new RegiaoDao();
        return r.buscarRegiao(regiao);
    } 
        
    
    public String getViewBox(String geometria) throws SQLException{
        ViewBoxDao viewBox = new ViewBoxDao();
        return viewBox.getViewBox(geometria);
    }
    
    public String getViewBoxMunicipio(String municipio, String estado) throws SQLException{
        ViewBoxDao viewBox = new ViewBoxDao();
        return viewBox.getViewBoxMunicipio(municipio, estado);
    }
    
    public String getViewBoxMicrorregiao(String microrregiao, String estado) throws SQLException{
        ViewBoxDao viewBox = new ViewBoxDao();
        return viewBox.getViewBoxMicrorregiao(microrregiao, estado);
    }
    
    public String getViewBoxMesorregiao(String mesorregiao, String estado) throws SQLException{
        ViewBoxDao viewBox = new ViewBoxDao();
        return viewBox.getViewBoxMesorregiao(mesorregiao, estado);
    }    
    
    public String getViewBoxRegiao(String regiao) throws SQLException{
        ViewBoxDao viewBox = new ViewBoxDao();
        return viewBox.getViewBoxRegiao(regiao);
    }        
}
