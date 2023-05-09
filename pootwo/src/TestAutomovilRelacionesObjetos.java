

public class TestAutomovilRelacionesObjetos {
    public static void main(String[] args) {


        Persona conductorSubaru = new Persona("Lucy","Martínez");
        Automovil subaru =  new Automovil("Subaru","Impreza");
        subaru.setConductor(conductorSubaru);
        subaru.setMotor(new Motor(2.0,TipoMotor.GOSOLINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        Rueda[] ruedaSub = new Rueda[5];
        for (int indice = 0; indice < ruedaSub.length ; indice++) {
            subaru.addRueda(new Rueda("Yakohama",16,7.5));
        }
       // subaru.setRuedas(ruedaSub);

        System.out.println();
        Persona pato = new Persona("Pato", "Rodríguez");
        Automovil mazda =  new Automovil("Mazda", "BT-50");
        mazda.setMotor(new Motor(3.0,TipoMotor.DISIEL));
        mazda.setConductor(pato);
        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setTanque(new Tanque());
        Rueda[] ruedasMazda = new Rueda[5];
        for (int indice = 0; indice < ruedasMazda.length ; indice++) {
            mazda.addRueda(new Rueda("Prelli",20,11.5));
        }
       // mazda.setRuedas(ruedasMazda);
        System.out.println();



        Persona bea = new Persona("Bea","González");
        Automovil nissan = new Automovil("Nissa","Navra",
                Color.GRIS, new Motor(3.0,TipoMotor.DISIEL),new Tanque(60));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);
       // nissan.setRuedas(ruedasNissan);
        nissan.addRueda(new Rueda("Pirelli",20,11.5))
        .addRueda(new Rueda("Pirelli",20,11.5))
        .addRueda(new Rueda("Pirelli",20,11.5))
        .addRueda(new Rueda("Pirelli",20,11.5))
        .addRueda(new Rueda("Pirelli",20,11.5))
        .addRueda(new Rueda("Pirelli",20,11.5));

        Rueda[] ruedasNissan2 = new Rueda[5];
        for (int indice = 0; indice < ruedasNissan2.length ; indice++) {
            ruedasNissan2[indice] = new Rueda("Pirreli",20,11.5);
        }
        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissa","Navra",
                Color.GRIS, new Motor(3.0,TipoMotor.DISIEL),new Tanque(50),lalo, null);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);
        nissan2.setRuedas(ruedasNissan2);



        System.out.println(subaru.verDetalle());
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println();
        System.out.println(nissan.verDetalle());
        System.out.println();
        System.out.println(nissan2.verDetalle());
        System.out.println();


       /* System.out.println("Conductor de subaru: " + subaru.getConductor());
        System.out.println("Ruedas subaru: ");
        for (Rueda r : subaru.getRuedas()){
            System.out.println(r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho() );
        }*/






    }
}
