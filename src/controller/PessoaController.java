/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Pessoa;

/**
 *
 * @author jpescola
 */
public class PessoaController extends Controller<Pessoa>{

    @Override
    public boolean salvar(Pessoa t) {
        return super.salvar(t); 
    }

    @Override
    public boolean excluir(Pessoa t) {
        return super.excluir(t); 
    }
    
    public List<Pessoa> buscar(String campo, String valor) {
        return super.listar(Pessoa.class, campo, valor); 
    }

    public Pessoa get(int id) {
        return super.get(Pessoa.class, id); 
    }
    
    public List<Pessoa> listar() {
        return super.listar(Pessoa.class, "nome", ""); 
    }
}
