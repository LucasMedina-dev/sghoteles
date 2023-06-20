package com.clases;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable{
    private String email;
    private String domicilio;
    private String ciudad;
    private String nacionalidad;
   
    public Cliente(){

    }
    public Cliente(String nombre, String apellido, String telefono, String documento) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.dni=documento;
    }
    public Cliente(String nombre, String apellido, String dni, String telefono, String email, String domicilio, String ciudad, String nacionalidad) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.telefono=telefono;
        this.email = email;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.nacionalidad = nacionalidad;
    }

    //Region gettersSetters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //EndRegion
    
    
    
    
    

}
