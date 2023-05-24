/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import interfaces.Application;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class SystemManager {
    private List<Habitacion> habitaciones=new ArrayList<Habitacion>();
    
    
    
    public SystemManager(){
        File f = new File("path/habitaciones.dat");
        habitaciones.add(new Habitacion(true, 101));
        habitaciones.add(new Habitacion(true, 101));
        habitaciones.add(new Habitacion(true, 101));
        habitaciones.add(new Habitacion(true, 101));
        habitaciones.add(new Habitacion(true, 101));
        
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
}
