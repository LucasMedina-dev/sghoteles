/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Nicolás Vera
 */
public class Caja {
    private LocalDateTime fecha;
    private Factura factura;

    public Caja() {
    }

    public Caja(LocalDateTime fecha, Factura f) {
        this.fecha = fecha;
        this.factura = f;
    }

    

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Caja{" + "fecha=" + fecha + ", factura=" + factura + '}';
    }

   

   
    
    
    
    
    
}
