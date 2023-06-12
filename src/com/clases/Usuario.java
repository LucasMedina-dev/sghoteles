/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;
import java.util.HashMap;
/**
 *
 * @author Eva
 */
public class Usuario{
    
    private String usuario;
    private String password;

    public Usuario() {
    }

    
    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }    
    
}
