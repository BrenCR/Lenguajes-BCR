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
import java.io.*;
public class ModeloPersistenciaAnimal {
    String ruta="Bibliotecas\\Documentos\\animalitos.xxx";
    
    
        
        public void guardar (Animal animal)throws Exception {
            //paso1 crear el archivo donde se guardara el animal
            File file=new File(ruta);
            if(file.exists ()){
               animales= buscarTodos();
            }
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(animal);
            System.out.println("Animalito comprimido con exito");
        } 
    

public Animal  buscarTodos()throws Exception{
Animal a=new Animal();
File f=new File(ruta);
FileInputStream fis=new FileInputStream(f);
ObjectInputStream ois=new ObjectInputStream(fis);
a=(Animal) ois.readObject();
return a;


}}
