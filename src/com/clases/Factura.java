/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import java.time.LocalDateTime;

/**
 *
 * @author Lucas
 */
public class Factura {
    private Integer nroFac;
    private Integer monto;
    private String tipoFac;
    private LocalDateTime fecha;
    private String comentario;
    private String usuario;

    public Factura(Integer nroFac, Integer monto, String tipoFac, String comentario, String usuario) {
        this.nroFac = nroFac;
        this.monto = monto;
        this.tipoFac = tipoFac;
        this.fecha = LocalDateTime.now();
        this.comentario = comentario;
        this.usuario = usuario;
    }

    public Integer getNroFac() {
        return nroFac;
    }

    public void setNroFac(Integer nroFac) {
        this.nroFac = nroFac;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public String getTipoFac() {
        return tipoFac;
    }

    public void setTipoFac(String tipoFac) {
        this.tipoFac = tipoFac;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

   

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
