/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrencia;

/**
 *
 * @author T-107
 */
//Heredando la claseThread
public class PrimerThread extends Thread{
    public void run(){
        while (true){
        try{
        Thread.sleep(5000);
        System.out.println("YO SOY EL PRIMER THREAD");
    }catch(InterruptedException e){
    }//se cierra while
    }// se cierra run
  
}
}
