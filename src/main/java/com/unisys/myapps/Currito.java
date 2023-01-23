package com.unisys.myapps;

public class Currito extends Empleado{
    private String conveniocurrito;

    public String getConveniocurrito() {
        return conveniocurrito;
    }

    public void setConveniocurrito(String conveniocurrito) {
        this.conveniocurrito = conveniocurrito;
    }

    public Currito() {
        super();
        this.conveniocurrito = "";
    }

    public Currito(String nombre, String dni, long telefono, double sueldo, String cargo) {
        super(nombre, dni, telefono, sueldo, cargo);
        this.conveniocurrito = conveniocurrito;
    }

    @Override
    public String toString() {
        return "Currito{" +
                "nombre='" + getNombre() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", tlf='" + getTelefono() + '\'' +
                ", sueldo=" + getSueldo() +
                ", cargo='" + getCargo() + '\'' +
                ", conveniocurrito='" + conveniocurrito + '\'' +
                '}';
    }


}
