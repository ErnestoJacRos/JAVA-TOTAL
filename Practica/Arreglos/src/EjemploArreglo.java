
import java.util.Arrays;

public class EjemploArreglo {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(System.getProperty("user.dir"));
        int[] arreglo = {888,8,3,65,9,4,5,1,8,10,45,85,0,1,6,8};
        Arrays.sort(arreglo);//ordena por abecedario o por numero según el tipo de dato
        /**/
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.println("arreglo = " + arreglo[indice]);
        }
    }
}