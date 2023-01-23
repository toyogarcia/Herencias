package casas;

public class CasasApp {
    public static void main(String[] args) {
        //casa
        Casa casa = new Casa();
        System.out.println(casa);

        //piso
        Piso piso = new Piso();
        System.out.println(piso);

        // Chalet
        Chalet chalet = new Chalet();
        System.out.println(chalet);

        chalet.setDireccion("Madrid");
        chalet.setMetrosCuadrados(120.0F);
        chalet.setPlantas(2);
        System.out.println(chalet);

        chalet = new Chalet("Madrid", 120F, 2);
        System.out.println(chalet);

        Piso piso2 = new Piso();
        System.out.println(piso2);

        Piso piso3 = new Piso("Madrid", 120F, 6);
        System.out.println(piso3);

        ChaletDeLujo chaletDeLujo = new ChaletDeLujo();
        System.out.println(chaletDeLujo);
        chaletDeLujo = new ChaletDeLujo("Madrid", 120.0F, 2, 5);
        System.out.println(chaletDeLujo);

    }
}
