public class PrimitivosFloat {
    public static int enteroTres;
    public static void main(String[] args) {
        float realFloat = 1.5e4f; // 15000 recorre ka coma 4 lugares a la derecha
        System.out.println("realFloat = " + realFloat);
        float realFloatDos = 2.12e3f;// 2120
        System.out.println("realFloatDos = " + realFloatDos);
        float realFloatNegativo = 1.5e-10f;
        System.out.println("realFloatNegativo = " + realFloatNegativo);
        float realFloatNegativoDos = 0.00000000015f;
        System.out.println("realFloatNegativoDos = " + realFloatNegativoDos);
        System.out.println();
        System.out.println("Tipo float corresponde en byte a: " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a: " + Float.SIZE);
        System.out.println("Valor Máximo de float es: " + Float.MAX_VALUE);
        System.out.println("Valor Mínimo  de float es: " + Float.MIN_VALUE);
        System.out.println();

        double numeroDouble = 3.38347840449404043333333333234567885433345678895445234444444445555555555555555555555566665;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Tipo double corresponde en byte a: " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a: " + Double.SIZE);
        System.out.println("Valor Máximo de double es: " + Double.MAX_VALUE);
        System.out.println("Valor Mínimo  de double es: " + Double.MIN_VALUE);
        System.out.println();

        var numeroFlotante = 31416;
        System.out.println("numeroFlotante = " + numeroFlotante);

        float numeroFloat = 3.1416F;
        System.out.println("numeroFloat = " + numeroFloat);
        /*
        * Valores por defecto de los tipos primitivos del tipo "Entero" y "Float"
        * Enteros = 0
        * Flotantes = 0.0
        * */
        /*
         * siempre qe una variable sea local de un método debe inicializar
         * si queremos imprimirla o usarla y para visualizar el valor por defecto
         * solo aplica en variables de clase o variables de instancia (atributo) */
        int numeroEnteroDos = 23;
        System.out.println("numeroEnteroDos = " + numeroEnteroDos);
        System.out.println("enteroTres = " + enteroTres);
        /*
        * la variable numeroEnteroDos si la imprimimos sin inicializarla habrá un error y no podremos ver el valor
        * por defecto a menos que sea una variable de instancia y si la imprimimos podremos visualizar el valor predeterminado*/

    }
}
