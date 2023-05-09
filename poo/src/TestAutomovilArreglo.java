import java.util.Arrays;

public class TestAutomovilArreglo {
    public static void main(String[] args) {



        Persona conductorSubaru = new Persona("Luci","Martínez");
        AutomovilDos subaru = new AutomovilDos("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);


        Persona conductorMazda = new Persona("Ernesto", "Jacros");
        AutomovilDos mazda = new AutomovilDos("Mazda","BT-50",Color.ROJO
                ,new Motor(2.5, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.CONVERTIBLE);
        mazda.setTanque(new Tanque());
        mazda.setConductor(conductorMazda);


        Persona conductorNissan = new Persona("Pato", "Rodroguez");
        AutomovilDos nissan = new AutomovilDos("Nissan", "Navara", Color.GRIS,
                new Motor(3.0, TipoMotor.DIESEL), new Tanque(50));
        nissan.setConductor(conductorNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);


        Persona conductorSuzuki = new Persona("Bea","Gonzales");
        AutomovilDos suzuki = new AutomovilDos("Suzuki", "Vitara", Color.GRIS,
                new Motor(1.6, TipoMotor.GASOLINA), new Tanque(50));
        suzuki.setConductor(conductorSuzuki);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);

        Persona conductorAudi =  new Persona("Jano","Pérez");
        AutomovilDos audi = new AutomovilDos("Audi", "A3", Color.GRIS,
                new Motor(3.0,TipoMotor.GASOLINA),new Tanque());
        audi.setConductor(conductorAudi);
        audi.setTipo(TipoAutomovil.SEDAN);

        AutomovilDos[] autos = new AutomovilDos[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;
        Arrays.sort(autos);
        for (int undice = 0; undice < autos.length; undice++) {
            System.out.println("autos = " + autos[undice]);
        }


    }


}