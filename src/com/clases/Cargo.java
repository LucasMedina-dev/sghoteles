package com.clases;

public class Cargo {
    private Integer recargo;
    private String motivo;
    private String usuario;

    public Cargo(Integer recargo, String motivo, String usuario) {
        this.recargo = recargo;
        this.motivo = motivo;
        this.usuario = usuario;
    }

    public Integer getRecargo() {
        return recargo;
    }

    public void setRecargo(Integer recargo) {
        this.recargo = recargo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
