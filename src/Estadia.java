import java.time.LocalDate;
import java.time.LocalDateTime;

public class Estadia {
    private int id;
    private LocalDate fechaInicio;
    private long diasAlojamiento;
    private LocalDate fechaFin;
    private Cliente cliente;
    private Habitacion habitacion;

    public Estadia() {
    }

    public Estadia(int id, long dias, Cliente cliente, Habitacion habitacion) {
        this.id = id;
        this.fechaInicio = LocalDate.now();
        this.diasAlojamiento = dias;
        this.fechaFin = fechaInicio.plusDays(diasAlojamiento);
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public long getDiasAlojamiento() {
        return diasAlojamiento;
    }

    public void setDiasAlojamiento(long diasAlojamiento) {
        this.diasAlojamiento = diasAlojamiento;
    }

    @Override
    public String toString() {
        return "Estadia{" +
                "id=" + id +
                ", fechaInicio=" + fechaInicio +
                ", diasAlojamiento=" + diasAlojamiento +
                ", fechaFin=" + fechaFin +
                ", cliente=" + cliente +
                ", habitacion=" + habitacion +
                '}';
    }
}
