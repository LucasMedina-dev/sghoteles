package com.clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Estadia implements Serializable{
    private Cliente cliente;
    private String checkIn;
    private String checkOut;
    private ArrayList<Factura> pagos;
    private ArrayList<Cargo> cargos;
    private String usuario;
    private Integer montoDiario;
    public Estadia(){
        
    }
    public Estadia(Cliente cliente, String checkIn, String checkOut, String usuario, Integer montoDiario) {
        this.cliente = cliente;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.pagos = null;
        this.cargos = null;
        this.usuario = usuario;
        this.montoDiario=montoDiario;
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

    public Integer getMontoDiario() {
        return montoDiario;
    }

    public void setMontoDiario(Integer montoDiario) {
        this.montoDiario = montoDiario;
    }
    
    
    
}
