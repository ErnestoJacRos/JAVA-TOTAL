import java.security.SecureRandom;

/*hacer que la diagonal de la matriz sea uno*/
public class EjemploMatrizMarco {
    public static void main(String[] args) {
        SecureRandom aleatorio = new SecureRandom();
        int[][] matriz = new int[5][5];
        for (int indice = 0; indice < matriz.length; indice++) {
            
            for (int indiceDos = 0; indiceDos < matriz[indice].length; indiceDos++) {
                matriz[indice][indiceDos] = aleatorio.nextInt(100);
                if (indice == 0 || indice == matriz.length-1
                    || indiceDos == 0 || indiceDos == matriz[indice].length-1
                || indice == indiceDos){
                    matriz[indice][indiceDos] = 1;
                }
                System.out.print(matriz[indice][indiceDos] + "\t");
            }
            System.out.println();
        }
    }
}
