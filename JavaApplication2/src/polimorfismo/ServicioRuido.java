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
public class ServicioRuido {
    
    ComportamientoRuido ruido;

    public ServicioRuido(ComportamientoRuido ruido) {
        this.ruido = ruido;
    }
    public String servicioRuido(){
        return ruido.hacerRuido();
    }
    
}
