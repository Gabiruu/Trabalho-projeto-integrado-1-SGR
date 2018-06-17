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
public class Pesquisa implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    // OBSERVAÇÃO
    //O "@ManyToOne" só reconhce como chave estrangeeira o a linha que está logo abaixo,
    //por esse motivo foram declarados desta forma como visa abaixo
    
    @ManyToOne
    private Tecnico tecnico;
    @ManyToOne
    private Aluno aluno;
    @ManyToOne
    private Linha linha;
    
    @OneToMany(mappedBy="pesquisa", fetch = FetchType.LAZY)
    private List<Publicacao> publicacao;
    

    //construtor vazio
    public Pesquisa() {
    }
    
    //construtor cheio

    public Pesquisa(int id, Tecnico tecnico, Aluno aluno, Linha linha, List<Publicacao> publicacao) {
        this.id = id;
        this.tecnico = tecnico;
        this.aluno = aluno;
        this.linha = linha;
        this.publicacao = publicacao;
    }

    
    
    //getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Linha getLinha() {
        return linha;
    }

    public void setLinha(Linha linha) {
        this.linha = linha;
    }

    public List<Publicacao> getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(List<Publicacao> publicacao) {
        this.publicacao = publicacao;
    }

    
}
