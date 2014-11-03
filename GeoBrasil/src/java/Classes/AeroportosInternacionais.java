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
public class AeroportosInternacionais extends Geometria{

    private String viewBoxEstado;
    
    public AeroportosInternacionais() {
    }

    public AeroportosInternacionais(String nome, String the_geom, String SVG, String viewBox) {
        super(nome, the_geom, SVG, viewBox);
    }

    public String getViewBoxEstado() {
        return viewBoxEstado;
    }

    public void setViewBoxEstado(String viewBoxEstado) {
        this.viewBoxEstado = viewBoxEstado;
    }
    
}
