import java.time.LocalDate;
import java.time.LocalDateTime;

public class Factura {
    private int id;
    private LocalDate fecha;
    private Estadia estadia;
    private double total;

    public Factura(Estadia estadia) {
        this.estadia = estadia;

    }

    public Factura(int id, Estadia estadia) {
        this.id = id;
        this.fecha = LocalDate.now();
        this.estadia = estadia;
        this.total = estadia.getHabitacion().getPrecio() * estadia.getDiasAlojamiento();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estadia getEstadia() {
        return estadia;
    }

    public void setEstadia(Estadia estadia) {
        this.estadia = estadia;
    }


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", estadia=" + estadia +
                ", total=" + total +
                '}';
    }
}