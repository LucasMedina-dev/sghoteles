package com.clases;

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
