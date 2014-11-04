/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gerenciador;

import Classes.AeroportosInternacionais;
import Classes.Estado;
import Classes.Mesorregiao;
import Classes.Microrregiao;
import Classes.Municipio;
import Classes.Pais;
import Classes.Regiao;
import Classes.ZonasClimatica;
import InterfacesDao.AeroportosInternacionaisDao;
import InterfacesDao.EstadoDao;
import InterfacesDao.MesorregiaoDao;
import InterfacesDao.MicrorregiaoDao;
import InterfacesDao.MunicipioDao;
import InterfacesDao.PaisDao;
import InterfacesDao.RegiaoDao;
import InterfacesDao.ViewBoxDao;
import InterfacesDao.ZonasClimaticaDao;
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
    
    public Pais getBrasil() throws SQLException{
        PaisDao paisD = new PaisDao();
        return paisD.getBrasil();
    }
        
    
    public Regiao pesquisarRegiao(String regiao) throws SQLException{
        RegiaoDao r = new RegiaoDao();
        return r.buscarRegiao(regiao);
    } 
        
    public AeroportosInternacionais pesquisarAeroportos(String aeroporto) throws SQLException{
        AeroportosInternacionaisDao ae = new AeroportosInternacionaisDao();
        return ae.pesquisarAeroportoInternacioal(aeroporto);
    } 
  
    public ZonasClimatica pesquisarZonasClimatica(String clima) throws SQLException{
        ZonasClimaticaDao zona = new ZonasClimaticaDao();
        return zona.pesquisarZonasClimatica(clima);
    }         
    
    public String getViewBoxEstado(String geometria) throws SQLException{
        ViewBoxDao viewBox = new ViewBoxDao();
        return viewBox.getViewBoxEstado(geometria);
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

    public String getViewBoxBrasil() throws SQLException{
        ViewBoxDao viewBox = new ViewBoxDao();
        return viewBox.getViewBoxBrasil();
    }  
    
}
