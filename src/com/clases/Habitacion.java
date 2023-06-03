/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class Habitacion {
    private boolean tipoHab; //true especial, false estandar, sino string
    private String numHab;
    private Integer montoDiario;
    private Estado estado;
    private Estadia estadia;
    private LocalDate nextIn;

    public Habitacion(boolean tipoHab, String numHab, LocalDate resNextIn) {
        this.tipoHab = tipoHab;
        this.numHab = numHab;
        if(tipoHab==false){
            this.montoDiario=1000;
        }else{
            this.montoDiario=2000;
        }
        this.estado = Estado.libre;
        this.estadia = null;
        this.nextIn= resNextIn;
    }
    
    public boolean isTipoHab() {
        return tipoHab;
    }

    public void setTipoHab(boolean tipoHab) {
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

    public LocalDate getNextIn() {
        return nextIn;
    }
    
    
}
