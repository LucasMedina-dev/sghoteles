/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import interfaces.Application;
import interfaces.Login;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

//FILE
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Lucas
 */
public class SystemManager {

    

    
    public SystemManager(){
        
        
    }
    public static void crearReserva(Reserva r) throws IllegalArgumentException, JsonProcessingException { ///dividir en dos
        boolean hayConflictos = false;
        ArrayList<Reserva> totalReservas= getReservas(); 
        try {
            for (Reserva a : totalReservas) {
                if (a.getHabitacion().equals(r.getHabitacion())) {
                    if (r.getFechaEntrada().before(a.getFechaSalida()) && r.getFechaSalida().after(a.getFechaEntrada())) {
                        // Las fechas se superponen, hay conflicto
                        hayConflictos = true;
                        break;
                    }
                } else {
                    hayConflictos = false;
                }
            }
            if (hayConflictos) {
                System.out.println("La habitación ya está reservada para ese período.");
            }else {
                // Guardar la nueva reserva
                totalReservas.add(r);
                
                persistirLista(totalReservas, "src/json/reserva.json");
            }
            
        }catch (IllegalArgumentException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
    private static <T> void persistirLista(ArrayList<T> lista, String direccion){
        try{
            // Crear una instancia de ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Serializar el ArrayList a JSON
            String json = objectMapper.writeValueAsString(lista);
            
            // Guardar el JSON en un archivo
            File file = new File(direccion);
            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(json);
                //System.out.println("JSON guardado en el archivo.");
            }catch(IOException e){
                e.printStackTrace();
            }
        }catch(IOException e){
            System.out.println(e.getStackTrace());
        }
    }
    public static List<Habitacion> getHabitaciones() throws IOException{
        ArrayList<Habitacion> habitaciones= new ArrayList<>();        
        ArrayList<Reserva> reservas= new ArrayList<>();
        try{
            habitaciones= leerJson("src/json/habitaciones.json", Habitacion.class);
            reservas=leerJson("src/json/reserva.json", Reserva.class);
            for(Reserva r: reservas){
                for(Habitacion h : habitaciones){
                    if(r.getHabitacion().equals(h.getNumHab())){
                        h.setNextIn(r.getFechaEntrada());
                    }
                }
                
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        return habitaciones;
    }
    private static Date getNextInData(String habNum){
        ArrayList <Reserva> reservas= getReservas();
        Date nextInData=null;
        for(Reserva reserva : reservas){
            if(reserva.getHabitacion().equals(habNum)){
                nextInData= reserva.getFechaEntrada();
            }
        }
        
        return nextInData;
    }
    private static ArrayList<Reserva> getReservas() {
        ArrayList<Reserva> reservasArray = new ArrayList<>();

        try {
            ObjectMapper objectMapper = new ObjectMapper();

            // Leer el archivo JSON
            File file = new File("src/json/reserva.json");

            // Convertir el archivo JSON a un array de objetos Reserva
             reservasArray = objectMapper.readValue(file, new TypeReference<ArrayList<Reserva>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reservasArray;
    }
    
    public static void openLogin(){
        Login login= new Login();
        login.dispose();
        login.setUndecorated(true);
        login.setSize(600, 400);
        login.setVisible(true);
        
    }
    
    public static void openApplication() throws IOException{
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
    
    public static Reserva buscarReserva(int nroRes){
        ArrayList<Reserva> reservas=getReservas();
        Reserva reservaBuscada=null;
        try{
            for (Reserva res : reservas){
                if(res.getId().equals(nroRes)){
                    reservaBuscada=res;
                }
            }  
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }
        return reservaBuscada;
    } 
    public static boolean loguear(Usuario usuarioIngresado) throws IOException {
        String path= "src/json/usuarios.json";
        boolean validacion=false;
        ArrayList<Usuario> usuarios= leerJson(path, Usuario.class);
        validacion = validarUsuario(usuarios, usuarioIngresado);
       
        return true; // tiene que retornar validacion!!!!
    }
    public static boolean validarUsuario(ArrayList<Usuario> usuarios, Usuario uB){
        boolean validacion=false;
        for(Usuario u : usuarios){
            if(u.getUsuario().equals(uB.getUsuario()) && u.getPassword().equals(uB.getPassword())){
                validacion=true;
            }
        }
        return validacion;
    }
    public static <T> ArrayList<T> leerJson(String filePath, Class<T> clase) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Path data= Path.of(filePath);
        String json= Files.readString(data);

        ArrayList<T> list = jsonToArrayList(json, clase);
        return list;
    }
    public static <T> ArrayList<T> jsonToArrayList(String json, Class<T> clazz) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz));
    }
}
