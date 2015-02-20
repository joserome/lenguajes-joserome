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

// la clse exception es la q va a heredar pero esa clase se saca de una libreria q ya trae por defecto el programa
public class NumeroNoNegativoException extends Exception {
 
    public NumeroNoNegativoException(){
    
        //invocas el constructor de la clase exception(osea de la clase madre) con la palabra super
        super("lo siento pero no acepto valores negativos");
        
    }
    
}
