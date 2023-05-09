public class AutoBoxing {
    public static void main(String[] args) {
        Integer[] enteros = {Integer.valueOf(1), 2, 2, 3, 4, 5, 6};
        /*lo que vemos arriba es la forma explícita de pasar un entero primitivo a Integer
        * que como hemos dicho no es necesario, ya que con el autoBoxing no es necesario hacerlo
        * y es lo que estamos viendo, lo que estamos haciendo es un boxing  */
            int total = 0;
        for (Integer entero : enteros) {

            if (entero.intValue() % 2 == 0){ //boxing innecesario
                total += entero.intValue(); //boxing innecesario
            }

        }

        System.out.println("Suma total de números pares = " + total);


    }
}
