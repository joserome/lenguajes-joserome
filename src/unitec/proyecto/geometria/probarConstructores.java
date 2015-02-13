/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

/**
 *
 * @author T-301
 */
public class probarConstructores {
    
    public static void main (String args[]){
    
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        //marca error aqui por q el byte es menor que el short
        //pero lo solucionas con el (byte)
        
       /* b=(byte)s;
        s=b; */
        
        float f=45;
        double dedos=45.3;
        
        int i2=300;
         
        cuadrado c=new cuadrado((float)dedos);
        
        
       
        
    }
}
