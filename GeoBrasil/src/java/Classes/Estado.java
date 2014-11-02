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
public class Estado extends Geometria{

    private ArrayList<Municipio> municipios = new ArrayList();
    
    public Estado() {
    }

    public Estado(String nome, String the_geom, String SVG) {
        super(nome, the_geom, SVG);
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
