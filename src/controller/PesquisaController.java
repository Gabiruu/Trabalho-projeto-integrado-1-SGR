/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.*;

/**
 *
 * @author JulieneCaroline
 */
public class PesquisaController  extends Controller<Pesquisa> {
    
     @Override
    public boolean salvar(Pesquisa t) {
        return super.salvar(t); 
    }

    @Override
    public boolean excluir(Pesquisa t) {
        return super.excluir(t); 
    }
    
    public List<Pesquisa> buscar(String campo, String valor) {
        return super.listar(Pesquisa.class, campo, valor); 
    }

    public Pesquisa get(int id) {
        return super.get(Pesquisa.class, id); 
    }
    
    public List<Pesquisa> listar() {
        return super.listar(Pesquisa.class, "nome", ""); 
    }  
}
