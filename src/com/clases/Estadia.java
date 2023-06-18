/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lucas
 */
public class Estadia implements Serializable{
    private Cliente cliente;
    private String checkIn;
    private String checkOut;
    private ArrayList<Factura> pagos;
    private ArrayList<Cargo> cargos;
    private String usuario;
    public Estadia(){
        
    }
    public Estadia(Cliente cliente, String checkIn, String checkOut, String usuario) {
        this.cliente = cliente;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.pagos = null;
        this.cargos = null;
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
