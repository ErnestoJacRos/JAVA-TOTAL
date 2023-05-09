

public class TestAutomovilEnum {
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
        System.out.println();

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo subaru: " + tipo.getNombre());
        System.out.println("tipo desc. subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();

        switch (tipo){
            case CONVERTIBLE -> System.out.println("El automóvil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un auto pequeño de dos puertas y típicamente deportivo");
            case FURGON -> System.out.println("Es auto de utilera para empresas");
            case HATCHBACK -> System.out.println("Es auto mediano compacto, aspecto deportivo");
            case SEDAN -> System.out.println("Es uan auto normal");
            case PICKUP -> System.out.println("Camioneta de doble cabina ");
            case STATION_WAGON -> System.out.println("Auto mas grande con maletero grande");

        }

        TipoAutomovil[] tipos =  TipoAutomovil.values();//este método regresa un arreglo

        for (TipoAutomovil ta : tipos){
            System.out.print(ta + " => " + ta.name() + ", "+
                              ta.getNombre() + ", " +
                              ta.getNumeroPuertas() + ", "+
                              ta.getDescripcion() );
            System.out.println();
        }










    }
}
