/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.clases;

/**
 *
 * @author Lucas
 */
public enum Estado {
    libre("Libre"), ocupada("Ocupada"), mantenimiento("Mantenimiento");
    
    private String estado;

    private Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
