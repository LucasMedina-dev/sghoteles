/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import interfaces.Application;
import interfaces.Login;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class SystemManager {
    public SystemManager(){
        
        
    }

    public static List<Habitacion> getHabitaciones(){
        List<Habitacion> habitaciones=new ArrayList<Habitacion>();
        
        
        
        habitaciones.add(new Habitacion(true, "101", getNextInData("101")));
        
        return habitaciones;
    }
    private static LocalDate getNextInData(String habNum){
        List <Reserva> reservas= getReservas();
        LocalDate nextInData=null;
        for(Reserva reserva : reservas){
            if(reserva.getHabitacion().equals(habNum)){
                nextInData= reserva.getFechaEntrada();
            }
        }
        
        return nextInData;
    }
    private static ArrayList<Reserva> getReservas(){
        ArrayList<Reserva> reservas= new ArrayList<Reserva>();
        reservas.add(new Reserva(1, "101", LocalDate.now(), LocalDate.now(), "Lucas", "Medina", 4713981));
        // Abro el archivo de reservas, busco la siguiente reserva de cada habitacion, las retorno en una lista
        return reservas;
    }
    
    
    
    public static void openLogin(){
        Login login= new Login();
        login.dispose();
        login.setUndecorated(true);
        login.setSize(600, 400);
        login.setVisible(true);
        
    }
    
    public static void openApplication(){
        Application app= new Application();
        app.dispose();
        app.setSize(800,700);
        app.setVisible(true);
        
    }
    
    public static void centerApp(JFrame frame){
        //Acomodado de aplicacion en centro de pantalla
        Dimension screenData=Toolkit.getDefaultToolkit().getScreenSize();
        int centerX=(int)screenData.getWidth()/2-(frame.getWidth()/2);
        int centerY=(int)screenData.getHeight()/2-(frame.getHeight()/2);
        frame.setLocation(centerX, centerY);
    }
    
    private static void writeHab(Habitacion hab){
//        String HAB_DIR="src/database/habDB.db";
//       try{
//           ObjectOutputStream filereadHab=new ObjectOutputStream(HAB_DIR);
//           
//           
//       }catch(IOException e){
//           e.printStackTrace();
//       }
//       return
    }
    
    private void endData(FileInputStream input){
//        boolean existsData=true;
//        int byteRead;
//        try{
//            while(existsData){
//                byteRead= input.read();
//                if(byteRead==-1){
//                    existsData=false;
//                }
//            }
//            
//        }catch(IOException e){
//            e.printStackTrace();
//        }finally{
//            input.close();
//        }
//        return 0;
    }
    
    
    
}
