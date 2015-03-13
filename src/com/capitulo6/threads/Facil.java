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
public class Facil extends Thread{
    
    //ejecuta lo q tiene dentro el thread por eso se llama run
    public void run(){
       
        //el try  catch  es para el de pausa junto con el de sleep 
        try {
                Thread.sleep(3000);
        System.out.println("soy un thread facil no hago nada");
        
        //es para ver el thread actual currentThread
        String nombre=Thread.currentThread().getName();
        System.out.println("me llamo "+ nombre);
        }catch(InterruptedException e){ }
        
    }
}
