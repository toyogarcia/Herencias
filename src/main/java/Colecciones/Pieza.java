package Colecciones;

public class Pieza {

    private static final long serialVersionUID = 1234567;
    private String nombre;
    private String tipoPieza;

    public Pieza() {
        this.nombre = "";
        this.tipoPieza = "";
    }

    public Pieza(String nombre, String tipoPieza) {
        this.nombre = nombre;
        this.tipoPieza = tipoPieza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoPieza() {
        return tipoPieza;
    }

    public void setTipoPieza(String tipoPieza) {
        this.tipoPieza = tipoPieza;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "nombre='" + nombre + '\'' +
                ", tipoPieza='" + tipoPieza + '\'' +
                '}';
    }
}
