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
public class TestSuperficies {
    public static void main(String args[]) throws Exception{
    for(superficies s:Generar_superficies.obtenerFiguras()){
    
        System.out.println(s.calcularArea());
    
    }
    
    }           
    

}