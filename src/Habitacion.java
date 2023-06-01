public class Habitacion {
    private int numero;
    private Tipo tipo;
    private boolean ocupada;
    private double precio;

    public Habitacion() {
    }

    public Habitacion(int numero, Tipo tipo, boolean ocupada, double precio) {
        this.numero = numero;
        this.tipo = tipo   ;
        this.ocupada = ocupada;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", tipo=" + tipo +
                ", ocupada=" + ocupada +
                ", precio=" + precio +
                '}';
    }
}
