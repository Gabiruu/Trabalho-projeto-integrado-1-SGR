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
 * @author jpescola
 */
public class OrientadorController extends Controller<Orientador>{

    @Override
    public boolean salvar(Orientador t) {
        return super.salvar(t); 
    }

    @Override
    public boolean excluir(Orientador t) {
        return super.excluir(t); 
    }
    
    public List<Orientador> buscar(String campo, String valor) {
        return super.listar(Orientador.class, campo, valor); 
    }

    public Orientador get(int id) {
        return super.get(Orientador.class, id); 
    }
    
    public List<Orientador> listar() {
        return super.listar(Orientador.class, "nome", ""); 
    }    
    
}
