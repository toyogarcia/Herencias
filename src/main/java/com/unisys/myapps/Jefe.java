package com.unisys.myapps;

public class Jefe extends Empleado{
    private double bonusjefe;

    public double getBonusjefe() {
        return bonusjefe;
    }

    public void setBonusjefe(double bonusjefe) {
        this.bonusjefe = bonusjefe;
    }

    public Jefe() {
        super();
        this.bonusjefe = 00.00;
    }

    public Jefe(String nombre, String dni, long telefono, double sueldo, String cargo) {
        super(nombre, dni, telefono, sueldo, cargo);
        this.bonusjefe = bonusjefe;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "nombre='" + getNombre() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", tlf='" + getTelefono() +
                // tengo acceso porque es protected y solo accesible desde clases del mismo paquete.
                ", sueldo=" + sueldo +
                ", cargo='" + getCargo() + '\'' +
                ", bonusjefe='" + bonusjefe + '\'' +
                '}';
    }
}
