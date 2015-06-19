/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author campitos
 */
public class Chapultepec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Vamos a crear animalitos
Pollo p1=new Pollo();
p1.setNombre("Pollito pio");

Leon L2=new Leon();
L2.setNombre("Mu-fa-sa");

Delfin d1=new Delfin();
d1.setNombre("Flipper");

ComportamientoRuido animales[]=new ComportamientoRuido[4];
animales[0]=p1;

animales[2]=L2;
animales[3]=d1;
for(ComportamientoRuido algo:animales) {
    System.out.println (algo.hacerRuido());
    
}
        
        
        
    }
    
}
