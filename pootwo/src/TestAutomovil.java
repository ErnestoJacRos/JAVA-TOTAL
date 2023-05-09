import java.util.Date;

public class TestAutomovil {
    public static void main(String[] args) {

        Date fecha = new Date();

        Automovil subaru =  new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.GOSOLINA));
        subaru.setTanque(new Tanque(60));
        subaru.setColor(Color.BLANCO);

        System.out.println();
        Automovil mazda =  new Automovil("Mazda", "BT-50");
        mazda.setMotor(new Motor(3.0,TipoMotor.DISIEL));
        mazda.setColor(Color.ROJO);
        System.out.println();

        Automovil nissan = new Automovil("Nissa","Navra",Color.GRIS,
                new Motor(3.0,TipoMotor.DISIEL),new Tanque(60));
        Automovil nissan2 = new Automovil("Nissa","Navra",Color.GRIS,
                new Motor(3.0,TipoMotor.DISIEL),new Tanque(50));
        System.out.println("¿Son iguales? = " + (nissan == nissan2));
        Automovil auto = new Automovil();

        System.out.println("¿Son iguales con método override equals()? = " + nissan.equals(fecha));
        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println();
        System.out.println("nissan.verDetalle() = " + nissan.verDetalle());
        System.out.println();


        System.out.println("Kilómetros por litro de " + subaru.getModelo() + " : " + subaru.calcularConsumo(300,0.6f));
        System.out.println("Kilómetros por litro de : " + subaru.calcularConsumo(300,60));
        System.out.println("Kilómetros por litro de " + nissan.getModelo() + " : " +nissan.calcularConsumo(300,60));







    }
}
