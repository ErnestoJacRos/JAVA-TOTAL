public class PrimitivosCaracteres {
    public static void main(String[] args) {
        //carácter con unicode
        char cara;
        cara = '\u0040';
        System.out.println("carácter = " + cara);
        //carácter con decimal
        char decimal = 64;
        System.out.println("decimal = " + decimal);
        //imprime true o false dependiendo la comparación de las variables
        System.out.println("decimal = carácter:  " + (decimal == cara));
        //carácter con símbolo directamente
        char si = '@';
        System.out.println("símbolo = " + si);
        System.out.println("símbolo = carácter:  " + (si == cara));

        System.out.println("char corresponde  en byte a: " + Character.BYTES);
        System.out.println("char corresponde  en bites a: " + Character.SIZE);
        System.out.println("char valor max  en byte a: " + Character.MAX_VALUE);
        System.out.println("char valor min  en byte a: " + Character.MIN_VALUE);


        //Caracteres Especiales
        char espacio = ' ';
        char espacioUniCode = '\u0020';
        char backSpace = '\b';//retroceder un espacio quitando los caracteres que lo preceden
        char tabulador =  '\t';//tabulador normal
        char saltoLinea = '\n';
        char carro = '\r';
        //esta propiedad combina \n y \r
        //son variables de ambiente
        System.out.println("Propiedad de la clase System " + System.getProperty("line.separator"));
        //también podemos usar un método de la misma clase System
        System.out.println("Método de la clase System " + System.lineSeparator());

        long largo = 2832838330303L;
        System.out.printf("%d ", largo);
        System.out.println();
        float flotante = 36363636363F;
        System.out.printf("%f",flotante);
        System.out.println();
        double doble = 23883830393.223;
        System.out.printf("%f",doble);

    }
}
