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
    HashMap<String,String> login;

    public Usuario(String usuario, String password, HashMap<String, String> login) {
        this.usuario = usuario;
        this.password = password;
        this.login = login;
    }
   
    
}
