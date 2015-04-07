/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion_regreso;

/**
 *
 * @author T-107
 */

import java.io.*;

public class PersistenciaUsuario {
    
   public void guardar(Usuario u)throws Exception{
   //paso 1 file crear un objeto File es una clase y el segundo File es el constructor
   File file=new File("D:\\archivaldo.yo");
   
   
   //paso 2 para sacarlo es de salida ------ cuando se escribe algo en un archivo
   FileOutputStream fos=new FileOutputStream(file);
   
   //paso 3 llenarlo--con algo(un usuario en este ejemplo)
   //clase
   ObjectOutputStream oos=new ObjectOutputStream(fos);
   //este es para guardar el metodo serializado
   oos.writeObject(u);
   //para cerrar el archivo es recomendado
   oos.close();
   } 
    
  //------------------------------------------------------ 
   //para leer
   //tipo de retorno Usuario
   public Usuario leer()throws Exception{
   //es el mismo q el de arriba
   File file=new File("D:\\archivaldo.yo");
   
   FileInputStream fis=new FileInputStream(file);
   ObjectInputStream ois=new ObjectInputStream(fis);
   Usuario u=new Usuario();
   u=(Usuario)ois.readObject();
   return u;
   
   
   
       
   }
   
}
