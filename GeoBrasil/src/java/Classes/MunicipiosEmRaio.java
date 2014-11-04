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
public class MunicipiosEmRaio {
    
    private ArrayList<Municipio> municipios = new ArrayList();
    private Estado estado;

    public MunicipiosEmRaio() {
    }

    public MunicipiosEmRaio(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(ArrayList<Municipio> municipios) {
        this.municipios = municipios;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
}
