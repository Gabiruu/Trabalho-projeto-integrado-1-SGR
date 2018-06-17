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
 * @author 
 */
public class AlunoController extends Controller<Aluno>{

    @Override
    public boolean salvar(Aluno t) {
        return super.salvar(t); 
    }

    @Override
    public boolean excluir(Aluno t) {
        return super.excluir(t); 
    }
    
    public List<Aluno> buscar(String campo, String valor) {
        return super.listar(Aluno.class, campo, valor); 
    }

        public Aluno get(int id) {
            return super.get(Aluno.class, id); 
        }

        public List<Aluno> listar() {
            return super.listar(Aluno.class, "nome", ""); 
        }    
    
}
