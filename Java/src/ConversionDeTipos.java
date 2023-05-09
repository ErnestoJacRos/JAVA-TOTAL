public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroEntero = Integer.parseInt(numeroStr);
        System.out.println("numeroEntero = " + numeroEntero);

        String numeroReal = "3883830.34e-3";
        double numerorealDouble = Double.parseDouble(numeroReal);
        System.out.println("numerorealDouble = " + numerorealDouble);

        String logicoStr = "true";
        boolean numeroBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("numeroBoolean = " + numeroBoolean);

        //Anteriormente se convirtio de un tipo String a un tipo Primitivo
        //Ahora se convertira cualquier primitivo a un tipo String
        int otroNumeroEntero = 100;
        System.out.println("otroNumeroEntero = " + otroNumeroEntero);
        //llama al metodo toString y pide un argumento de tipo entero para convertirlo en tipo String
        String otroNumeroStr = Integer.toString(otroNumeroEntero);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        //otra forma de convertir ese entero aun String es la siguiente
        otroNumeroStr = String.valueOf(otroNumeroEntero);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroNumeroRealDouble = 1.23456e2;
        String  otroNumeroRealStr = Double.toString(otroNumeroRealDouble);
        System.out.println("otroNumeroRealStr = " + otroNumeroRealStr);
        //llamando a la clase String con el metodo valueOf
        otroNumeroRealStr = String.valueOf(otroNumeroRealDouble);
        System.out.println("otroNumeroRealStr = " + otroNumeroRealStr);

        //Conversion entre tipos Primitivos
        //casteo es la conversion de un tipo a otro
        //el casteo solo se puede hacer entre tipos numericos
        int i = 22678;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        float f = (float) i;
        System.out.println("f = " + f);
        char c = (char) i;
        System.out.println("c = " + c);



    }
}
