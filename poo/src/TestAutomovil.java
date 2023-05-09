import java.util.Date;

public class TestAutomovil {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Toyota","corolla");
        Automovil auto2 = new Automovil("Kia","Sorento");
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);
        System.out.println("¿Son objetos iguales? " + auto1.equals(fecha));
        System.out.println();
        auto1.setFabricante("Ford");
        auto1.setCilindrada(2.0);
        auto1.setModelo("Fiesta");
        auto1.setColor(Color.BLANCO);

        System.out.println(auto1.verDetalle());
        System.out.println( auto1.acelerarFrenar(3000));
        /*Sobre carga de métodos */
        System.out.println("Kilómetros por litro: " + auto1.calcularConsumo(300,0.75f));
        System.out.println("Kilómetros por litro: " + auto1.calcularConsumo(300,75));

        /*Segundo objeto o instancia*/
        System.out.println("\nSegundo Automóvil");
        auto2.setFabricante("Honda");
        auto2.setCilindrada(3.0);
        auto2.setModelo("Civic");
        auto2.setColor(Color.GRIS);
        auto2.setCapacidadTanque(80);

        System.out.println(auto2.verDetalle());
        System.out.println(auto2.acelerarFrenar(6000));
        System.out.println("Kilómetros por litro: " + auto2.calcularConsumo(800,85));

        System.out.println("\nTercer Automóvil ");
        Automovil auto3 = new Automovil("Mercedes","Clase A");
        establecerDetalles(auto3,"Nissan",1.05,"Tusru",Color.BLANCO,60);
        System.out.println(auto3.verDetalle());

        Automovil auto4 = new Automovil("BMW","Z4");
        System.out.println(auto4);

        System.out.println(auto4.verDetalle());
        System.out.println();
        System.out.println("Prueba de impresión ");
        /*con el método toString */
        System.out.println(auto1);

        Automovil auto5 = new Automovil();
        System.out.println("Son autos iguales: " + auto5.equals(auto4));


    }

    public static void establecerDetalles(Automovil auto, String fabricante, double cilindrada, String modelo, Color color,
    int capacidadTanque){
        System.out.println("\nAutomóvil");
        auto.setFabricante(fabricante);
        auto.setCilindrada(cilindrada);
        auto.setModelo(modelo);
        auto.setColor(color);
        auto.setCapacidadTanque(capacidadTanque);


    }
}