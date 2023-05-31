/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lucas
 */

import com.clases.Caja;
import com.clases.Cliente;
import com.clases.Estadia;
import com.clases.Estado;
import com.clases.Factura;
import com.clases.Habitacion;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        // Fecha del sistema
        LocalDateTime fecha = LocalDateTime.now();
        
        // Colecciones
        HashMap<Integer,Habitacion> lh = new HashMap<>();
        ArrayList<Factura> fac = new ArrayList<>();
        ArrayList<Caja> caj = new ArrayList<>();
        
        Cliente c1 = new Cliente("Nicolas", "Vera",36780532, 155304499, "nicolas@rys.ar", "Napoles 4936", "Mar del Plata", "Argentino", "Masculino", 123);
        Estadia e1 = new Estadia(c1, fecha, fecha.plusDays(3), 7, "Nico");
        Habitacion h1 = new Habitacion(true,110);
        Factura f1 = new Factura(1001, 25000, "A", "Servicio a facturar", "nico");
        Caja caj1 = new Caja(fecha,f1);
        
        fac.add(f1);
        lh.put(h1.getNumHab(), h1);
        
        
        
        
        //bloquearHabitacion(lh, 110);
        //System.out.println(lh.get(110).getEstado());
        
        System.out.println(fecha.getDayOfWeek());
        fecha = cierreNocturno(fecha);
        System.out.println(fecha.getDayOfWeek());
        
        
    }
    
    public static void bloquearHabitacion(HashMap<Integer,Habitacion> lh,Integer numHab) throws IllegalArgumentException{
        try{
            if(lh.containsKey(numHab)){
                Habitacion h = lh.get(numHab);
                if(habitacionLibre(lh, numHab)){
                    h.setEstado(Estado.ocupada);
                    lh.replace(numHab, h);
                }else{
                    System.out.println("La habitacion NO esta libre");}
            }else{
                System.out.println("La habitacion no existe!");}
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static Boolean habitacionLibre(HashMap<Integer,Habitacion> lh,Integer numHab)throws IllegalArgumentException{
        Boolean flag = false;
        Habitacion h = null;
        try{
            if(lh.containsKey(numHab)){
                h = lh.get(numHab);
                if(h.getEstado().equals(Estado.libre)){
                flag = true;
                }
            }
        }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                }
        return flag;
    }
    
    public static LocalDateTime cierreNocturno(LocalDateTime date) throws IllegalArgumentException{
        LocalDateTime f = null;
        try{
            f = date.plusDays(1);    
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return f;
    }
    
    public static void cierraCaja(ArrayList<Caja> c,ArrayList<Factura> f)throws IllegalArgumentException{
        try{
            if(!f.isEmpty()){
                for(Factura fac : f){
                    c.add(new Caja(fac.getFecha(),fac));    
                }
                System.out.println(c);
                f.clear();
            }else{
                System.out.println("No hay registradas facturas");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    /*
    public static void mostrarCaja(ArrayList<Caja> lCaja){
        for(Caja c : lCaja){
            System.out.println(c.getString);}
    }
    */
    
}
