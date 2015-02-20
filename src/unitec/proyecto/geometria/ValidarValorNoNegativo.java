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
public class ValidarValorNoNegativo {
    /*creas una clase validar q acepte flotantes xq la clase ccuadrado es la q va a usarlo y ella acepta flotantes
    throws es como un pudiera ponerse  pero solo si se cumple la condicion
   
    es static para cuando lo vayas a usar no temgas la necesidad de crear objetos de ella, si no solo simplemente se invoca solo como en la clase main 
    */
    public static void validar(float valor)throws NumeroNoNegativoException{
        
        if (valor<0){
            
            throw new NumeroNoNegativoException();
        }
                
        
    }
    
    
    
}
