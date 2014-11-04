/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SergioD
 */
@XmlRootElement
public class Cidade {
    private String nome;
    private String uf;
    private String atualizacao;
    private ArrayList<Previsao> previsao = new ArrayList();

    public Cidade() {
    }
    
    public Cidade(String nome, String uf, String atualizacao) {
        this.nome = nome;
        this.uf = uf;
        this.atualizacao = atualizacao;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getAtualizacao() {
        return atualizacao;
    }

    public void setAtualizacao(String atualizacao) {
        this.atualizacao = atualizacao;
    }

    public ArrayList<Previsao> getPrevisao() {
        return previsao;
    }

    public void setPrevisao(ArrayList<Previsao> previsao) {
        this.previsao = previsao;
    }
    
    
}
