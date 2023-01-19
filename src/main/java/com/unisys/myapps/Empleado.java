package com.unisys.myapps;
public class Empleado {
    private String nombre;
    private String dni;
    private long telefono;
    private double sueldo;
    private String cargo;

    // Constructor sin parametros
    public Empleado() {
        this.nombre = "";
        this.dni = "";
        this.telefono = 0;
        this.sueldo = 0;
        this.cargo = "";
    }
    public Empleado(String nombre, String dni, long telefono, double sueldo, String cargo) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
}
