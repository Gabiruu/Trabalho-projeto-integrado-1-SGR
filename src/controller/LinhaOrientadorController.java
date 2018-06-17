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
public class LinhaOrientadorController extends Controller<LinhaOrientador> {
    
    @Override
    public boolean salvar(LinhaOrientador t) {
        return super.salvar(t); 
    }
    
    @Override
    public boolean excluir(LinhaOrientador t) {
        return super.excluir(t); 
    }
    
    public List<LinhaOrientador> buscar(String campo, String valor) {
        return super.listar(LinhaOrientador.class, campo, valor); 
    }
    
    public LinhaOrientador get(int id) {
        return super.get(LinhaOrientador.class, id); 
    }
    
    public List<LinhaOrientador> listar() {
        return super.listar(LinhaOrientador.class, "nome", ""); 
    }
}
