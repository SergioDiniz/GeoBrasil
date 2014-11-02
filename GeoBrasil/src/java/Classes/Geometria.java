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

    public Geometria(){}
    
    public Geometria(String nome, String the_geom) {
        this.nome = nome;
        this.the_geom = the_geom;
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

 
    
    
}
