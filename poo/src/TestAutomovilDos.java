import java.util.Date;

public class TestAutomovilDos {
    public static void main(String[] args) {
        AutomovilDos subaru = new AutomovilDos("Subaru","Impreza");
        AutomovilDos auto2 = new AutomovilDos("Kia","Sorento");
        Motor motorSubaru = new Motor(2.0,TipoMotor.GASOLINA);
        System.out.println();
        subaru.setMotor(motorSubaru);
        subaru.setModelo("Fiesta");
        subaru.setColor(Color.BLANCO);

        System.out.println(subaru.verDetalle());
        System.out.println( subaru.acelerarFrenar(3000));
        /*Asi resolvemos el null Exception */
       // subaru.setTanque(new Tanque());
        /*Sobre carga de métodos */

        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300,0.75f));
        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300,75));

        /*Segundo objeto o instancia*/
        System.out.println("\nSegundo Automóvil");
        auto2.setFabricante("Honda");
        auto2.setMotor(new Motor(3.0,TipoMotor.DIESEL));
        auto2.setModelo("Civic");
        auto2.setColor(Color.GRIS);
        auto2.setTanque(new Tanque());//por defecto va a tener 40 por la condicion del constructor

        System.out.println(auto2.verDetalle());
        System.out.println(auto2.acelerarFrenar(6000));
        System.out.println("Kilómetros por litro: " + auto2.calcularConsumo(800,85));

        System.out.println("\nTercer Automóvil ");
        Automovil auto3 = new Automovil("Mercedes","Clase A");

        System.out.println(auto3.verDetalle());

        Automovil auto4 = new Automovil("BMW","Z4");
        System.out.println(auto4);

        System.out.println(auto4.verDetalle());
        System.out.println();
        System.out.println("Prueba de impresión ");
        /*con el método toString */
        System.out.println(subaru);

        Automovil auto5 = new Automovil();
        System.out.println("Son autos iguales: " + auto5.equals(auto4));


    }


}