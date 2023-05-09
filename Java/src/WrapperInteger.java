public class WrapperInteger {
    public static void main(String[] args) {
        /*es la forma correcta de crear un objeto de la clase Integer de manera Explícita, aunque también
        * es innecesario hacerlo, a esto se le llama boxing y decimos que es innecesario porque
        * con la clase wrapper hace el autoboxing */
        Integer intObjeto = Integer.valueOf(4545);
        /*Toma un valor entero primitivo y lo convierte en un objeto */

        /*Y de manera implícita es el autoBoxing que toma el valor y lo convierte sin usar algún método*/

        Integer intObjetoDos = 4545;

        /*Sí queremos convertir un entero primitivo a un objeto o a un Integer usamos el método valueOf()*/

        int intPrimitivo = 4545;
        Integer intObjetoTres = Integer.valueOf(intPrimitivo);

        /*Ahora sí queremos convertir un Integer a un primitivo. Tenemos las dos formas la explícita y la implícita*/
        int num = intObjetoDos;//manera implícita
        int numDos = intObjetoDos.intValue(); //manera explícita


        /*Convertir un String a un integer */

        String valorTvLcd = "78000";
        Integer valor = Integer.valueOf(valorTvLcd);
        String valorIva = "10";
        Integer iva = Integer.parseInt(valorIva);


        System.out.println("suma: " + (valor + iva));
        int numero = Integer.parseInt("45456333");

    }
}
