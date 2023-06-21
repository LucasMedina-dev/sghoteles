package com.clases;

import java.io.Serializable;

public class Factura implements Serializable {
    private String nroFac;
    private Integer monto;
    private String tipoFac;
    private String fecha;
    private String comentario;
    private String usuario;

    public Factura(){
        
    }
    public Factura(String nroFac, Integer monto, String tipoFac, String fecha, String comentario, String usuario) {
        this.nroFac = nroFac;
        this.monto = monto;
        this.tipoFac = tipoFac;
        this.fecha = fecha;
        this.comentario = comentario;
        this.usuario = usuario;
    }

    public String getNroFac() {
        return nroFac;
    }

    public void setNroFac(String nroFac) {
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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
