public class TestAutomovilEnumDos {
    public static void main(String[] args) {
        AutomovilDos subaru = new AutomovilDos("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        AutomovilDos mazda = new AutomovilDos("Mazda","BT-50",Color.ROJO,new Motor(2.0,TipoMotor.GASOLINA));
        System.out.println("mazda = " + mazda.getFabricante());
        mazda.setTipo(TipoAutomovil.CONVERTIBLE);

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo subaru: " + tipo.getNombre());
        System.out.println("tipo desc. subaru: " + tipo.getDescripcion());
            tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE ->
                    System.out.println("El Automóvil es deportivo y descapotable" +
                    "\nde dos puertas");
            case COUPE ->
                    System.out.println("Es un auto pequeño de dos puertas y típicamente " +
                    "\ndeportivo");
            case FURGON ->
                    System.out.println("Es un automóvil utilitario de transporte, de empresas");
            case HATCHBACK ->
                    System.out.println("Es un Automóvil mediano compacto, aspecto deportivo");
            case PICKUP ->
                    System.out.println("Es Automóvil de doble cabina o camioneta");
            case SEDAN ->
                    System.out.println("Es un automóvil mediano");
            case STATION_WAGON ->
                    System.out.println("es un automóvil más grande con maleta grande");

        }
        System.out.println();
        /*para iterar un Enum con fer each */
        /*el método values() retorna un array del Enum*/
        TipoAutomovil[] tipoA = TipoAutomovil.values();
        for (TipoAutomovil atm : tipoA){
            /*System.out.print(atm + " => " + atm.name() + ", " + atm.getNombre() + ", " + atm.getDescripcion() +
                    ", " + atm.getPuertas());
            System.out.println();*/
            System.out.println(atm  + atm.name());
        }



    }


}