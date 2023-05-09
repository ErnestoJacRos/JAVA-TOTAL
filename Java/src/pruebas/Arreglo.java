package pruebas;

public class Arreglo {
    public static void main(String[] args) {
        int [] arreglo = {2,3,4,5,6,-2,0,55};
        for (int indice = 0; arreglo[indice] > 0; indice++) {
            System.out.println(arreglo[indice]);
        }
        System.out.println("con while");
        int contador = 0;
        while (arreglo[contador] > 0){
            System.out.println(arreglo[contador]);
            contador ++;
        }
    }
}
