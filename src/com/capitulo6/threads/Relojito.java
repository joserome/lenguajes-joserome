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

import java.util.*;

public class Relojito extends Thread {

    public void run(){
    while(true){
        
        try{
        //esta en la biblioteca tanto el calendar como lo de la instance
        Calendar cal=Calendar.getInstance();
        int hora=cal.get(Calendar.HOUR_OF_DAY);
        int minuto=cal.get(Calendar.MINUTE);
        int segundo=cal.get(Calendar.SECOND);
        
        System.out.println("La hora es:"+hora+":"+minuto+":"+segundo);
        
        Thread.sleep(1000);
        }catch(Exception e){}
    
    }
                   }
    
    
}
