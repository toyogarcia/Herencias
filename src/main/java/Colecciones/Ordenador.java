package Colecciones;

import java.io.Serializable;

public class Ordenador implements Serializable {
    private static final long serialVersionUID = 1234567L;
    private String marca;
    private String modelo;
    private Pieza pieza;


    public Ordenador() {
        this.marca = "";
        this.modelo = "";
        this.pieza = new Pieza();
    }

    public Ordenador(String marca, String modelo, Pieza pieza) {
        this.marca = marca;
        this.modelo = modelo;
        this.pieza = new Pieza();
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pieza=" + pieza +
                '}';
    }
}
