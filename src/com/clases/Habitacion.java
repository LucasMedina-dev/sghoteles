package com.clases;


public class Habitacion {
    private String tipoHab; //true especial, false estandar, sino string
    private String numHab;
    private Integer montoDiario;
    private Estado estado;
    private Estadia estadia;
    private String nextIn;

    public Habitacion() {
    }

    
    public Habitacion(String tipoHab, String numHab) {
        this.tipoHab = tipoHab;
        this.numHab = numHab;
        if(tipoHab.equals("Estandar")){
            this.montoDiario=1000;
        }else{
            this.montoDiario=2000;
        }
        this.estado = Estado.libre;
        this.estadia = null;
    }
    
    public String getTipoHab() {
        return tipoHab;
    }

    public void setTipoHab(String tipoHab) {
        this.tipoHab = tipoHab;
    }

    public String getNumHab() {
        return numHab;
    }

    public void setNumHab(String numHab) {
        this.numHab = numHab;
    }

    public Integer getMontoDiario() {
        return montoDiario;
    }

    public void setMontoDiario(Integer montoDiario) {
        this.montoDiario = montoDiario;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estadia getEstadia() {
        return estadia;
    }

    public void setEstadia(Estadia estadia) {
        this.estadia = estadia;
    }
    
    public String getNextIn() {
        return nextIn;
    }

    public void setNextIn(String nextIn) {
        this.nextIn = nextIn;
    }
    
    
}
