/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion_regreso;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ProbarSerializados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //creamos un usuario
        
        Usuario u=new Usuario();
        u.setEmail("cold_believer@hotmail.com");
        u.setNombre("Jose");
        u.setSueldo(3000);
        
        //Lo guardamos
        PersistenciaUsuario per=new PersistenciaUsuario();
        try {
            per.guardar(u);
            
            System.out.println("Usuario guardado con exito");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
    
}
