package com.unisys.myapps;

public class ProgramaEmpleados {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado("Perico","832382A",91456874,65.654,"Jefe gordo");

        emp1.setNombre("Maria");
        emp1.setDni("983456T");
        emp1.setTelefono(91234567);
        emp1.setSueldo(34.123);
        emp1.setCargo("Arquitecta");

        System.out.println(emp1);
        System.out.println(emp2);


    }
}
