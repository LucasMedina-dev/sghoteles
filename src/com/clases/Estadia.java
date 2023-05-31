/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Lucas
 */
public class Estadia {
    private Cliente cliente;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private Integer cochera;
    private ArrayList<Factura> pagos;
    private ArrayList<Cargo> cargos;
    private String usuario;

    public Estadia(Cliente cliente, LocalDateTime checkIn, LocalDateTime checkOut, Integer cochera, String usuario) {
        this.cliente = cliente;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cochera = cochera;
        this.pagos = new ArrayList<>();
        this.cargos = new ArrayList<>();
        this.usuario = usuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

   

    public Integer getCochera() {
        return cochera;
    }

    public void setCochera(Integer cochera) {
        this.cochera = cochera;
    }

    public ArrayList<Factura> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<Factura> pagos) {
        this.pagos = pagos;
    }

    public ArrayList<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(ArrayList<Cargo> cargos) {
        this.cargos = cargos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
}
