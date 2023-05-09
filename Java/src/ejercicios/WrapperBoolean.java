package ejercicios;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;
        boolean primitivoboolean = num1 > num2;
        Boolean objBoolean = Boolean.valueOf(primitivoboolean);
        Boolean objeBooleanDos = Boolean.valueOf("false");
        Boolean objBooleanTres = false;
        System.out.println("primitivoboolean = " + primitivoboolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objeBooleanDos = " + objeBooleanDos);


        /*Aquí veremos como el operador de igualdad no funciona como en los enteros numéricos el resultado
        * si usamos el operador de igualdad será true, al comparar estos objetos */

        System.out.println("comparando dos objetos boolean con operado de igualdad :  " + (objBoolean == objeBooleanDos) );
        /*Entonces podemos usar el operador de igualdad y el método equals() para saber el valor */

        System.out.println("Comparando dos objetos boolean con el método equals() : " + objBoolean.equals(objeBooleanDos));
        System.out.println("Comparando dos objetos boolean con el método equals() : " + objBoolean.equals(objeBooleanDos));




    }
}
