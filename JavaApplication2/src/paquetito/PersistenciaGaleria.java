/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetito;

import java.io.*;
import java.util.ArrayList;

public class PersistenciaGaleria {
    ArrayList<Galeria> galeria=new ArrayList<Galeria>();
    public void guardar(Galeria g)throws Exception{
            ArrayList<Galeria> galeroia=new ArrayList<Galeria>();
            File f=new File("galeria");
    if(f.exists()){
        galeria= leerTodas();
    }
    FileInputStream fos=new FileOutputStream(f);
    ObjectOutputStream oss=new ObjectOutputStream(fos);
    galeria.add(g);
    oos.writeObject(galeria);
        System.out.println("Datos de la imagen guardados exitosamente");
    }// termina metodo guardar
    public ArrayList<Galeria> leerTodas()Throws Exception{
        File f=new File("galeria");
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        galeria= (ArrayList<Galeria>)ois.readObject();
        return galeria;
    }
}
