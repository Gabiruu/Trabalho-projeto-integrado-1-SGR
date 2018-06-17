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
public class Publicacao implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    
    @ManyToOne
    private Pesquisa pesquisa;

    //construtor vazio
    public Publicacao() {
    }
    
    //construtor cheio 
    public Publicacao(int id, Pesquisa pesquisa) {
        this.id = id;
        this.pesquisa = pesquisa;
    }
        
    //getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pesquisa getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(Pesquisa pesquisa) {
        this.pesquisa = pesquisa;
    }
           
}