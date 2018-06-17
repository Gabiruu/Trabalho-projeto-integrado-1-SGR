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
 * @author 
 */

@Entity
public class Orientador implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
        
    @ManyToOne
    private Pessoa pessoa;
    
    @OneToMany(mappedBy="orientador", fetch = FetchType.LAZY)
    private List<LinhaOrientador> linhaOrientadors;

    public Orientador() {
    }

    public Orientador(int id, Pessoa pessoa) {
        this.id = id;
        this.pessoa = pessoa;
    }
    
        
    public Orientador(int id, Pessoa pessoa, List<LinhaOrientador> linhaOrientadors) {
        this.id = id;
        this.pessoa = pessoa;
        this.linhaOrientadors = linhaOrientadors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<LinhaOrientador> getLinhaOrientadors() {
        return linhaOrientadors;
    }

    public void setLinhaOrientadors(List<LinhaOrientador> linhaOrientadors) {
        this.linhaOrientadors = linhaOrientadors;
    }
    
    
            
}
