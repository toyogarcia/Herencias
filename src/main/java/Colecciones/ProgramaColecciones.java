package Colecciones;

public class ProgramaColecciones {
    public static void main(String[] args) {

        Pieza pieza1 = new Pieza("HITACHI","SSD Disk");
        Ordenador ordenador1 = new Ordenador();
        ordenador1.setMarca("DELL");
        ordenador1.setModelo("X70A234");
        ordenador1.setPieza(pieza1);

        System.out.println(ordenador1);
        System.out.println(ordenador1.getPieza().getNombre());


    }
}
