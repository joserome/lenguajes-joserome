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

public class Arreglos1 {
    
    
    public void nombre(int x[]){
    
    
    }
    
    public static void main(String args[]){
    
    int x[]=new int[3];
    int []y=new int[3];
    int z[]={1,20,-127};
    //int w=new int[];
    //int j[3]=new int[];
    //int q[4]=new int[4];
    //int []n={1,4.5,3};
    
    x[0]=127;
    x[1]=200;
    x[2]=23;
    //x[3]=17;
    
    //iterar   length lo ajusta al tamaño del arreglo
   //for(int i=0;i<x.length;i++){
     
    
    int a=2;
    float b=0;
    
        System.out.println(a/b);
    
    
    for(int i=0;i<3;i++){
    System.out.println(x[i]);
   
    
    }
    
    
    
        System.out.println("si existe la excepcion nunca me veras");
    
    
    //ciclo for mejorado
    for(int algodon:x){
        System.out.println(algodon);
    }
    
    
    }
}
