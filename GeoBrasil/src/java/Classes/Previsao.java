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
public class Previsao {
    private String dia;
    private String tempo;
    private String maxima;
    private String minima;
    private String iuv;

    public Previsao(){}
    
    public Previsao(String dia, String tempo, String maximo, String minima, String iuv) {
        this.dia = dia;
        this.tempo = tempo;
        this.maxima = maximo;
        this.minima = minima;
        this.iuv = iuv;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getMaxima() {
        return maxima;
    }

    public void setMaxima(String maximo) {
        this.maxima = maximo;
    }

    public String getMinima() {
        return minima;
    }

    public void setMinima(String minima) {
        this.minima = minima;
    }

    public String getIuv() {
        return iuv;
    }

    public void setIuv(String iuv) {
        this.iuv = iuv;
    }
    
    
    
}
