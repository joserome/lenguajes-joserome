/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo6.threads;

/**
 *
 * @author T-301
 */
public class ProbarThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("probar Threads");
        
        //paso 1 crearlo
        
        Facil t1=new Facil();
        //este es otro Thread de facil
        Facil t11=new Facil();
        // es para el relojito
        
        Relojito treloj=new Relojito();
                
                
//es para 2
        Regular r1=new Regular();
        Thread t2=new Thread(r1);
        
        
//es para 3
        Thread t3=new Thread(new Runnable(){

            @Override
            public void run() {
                
            System.out.println("soy el mejor Thread -----");}
         
            
        }
        
        );
        
        

        
        
        //asigno un nombre al thread
       // t1.setName("jose");
        

//paso 2 inicializar  es con el metodo star
        t1.start();
        
        t11.start();
        
        treloj.start();
        
    //es para el 2
        t2.start();
        
     //es para el 3
        
        t3.start();

    }
    
}
