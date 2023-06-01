import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Cliente> miHashMap = new HashMap<>();

        Cliente c1 = new Cliente("34740499","Juan Perez","223454888","Juan@gmail.com");
        miHashMap.put(c1.getDni(), c1);

        Habitacion h1 = new Habitacion(101, Tipo.SIMPLE, false , 7500);
        List<Habitacion> h = new ArrayList<>();
        h.add(h1);

        Hotel hotel = new Hotel(h);

        System.out.println("cual es su dni?");
        String dni = scanner.nextLine();

        Cliente clienteBuscado = miHashMap.get(dni);

        if (clienteBuscado != null) {
            System.out.println("Cliente encontrado: " + clienteBuscado.getNombre());
        } else {
            System.out.println("Cliente no encontrado");
        }

        hotel.mostrarHabitacionesLibres();


        System.out.println("seleccione una habitacion");
        int num = scanner.nextInt();


        Habitacion habitacionBuscada = null;
        for (Habitacion habitacion : h) {
            if (habitacion.getNumero() == num) {
                habitacionBuscada = habitacion;
                break;
            }
        }

        if (habitacionBuscada != null) {
            System.out.println("Habitación encontrada: " + habitacionBuscada);
        } else {
            System.out.println("Habitación no encontrada");
        }

        System.out.println("cuantos dias se quedara?");
        int dias = scanner.nextInt();

        Estadia estadia = new Estadia(1,dias,clienteBuscado,habitacionBuscada);

        Factura factura = new Factura(1,estadia);

    }
}











