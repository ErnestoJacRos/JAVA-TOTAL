

public class TestAutomovilRelacionesObjeto {
    public static void main(String[] args) {



        Persona conductorSubaru = new Persona("Luci","Martínez");
        AutomovilDos subaru = new AutomovilDos("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSubaru);

        Rueda[] ruedasSubaru = new Rueda[5];
        for (int indice = 0; indice < ruedasSubaru.length; indice++) {
            subaru.addRueda( new Rueda("Yakohame",16,7.5));
        }




        Persona conductorMazda = new Persona("Ernesto", "Jacros");
        AutomovilDos mazda = new AutomovilDos("Mazda","BT-50",Color.ROJO
                ,new Motor(2.5, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.CONVERTIBLE);
        mazda.setTanque(new Tanque());
        mazda.setConductor(conductorMazda);
        //mazda.setRuedas(ruedasMazda);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());
        Rueda[] ruedasMazda = new Rueda[5];
        for (int indice = 0; indice < ruedasMazda.length; indice++) {
            mazda.addRueda( new Rueda("Michelin",18,10.5));
        }



        Rueda[] ruedasNissan = new Rueda[5];
        for (int indice = 0; indice < ruedasNissan.length; indice++) {
            ruedasNissan[indice]  = new Rueda("Perelli",20 , 11.5);
        }
        Persona conductorNissan = new Persona("Pato", "Rodroguez");
        AutomovilDos nissan = new AutomovilDos("Nissan", "Navara", Color.GRIS,
                new Motor(3.0, TipoMotor.DIESEL), new Tanque(50),conductorNissan, ruedasNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);


        Rueda[] ruedasNissan2 = new Rueda[5];
        for (int indice = 0; indice < ruedasNissan.length; indice++) {
            ruedasNissan[indice]  = new Rueda("Perelli",20 , 11.5);
        }

        Persona conductorNissan2 = new Persona("Bea","Gonzales");
        AutomovilDos nissan2 = new AutomovilDos("Nissan", "Navara", Color.GRIS,
                new Motor(3.5,TipoMotor.GASOLINA), new Tanque(50));
        nissan2.setConductor(conductorNissan2);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        /*para encadenar los métodos vamos a modificar el método addRueda() devolviendo la isntacnia misma*/
        nissan2.addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5));



        System.out.println("subaru = " + subaru.verDetalle());
        System.out.println();
        System.out.println("Mazda = " + mazda.verDetalle());
        System.out.println();
        System.out.println("nissan = " + nissan.verDetalle());
        System.out.println();
        System.out.println("nissan2 = " + nissan2.verDetalle());

        System.out.println("Conductor de Subaru : " + subaru.getConductor());
        System.out.println("Ruedas Subaru: ");

        for(Rueda r : subaru.getRuedas()){
            System.out.println("Fabricante: "+ r.getFabricante() +
                    ", Aro: " + r.getAro() + ", Ancho: " + r.getAncho());
        }
        System.out.println();

        for(Rueda r : mazda.getRuedas()){
            System.out.println("Fabricante: "+ r.getFabricante() +
                    ", Aro: " + r.getAro() + ", Ancho: " + r.getAncho());
        }

        System.out.println();
        for(Rueda r : nissan2.getRuedas()){
            System.out.println("Fabricante: "+ r.getFabricante() +
                    ", Aro: " + r.getAro() + ", Ancho: " + r.getAncho());
        }

    }


}