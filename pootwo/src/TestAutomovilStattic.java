

public class TestAutomovilStattic {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(82);

        Automovil subaru =  new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.GOSOLINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        System.out.println();
        Automovil mazda =  new Automovil("Mazda", "BT-50");
        mazda.setMotor(new Motor(3.0,TipoMotor.DISIEL));
        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAutomovil.PICKUP);
       // mazda.setTanque(new Tanque());
        System.out.println();

        Automovil nissan = new Automovil("Nissa","Navra",
                Color.GRIS, new Motor(3.0,TipoMotor.DISIEL),new Tanque(60));
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissa","Navra",
                Color.GRIS, new Motor(3.0,TipoMotor.DISIEL),new Tanque(50));
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);



        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println();
        System.out.println("nissan.verDetalle() = " + nissan.verDetalle());
        System.out.println();
        System.out.println("nissan2.verDetalle() = " + nissan2.verDetalle());
        System.out.println();
        System.out.println("Kilometros por litro = " + Automovil.calcularConsumoEstatico(250,84));
        System.out.println(mazda.calcularConsumo(300,45));

        System.out.println(subaru.getTipo());







    }
}
