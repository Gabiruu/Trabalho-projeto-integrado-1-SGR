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

/**
 *
 * @author 
 */

@Entity
public class Orientador implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
        
    @ManyToOne
    private Pessoa pessoa;
    
    public Orientador() {
    }

    public Orientador(int id, Pessoa pessoa) {
        this.id = id;
        this.pessoa = pessoa;
    }    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
            
}
