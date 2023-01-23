package main;

import com.unisys.myapps.Currito;
import com.unisys.myapps.Empleado;
import com.unisys.myapps.Jefe;

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

        Currito curr1 = new Currito();
        curr1.setNombre("PepeCurrante");
        curr1.setDni("U834543");
        curr1.setTelefono(91876543);
        curr1.setSueldo(200.22);
        curr1.setCargo("PicaLadrillo");
        curr1.setConveniocurrito("Convenio del Metal");

        System.out.println(curr1);

        curr1.setSueldo(100.20);
        System.out.println(curr1.getSueldo());

        Jefe jefe1 = new Jefe();
        jefe1.setNombre("Master");
        jefe1.setDni("M456543");
        jefe1.setTelefono(91222222);
        jefe1.setSueldo(60000.22);
        jefe1.setCargo("CalientaSillas");
        jefe1.setBonusjefe(4000.30);

        System.out.println(jefe1);

        jefe1.setNombre("Master2");
        System.out.println(jefe1);
        System.out.println(jefe1.getNombre());

        jefe1.setSueldo(80000.88);
        System.out.println(jefe1.getSueldo());

    }
}
