/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
/**
 *
 * @author Eva
 */

public class Reserva implements Serializable{

    private Integer id;
    private String habitacion;
    private String tipoHab;
    private String fechaEntrada;
    private String fechaSalida;
    private String nombre;
    private String apellido;
    private String telefono;

    public Reserva() {
    }
    
   
    
    public Reserva(Integer id, String habitacion, String tipoHab, String fechaEntrada, String fechaSalida, String nombre, String apellido, String telefono) {
        this.id = id;
        this.habitacion = habitacion;
        this.tipoHab = tipoHab;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoHab() {
        return tipoHab;
    }

    public void setTipoHab(String tipoHab) {
        this.tipoHab = tipoHab;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", habitacion=" + habitacion + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + '}';
    }



    
}
