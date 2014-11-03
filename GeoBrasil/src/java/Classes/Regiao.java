/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.util.ArrayList;

/**
 *
 * @author SergioD
 */
public class Regiao extends Geometria {

    public ArrayList<Estado> estados = new ArrayList();
    
    public Regiao() {
    }

    public Regiao(String nome, String the_geom, String SVG, String viewBox) {
        super(nome, the_geom, SVG, viewBox);
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<Estado> estados) {
        this.estados = estados;
    }
    
    
    public void add(Estado estado){
        this.estados.add(estado);
    }
    
    
}
