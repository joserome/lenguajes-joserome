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
public class Rectangulo implements superficies{
 private float lado_mayor;
 private float lado_menor;

    public Rectangulo(float lado_mayor, float lado_menor) {
        this.lado_mayor = lado_mayor;
        this.lado_menor = lado_menor;
    }

    
    public float calcularArea(){
        System.out.print("El area del rectangulo es:");
    return lado_mayor*lado_menor;
    
    }
    /**
     * @return the lado_mayor
     */
    public float getLado_mayor() {
        return lado_mayor;
    }

    /**
     * @param lado_mayor the lado_mayor to set
     */
    public void setLado_mayor(float lado_mayor) {
        this.lado_mayor = lado_mayor;
    }

    /**
     * @return the lado_menor
     */
    public float getLado_menor() {
        return lado_menor;
    }

    /**
     * @param lado_menor the lado_menor to set
     */
    public void setLado_menor(float lado_menor) {
        this.lado_menor = lado_menor;
    }
 
 
 
}
