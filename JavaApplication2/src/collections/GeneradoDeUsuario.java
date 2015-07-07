/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-107
 */
import java.util.List;
public class GeneradoDeUsuario {
    
    private List<Usuario> usuario;
    
    public GeneradoDeUsuario(){
        Usuario u1=new Usuario("juan",42,"jc@gmail.com");
        Usuario u2=new Usuario("Ana",22,"ana@outlook.com");
        Usuario u3=new Usuario("Pedro",33,"pedro@yahoo.com");
        
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }
    
    
}
