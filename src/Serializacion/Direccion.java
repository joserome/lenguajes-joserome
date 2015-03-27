/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

import java.io.Serializable;

/**
 *
 * @author T-301
 */
public class Direccion implements Serializable {
    
    private String colonia;
    private String municipio;
    private String estado;

    public Direccion(String colonia, String municipio, String estado) {
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
    
}
