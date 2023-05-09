import java.util.Arrays;

public class TestAutomovilArreglo {
    public static void main(String[] args) {


        Persona conductorSubaru = new Persona("Lucy","Martínez");
        Automovil subaru =  new Automovil("Subaru","Impreza");
        subaru.setConductor(conductorSubaru);
        subaru.setMotor(new Motor(2.0,TipoMotor.GOSOLINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);


        System.out.println();
        Persona pato = new Persona("Pato", "Rodríguez");
        Automovil mazda =  new Automovil("Mazda", "BT-50");
        mazda.setMotor(new Motor(3.0,TipoMotor.DISIEL));
        mazda.setConductor(pato);
        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setTanque(new Tanque());
        System.out.println();



        Persona bea = new Persona("Bea","González");
        Automovil nissan = new Automovil("Nissa","Navra",
                Color.GRIS, new Motor(3.0,TipoMotor.DISIEL),new Tanque(60));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);


        Persona lalo = new Persona("Lalo", "Mena");
        Automovil suzuki = new Automovil("Suzuki","Viatra",
                Color.GRIS, new Motor(3.0,TipoMotor.DISIEL),new Tanque(50));
        suzuki.setConductor(lalo);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);

        Automovil audi = new Automovil("Audi","A3");
        audi.setConductor(new Persona("Juan","Pérez"));


        Automovil[] autos = new Automovil[5];
        autos[0]  = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;
        Arrays.sort(autos);
        for (int indice = 0; indice < autos.length; indice++) {
            System.out.println(autos[indice]);
        }










    }
}
