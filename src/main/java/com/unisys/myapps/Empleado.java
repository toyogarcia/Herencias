package com.unisys.myapps;

public class Empleado extends Persona{
    private long telefono;
    protected double sueldo;
    private String cargo;

    // Constructor sin parametros
    public Empleado() {
        super();
        this.telefono = 0;
        this.sueldo = 0.0;
        this.cargo = "";
    }

    // Constructor con parametros
    public Empleado(String nombre, String dni, long telefono, double sueldo, String cargo) {
        super(nombre, dni);
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

   public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", tlf='" + telefono + '\'' +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
