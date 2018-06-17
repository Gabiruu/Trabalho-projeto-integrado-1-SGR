/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author JulieneCaroline
 */
@Entity
public class Linha implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
        
    @OneToMany(mappedBy="linha", fetch = FetchType.LAZY)
    private List<LinhaOrientador> linhaOrientadors;
    
    @OneToMany(mappedBy="linha", fetch = FetchType.LAZY)
    private List<Pesquisa> pesquisa;

    //construtuor vazio 
    public Linha() {
    }
    
    //construtuor cheio 
    public Linha(int id, List<LinhaOrientador> linhaOrientadors) {
        this.id = id;
        this.linhaOrientadors = linhaOrientadors;
    }
    
    //getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<LinhaOrientador> getLinhaOrientadors() {
        return linhaOrientadors;
    }

    public void setLinhaOrientadors(List<LinhaOrientador> linhaOrientadors) {
        this.linhaOrientadors = linhaOrientadors;
    }

    public List<Pesquisa> getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(List<Pesquisa> pesquisa) {
        this.pesquisa = pesquisa;
    }
     
    
}
