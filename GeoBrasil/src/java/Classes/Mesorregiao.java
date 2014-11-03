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
public class Mesorregiao extends Geometria{

    public ArrayList<Municipio> municipios = new ArrayList();
    
    public Mesorregiao() {
    }

    public Mesorregiao(String nome, String the_geom, String SVG, String viewBox) {
        super(nome, the_geom, SVG, viewBox);
    }

    public ArrayList<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(ArrayList<Municipio> municipios) {
        this.municipios = municipios;
    }

    public void add(Municipio municipio){
        this.municipios.add(municipio);
    }

    
}
