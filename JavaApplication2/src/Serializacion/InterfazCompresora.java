/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

/**
 *
 * @author T-107
 */
public class InterfazCompresora {
    public static void main(String[] args) {
        //primero creamos un animal
        Animal a=new Animal();
        a.setNombre("Leon");
        a.setCarnivoro("true");
        ModeloPersistenciaAnimal modelo=new ModeloPersistenciaAnimal();
        try{
            modelo.guardar(a);
            
        }
    }
}
