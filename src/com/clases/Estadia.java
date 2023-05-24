/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Lucas
 */
public class Estadia {
    private Cliente cliente;
    private String checkIn;
    private String checkOut;
    private Integer cochera;
    private ArrayList<Factura> pagos;
    private ArrayList<Cargo> cargos;
    private String usuario;

    public Estadia(Cliente cliente, String checkIn, String checkOut, Integer cochera, ArrayList<Factura> pagos, ArrayList<Cargo> cargos, String usuario) {
        this.cliente = cliente;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cochera = cochera;
        this.pagos = pagos;
        this.cargos = cargos;
        this.usuario = usuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
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
