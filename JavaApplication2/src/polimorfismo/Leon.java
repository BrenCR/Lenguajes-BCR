package polimorfismo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author campitos
 */
public class Leon extends Animal implements ComportamientoRuido{

    @Override
    public String hacerRuido() {
   return "GRRRUUUAAAR";
    }
    
}
