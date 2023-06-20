package com.clases;

import com.fasterxml.jackson.core.JsonProcessingException;
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

import java.io.FileWriter;
import java.nio.file.Files;


//watcher
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;

import java.time.temporal.ChronoUnit;


public class SystemManager {

    
    
    public SystemManager(){
    }
    
    public static void ocuparHabitacion(Estadia estadia, String nroHab){
        ArrayList<Habitacion> habitaciones;
        
        try{
            habitaciones=leerJson("src/json/habitaciones.json", Habitacion.class);
            for(Habitacion h : habitaciones){
                if(h.getNumHab().equals(nroHab) && h.getEstado().equals(Estado.libre)){
                    h.setEstadia(estadia);
                    h.setEstado(Estado.ocupada);
                    //persistirLista(habitaciones, "src/json/habitaciones.json");
                    break;
                }
            }
            persistirLista(habitaciones, "src/json/habitaciones.json");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public static void crearCliente(Cliente cliente){
        ArrayList<Cliente> clientes= new ArrayList<>();
        boolean existe=false;
        try{
            try{
                clientes=leerJson("src/json/clientes.json", Cliente.class);
                for(Cliente c : clientes){
                    if(cliente.getDni().equals(c.getDni())){
                        existe=true;
                        c=cliente; // se actualiza si existe
                    }
                }
            }catch(Exception e){
                persistirLista(clientes, "src/json/clientes.json");
            }
            if(!existe){
                clientes.add(cliente); // se agrega si no existe
                try{
                    persistirLista(clientes, "src/json/clientes.json");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void reemplazarReserva(Reserva reemplazo, Integer id) {
        try{
            ArrayList<Reserva> reservas= leerJson("src/json/reserva.json", Reserva.class);
            int index=-1;
            for(Reserva r: reservas){
                if(r.getId().equals(id)){
                    //reemplazo la reserva
                    index=reservas.indexOf(r);
                    break;
                }
            }
            if(index!=-1){
                reservas.set(index, reemplazo);
            }
            
            persistirLista(reservas, "src/json/reserva.json");
        }catch(IOException e){
            
        }
    }
    public static void crearReserva(Reserva r) throws IllegalArgumentException, JsonProcessingException { ///dividir en dos
        boolean hayConflictos = false;
        ArrayList<Reserva> totalReservas= getReservas(); 
        try {
            for (Reserva a : totalReservas) {
                if (a.getHabitacion().equals(r.getHabitacion())) {
                    LocalDate inNew=LocalDate.parse(r.getFechaEntrada());
                    LocalDate outNew=LocalDate.parse(r.getFechaEntrada());
                    LocalDate inRes=LocalDate.parse(a.getFechaEntrada());
                    LocalDate outRes=LocalDate.parse(a.getFechaEntrada());
                    if (inNew.isBefore(inRes) && outNew.isAfter(outRes)) {
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
    public static <T> void persistirLista(ArrayList<T> lista, String direccion){
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
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static Estadia buscarEstadia(String nroHab) {
        Estadia est=null;
        ArrayList<Habitacion> habitaciones;
        try{
            habitaciones=leerJson("src/json/habitaciones.json", Habitacion.class);
            for(Habitacion h : habitaciones){
                if(h.getNumHab().equals(nroHab)){
                    est=h.getEstadia();
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return est;
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
                        System.out.println(r.getFechaEntrada());
                        h.setNextIn(r.getFechaEntrada());
                    }
                }
                
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        return habitaciones;
    }
    private static String getNextInData(String habNum){
        ArrayList <Reserva> reservas= getReservas();
        String nextInData=null;
        for(Reserva reserva : reservas){
            if(reserva.getHabitacion().equals(habNum)){
                nextInData= reserva.getFechaEntrada();
            }
        }
        
        return nextInData;
    }
    public static int calcularDiferenciaDias(LocalDate checkIn, LocalDate checkOut) {

        // Calcula la diferencia de días
        int diferencia = (int)ChronoUnit.DAYS.between(checkIn, checkOut);

        return diferencia;
    }
    private static ArrayList<Reserva> getReservas() {
        ArrayList<Reserva> reservas= new ArrayList<>();
        try {
             reservas= leerJson("src/json/reserva.json", Reserva.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reservas;
    }
    
    public static void openLogin(){
        Login login= new Login();
        login.dispose();
        login.setUndecorated(true);
        login.setSize(600, 400);
        login.setVisible(true);
        
    }
    
    public static void openApplication() throws IOException{
        try{
            Application app= new Application();
            app.dispose();
            app.setSize(800,700);
            app.setVisible(true);
        }catch(IOException e){
            throw e;
        }
        
    }
    
    public static void centerApp(JFrame frame){
        //Acomodado de aplicacion en centro de pantalla
        Dimension screenData=Toolkit.getDefaultToolkit().getScreenSize();
        int centerX=(int)screenData.getWidth()/2-(frame.getWidth()/2);
        int centerY=(int)screenData.getHeight()/2-(frame.getHeight()/2);
        frame.setLocation(centerX, centerY);
    }
    public static boolean usarReserva(Reserva reserva){
        boolean status=false;
        ArrayList<Reserva> reservasUsadas = new ArrayList<>();
        ArrayList<Reserva> reservas = new ArrayList<>();
        try {
            reservas = SystemManager.leerJson("src/json/reserva.json", Reserva.class);
            System.out.println("Antes de borrar" + reservas.size());
            borrarReserva(reservas, reserva); // Elimina la reserva del ArrayList original
            System.out.println("Despues de borrar" + reservas.size());
            
            
            reservasUsadas = SystemManager.leerJson("src/json/reservasUsadas.json", Reserva.class);
            reservasUsadas.add(reserva);
            SystemManager.persistirLista(reservas, "src/json/reserva.json"); // Actualizar el archivo JSON original
            SystemManager.persistirLista(reservasUsadas, "src/json/reservasUsadas.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    public static void borrarReserva(ArrayList<Reserva> reservas, Reserva reserva) {
        Reserva borrar=null;
        try{
            for(Reserva r : reservas){
                if(r.getId().equals(reserva.getId())){
                    borrar=r;
                }
            }
            reservas.remove(borrar);
        }catch(Exception e){
            e.printStackTrace();
        }
        
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
            e.printStackTrace();
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
        ArrayList<T> list = new ArrayList<>();
        File file= new File(filePath);
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            Path data= Path.of(filePath);
            String json= Files.readString(data);
            
            list = jsonToArrayList(json, clase);
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static <T> ArrayList<T> jsonToArrayList(String json, Class<T> clazz) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayList<T> lista=null;
        try{
            lista=objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz));
        }catch(Exception e){
            lista= new ArrayList<T>();
        }
        return lista;
    }

}
