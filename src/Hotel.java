import java.util.List;

public class Hotel {

    List<Habitacion> habitaciones;

    public Hotel(List h) {
        this.habitaciones = h;
    }

    public void mostrarHabitacionesLibres() {
        System.out.println("Habitaciones libres:");
        for (Habitacion habitacion : habitaciones) {
            if (!habitacion.isOcupada()) {
                System.out.println("Habitación " + habitacion.getNumero() + " está libre");
            }
        }
    }


}