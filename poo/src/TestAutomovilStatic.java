public class TestAutomovilStatic {
    public static void main(String[] args) {
        Automovil subaro = new Automovil("Subaru", "Impreza");
        subaro.setCilindrada(2.0);
        subaro.setColor(Color.BLANCO);
        subaro.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,3.0);
        System.out.println("mazda = " + mazda.getFabricante());
        mazda.setTipo(TipoAutomovil.CONVERTIBLE);

        /*Aquí nos damos cuenta de que si modificamos la variable de clase o sea la estática, modifica
        *todos los demás objetos que hacen uso de esta variable. Porque le pertenece a la clase
        * y no al objeto, incluso podemos modificar esa variable estática por medio del objeto auto.colorPatente
        * y aun si cambiara aquí lo estamos usando sin modificador de acceso
        * Automóvil.colorPatente = "Morado"; pero debe ser con él, por eso debe ser prívate y tener sus
        * respectivos métodos get amd set, pero, estáticos */

        /*no hacemos referencia a ningún objeto sino directamente al nombre de la clase */
        Automovil.setColorPatente(Color.ROJO);


        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        Automovil auto = new Automovil();

        System.out.println("subaro = " + subaro.verDetalle());
        System.out.println();
        System.out.println("Mazda = " + mazda.verDetalle());
        System.out.println();
        System.out.println("nissan = " + nissan.verDetalle());
        System.out.println();
        System.out.println("nissan2 = " + nissan2.verDetalle());

        /*y para imprimir de la misma forma no se hace referencia a ningún objeto sino a lo misma clase*/
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());

        Automovil.setCapacidadTanqueEstatico(80);
        /*llamando al método estático con nombre la clase y seguido del método*/
        System.out.println("Kilómetros por litro = " + Automovil.calcularConsumoEstatico(800,65));

        System.out.println("Automovil.VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Automovil.VELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);

    }


}