package practica;

public class Comparate {
    public static void main(String[] args) {
        for (int indice = 0; indice <5 ; indice++) {
            for (int indiceDos = 0; indiceDos <= 24; indiceDos++) {
                System.out.print("@");
            }
            System.out.println();
        }

        String letra = "abecedario";
        String letrasDos = "aaaaaaaaaaaa";
        System.out.println(letra.compareTo(letrasDos));

        Integer numero = 17;
        Integer numeroDos = 16;
        System.out.println("método compareTo() con Integers = " + numero.compareTo(numeroDos));
    }
}
