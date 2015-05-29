/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class InterfazImc {
    
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Imc imc=new Imc (80,1.67f);
        imc.setPeso(90);
                
        System.out.println( imc.calcular() );
        System.out.println(imc.getPeso());
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        b=(byte)s;
        s=b;
        i=(int)l;
        i=s;
        s=(short)i;
        
        float f=2.0F;
        double d=2.0;
        
        boolean valor=false;
        Imc otro=new Imc();
        otro.setFlaco(true);
        System.out.println(otro.isFlaco());
    }
    
}
