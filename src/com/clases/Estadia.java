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
    private Date checkIn;
    private Date checkOut;
    private ArrayList<Factura> pagos;
    private ArrayList<Cargo> cargos;
    private String usuario;
    public Estadia(){
        
    }
    public Estadia(Cliente cliente, Date checkIn, Date checkOut, String usuario) {
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

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
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
