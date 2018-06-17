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
public class LinhaController extends Controller<Linha> {
    
    @Override
    public boolean salvar(Linha t) {
        return super.salvar(t); 
    }

    @Override
    public boolean excluir(Linha t) {
        return super.excluir(t); 
    }
    
    public List<Linha> buscar(String campo, String valor) {
        return super.listar(Linha.class, campo, valor); 
    }

    public Linha get(int id) {
        return super.get(Linha.class, id); 
    }
    
    public List<Linha> listar() {
        return super.listar(Linha.class, "nome", ""); 
    }  
}
