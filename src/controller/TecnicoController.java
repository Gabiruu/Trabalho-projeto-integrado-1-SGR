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
public class TecnicoController extends Controller<Tecnico>{

    @Override
    public boolean salvar(Tecnico t) {
        return super.salvar(t); 
    }

    @Override
    public boolean excluir(Tecnico t) {
        return super.excluir(t); 
    }
    
    public List<Tecnico> buscar(String campo, String valor) {
        return super.listar(Tecnico.class, campo, valor); 
    }

    public Tecnico get(int id) {
        return super.get(Tecnico.class, id); 
    }
    
    public List<Tecnico> listar() {
        return super.listar(Tecnico.class, "nome", ""); 
    }    
    
}
