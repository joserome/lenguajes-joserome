/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

/**
 *
 * @author T-107
 */
public class cuadrado implements superficies {
     
    private float lado;
    
     
     
     
   /**
    * este constructor tiene un argumento de tipo flotante
    * @param lado   El parametro que debes ingresar es el valor del lado de tu cuadrado
    */  
     
     //en la clase cuadrado agregar un constructor que inicialize el atributo lado
     public cuadrado(float lado) throws NumeroNoNegativoException{
         ValidarValorNoNegativo.validar(lado);
         
         
     this.lado=lado;
     }
     //se agrega este porq ya agregamos un constructor y es una de las reglas
     public cuadrado(){
     
     }
     
     
     
    public float calcularArea(){
    
        System.out.print("El area del cuadrado es:");
    float area=lado*lado;
            return area;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) throws NumeroNoNegativoException {
        ValidarValorNoNegativo.validar(lado);
        this.lado = lado;
    }

    
}
