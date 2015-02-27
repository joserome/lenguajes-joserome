/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

import java.util.*;

public class Generar_superficies {
    
    public static ArrayList<superficies> obtenerFiguras()throws Exception{
    ArrayList<superficies> figuritas=new ArrayList<superficies>();
    //primero creamos cuadrados
    cuadrado cua1=new cuadrado(12);
    cuadrado cua2=new cuadrado(14);
    cuadrado cua3=new cuadrado(13);
    

    //crear 1 rectangulos
    Rectangulo rec1=new Rectangulo(12,4);
    
    
    //crear 2 triangulos
    
    triangulo tr1=new triangulo(14,5);
    triangulo tr2=new triangulo(6,3);
    //crear 2 circulos
    
    circulo c1=new circulo(45);
    circulo c2=new circulo(65);
    
    
    
    //agregarlos al ArrayList
    figuritas.add(cua1);
    figuritas.add(cua2);
    figuritas.add(cua3);
    
    figuritas.add(rec1);
    
    figuritas.add(tr1);
    figuritas.add(tr2);
    
    
    figuritas.add(c1);
    figuritas.add(c2);
    
    
    
    return figuritas;
    }
            
}
