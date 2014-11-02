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
public class Geometria {
    
    private String nome;
    private String the_geom;
    private String SVG;
    private String viewBox;

    public Geometria(){}

    public Geometria(String nome, String the_geom, String SVG, String viewBox) {
        this.nome = nome;
        this.the_geom = the_geom;
        this.SVG = SVG;
        this.viewBox = viewBox;
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getThe_geom() {
        return the_geom;
    }

    public void setThe_geom(String the_geom) {
        this.the_geom = the_geom;
    }

    public String getSVG() {
        return SVG;
    }

    public void setSVG(String SVG) {
        this.SVG = SVG;
    }

    public String getViewBox() {
        return viewBox;
    }

    public void setViewBox(String viewBox) {
        this.viewBox = viewBox;
    }


    
}
