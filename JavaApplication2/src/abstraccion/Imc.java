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
public class Imc {
  private   float peso;
    private float altura;
    private boolean flaco;
    
    public Imc(){
        
    }
    public void setFlaco(boolean flaco){
          this.flaco=flaco;
    }
 
    public boolean isFlaco (){
        return flaco;
    
    }
    
     
    public Imc (float a, float p ){
    peso=p;
    altura=a;
    
    
            
}
    public String calcular (){
        float imc=peso/ (altura*altura);
        return "tu IMC es:"+imc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
