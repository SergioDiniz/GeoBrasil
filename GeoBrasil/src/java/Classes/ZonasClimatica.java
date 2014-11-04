/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

/**
 *
 * @author SergioD
 */
public class ZonasClimatica extends Geometria{

    private Pais pais;
    
    public ZonasClimatica() {
    }

    public ZonasClimatica(String nome, String the_geom, String SVG, String viewBox) {
        super(nome, the_geom, SVG, viewBox);
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }


    
    
}
