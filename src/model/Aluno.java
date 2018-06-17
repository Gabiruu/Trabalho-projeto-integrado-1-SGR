/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;


/**
 *
 * @author 
 */

@Entity
public class Aluno implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
        
    @ManyToOne
    private Pessoa pessoa;
    
    @OneToMany(mappedBy="aluno", fetch = FetchType.LAZY)
    private List<Pesquisa> pesquisa;
    
    //contrutor vazio
    public Aluno() {
    }
    
    //isso é certo ?
    public Aluno(int id, Pessoa pessoa) {
        this.id = id;
        this.pessoa = pessoa;
    }
    
    //construtor cheio
    
    public Aluno(int id, Pessoa pessoa, List<Pesquisa> pesquisa) {
        this.id = id;
        this.pessoa = pessoa;
        this.pesquisa = pesquisa;
    }

//    public Aluno(int i, Pessoa aluno) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    //GETTEERS & setter
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

    public List<Pesquisa> getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(List<Pesquisa> pesquisa) {
        this.pesquisa = pesquisa;
    }
     
            
}
