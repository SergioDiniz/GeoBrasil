/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlets;

import Classes.AeroportosInternacionais;
import Classes.Estado;
import Classes.Mesorregiao;
import Classes.Microrregiao;
import Classes.Municipio;
import Classes.ZonasClimatica;
import Gerenciador.Gerenciador;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SergioD
 */
@WebServlet(name = "Pesquisar", urlPatterns = {"/Pesquisar"})
public class Pesquisar extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        request.setCharacterEncoding("UTF-8"); 
        Gerenciador gerenciador = new Gerenciador();
        
        String campoPesquisa = request.getParameter("campoPesquisa");
        String tipoPesquisa = request.getParameter("tipoPesquisa");

            if("municipio".equals(tipoPesquisa)){
                Municipio municipio = new Municipio();  
                
                try {
                    municipio = gerenciador.pesquisarMunicipio(campoPesquisa);
                    
                    session.setAttribute("geometria", municipio);
                    session.setAttribute("tipoPesquisa", tipoPesquisa);
                    
                    response.sendRedirect("index.jsp#mapa");
                } catch (SQLException ex) {
                    Logger.getLogger(Pesquisar.class.getName()).log(Level.SEVERE, null, ex);
                }

                
                
            } else if("estado".equals(tipoPesquisa)){
                Estado estado = new Estado();
                
                try {
                    estado = gerenciador.pesquisarEstado(campoPesquisa);
                    
                    session.setAttribute("geometria", estado);
                    session.setAttribute("tipoPesquisa", tipoPesquisa);
                    
                    response.sendRedirect("index.jsp#mapa");
                } catch (SQLException ex) {
                    Logger.getLogger(Pesquisar.class.getName()).log(Level.SEVERE, null, ex);
                }
                

                
            } else if("microrregiao".equals(tipoPesquisa)){
                Microrregiao microrregiao = new Microrregiao();
                
                try {
                    microrregiao = gerenciador.pesquisarMicrorregiao(campoPesquisa);
                    
                    session.setAttribute("geometria", microrregiao);
                    session.setAttribute("tipoPesquisa", tipoPesquisa);
                    
                    response.sendRedirect("index.jsp#mapa");
                } catch (SQLException ex) {
                    Logger.getLogger(Pesquisar.class.getName()).log(Level.SEVERE, null, ex);
                }
            

                
            } else if("mesorregiao".equals(tipoPesquisa)){
                Mesorregiao mesorregiao = new Mesorregiao();
                
                try {
                    mesorregiao = gerenciador.pesquisarMesorregiao(campoPesquisa);
                    
                    session.setAttribute("geometria", mesorregiao);
                    session.setAttribute("tipoPesquisa", tipoPesquisa);
                    
                    response.sendRedirect("index.jsp#mapa");
                } catch (SQLException ex) {
                    Logger.getLogger(Pesquisar.class.getName()).log(Level.SEVERE, null, ex);
                }
           
            
            
            
            } else if("raio".equals(tipoPesquisa)){
                ArrayList<Municipio> municipios = new ArrayList();
                
                try {
                    municipios = gerenciador.pesquisarMunicipiosEmUmRadio(campoPesquisa);
                    
                    session.setAttribute("geometria", municipios);
                    session.setAttribute("tipoPesquisa", tipoPesquisa);
                    
                    response.sendRedirect("index.jsp#mapa");
                } catch (SQLException ex) {
                    Logger.getLogger(Pesquisar.class.getName()).log(Level.SEVERE, null, ex);
                }
           
            
            
            
            
            } else if("zclimaticas".equals(tipoPesquisa)){
                ZonasClimatica zonac = new ZonasClimatica();
                
                try {
                    zonac = gerenciador.pesquisarZonasClimatica(campoPesquisa);
                    
                    session.setAttribute("geometria", zonac);
                    session.setAttribute("tipoPesquisa", tipoPesquisa);
                    
                    response.sendRedirect("index.jsp#mapa");
                } catch (SQLException ex) {
                    Logger.getLogger(Pesquisar.class.getName()).log(Level.SEVERE, null, ex);
                }
           
            
            
            
            } else if("aeroportos".equals(tipoPesquisa)){
                AeroportosInternacionais aero = new AeroportosInternacionais();
                
                try {
                    aero = gerenciador.pesquisarAeroportos(campoPesquisa);
                    
                    session.setAttribute("geometria", aero);
                    session.setAttribute("tipoPesquisa", tipoPesquisa);
                    
                    response.sendRedirect("index.jsp#mapa");
                } catch (SQLException ex) {
                    Logger.getLogger(Pesquisar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }


}
