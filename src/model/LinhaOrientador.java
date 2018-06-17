/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author JulieneCaroline
 */
@Entity
public class LinhaOrientador implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    
    @ManyToOne
    private Orientador orientador;
    @ManyToOne
    private Linha linha;

    public LinhaOrientador() {
    }

    public LinhaOrientador(int id, Orientador orientador, Linha linha) {
        this.id = id;
        this.orientador = orientador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Orientador getOrientador() {
        return orientador;
    }

    public void setOrientador(Orientador orientador) {
        this.orientador = orientador;
    }
    
     public Linha getLinha() {
        return linha;
    }

    public void setLinha(Linha linha) {
        this.linha = linha;
    }

   
    

  
}
