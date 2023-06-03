import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    private static int lastId = 1;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Cliente> miHashMap = new HashMap<>();

        Cliente c1 = new Cliente("34740499","Juan Perez","223454888","Juan@gmail.com");
        miHashMap.put(c1.getDni(), c1);

        Habitacion h1 = new Habitacion(101, Tipo.SIMPLE, false , 7500);
        Habitacion h2 = new Habitacion(102, Tipo.DOBLE, true , 12000);
        Habitacion h3 = new Habitacion(103, Tipo.TRIPLE, false , 15000);
        List<Habitacion> h = new ArrayList<>();
        h.add(h1);
        h.add(h2);
        h.add(h3);

        System.out.println();
        mostrarHabitacionesOcupadas(h);

        Cliente aBuscar = tomarDatos();

        if(!buscarCliente(aBuscar,miHashMap)){
            System.out.println("No esta en la base de datos. Se procede a darlo de alta");
            altaCliente(miHashMap,aBuscar);
            System.out.println(miHashMap);
        }else{
            System.out.println("ya esta dado de alta");
            System.out.println(miHashMap);
        }

        mostrarHabitacionesLibres(h);
        System.out.println("seleccione una habitacion");
        int num = scanner.nextInt();
        Habitacion hab = seleccionarHabitacion(h,num);

        System.out.println("cuantos dias se va a alojar?");
        int dias = scanner.nextInt();

        Estadia estadia = altaEstadia(aBuscar,dias,hab);
        System.out.println(estadia);

        Factura f = realizarfactura(estadia);

        System.out.println(f);


    }

    public static void mostrarHabitacionesLibres(List<Habitacion> habitaciones){
        System.out.println("Habitaciones libres:");
        for (Habitacion habitacion : habitaciones) {
            if (!habitacion.isOcupada()) {
                System.out.println("Habitación " + habitacion.getNumero() + " está libre");
            }
        }
    }

    public static void mostrarHabitacionesOcupadas(List<Habitacion> habitaciones){
        System.out.println("Habitaciones ocupadas:");
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.isOcupada()) {
                System.out.println("Habitación " + habitacion.getNumero() + " está ocupada");
            }
        }
    }

    public static Cliente tomarDatos(){
        Cliente c = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("cual es su dni?");
        c.setDni(scanner.nextLine());
        System.out.println("cual es su nombre?");
        c.setNombre(scanner.nextLine());
        System.out.println("cual es su mail?");
        c.setCorreo(scanner.nextLine());
        System.out.println("cual es su telefono?");
        c.setTelefono(scanner.nextLine());
        return c;
    }

    public static boolean buscarCliente(Cliente cliente, HashMap<String, Cliente> mapaClientes) {
        return mapaClientes.containsKey(cliente.getDni());
    }

    public static void altaCliente(HashMap<String, Cliente> mapa, Cliente cliente){
        mapa.put(cliente.getDni(), cliente);
    }

    public static Habitacion seleccionarHabitacion(List<Habitacion> h, int num) {
        Habitacion habitacionBuscada = null;

        for (Habitacion habitacion : h) {
            if (habitacion.getNumero() == num) {
                habitacionBuscada = habitacion;
                break;
            }
        }
        return habitacionBuscada;
    }

    public static Estadia altaEstadia(Cliente c, int dias, Habitacion h){
        Random random = new Random();
        int id = random.nextInt(10000-1+1);
        Estadia estadia = new Estadia(id,dias,c,h);
        h.setOcupada(true);
        return estadia;
    }

    public static Factura realizarfactura(Estadia estadia){
        Factura fact = new Factura(lastId++,estadia);
        return fact;
    }

}













