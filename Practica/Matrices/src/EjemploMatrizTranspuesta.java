public class EjemploMatrizTranspuesta {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Matriz Original");
        for (int indice = 0; indice < matriz.length; indice++) {
            for (int indiceDos = 0; indiceDos < matriz[indice].length; indiceDos++) {
                System.out.print(matriz[indice][indiceDos] + "\t");
            }
            System.out.println();
        }

        int aux;
        for (int indice = 0; indice < matriz.length; indice++) {
            for (int indiceDos = 0; indiceDos < indice; indiceDos++) {
                    aux = matriz[indice][indiceDos];
                matriz[indice][indiceDos] = matriz[indiceDos][indice];
                matriz[indiceDos][indice] = aux;
            }
        }

        System.out.println();
        System.out.println("Matriz Transpuesta");
        for (int indice = 0; indice < matriz.length; indice++) {
            for (int indiceDos = 0; indiceDos < matriz[indice].length; indiceDos++) {
                System.out.print(matriz[indice][indiceDos] + "\t");
            }
            System.out.println();


        }
    }

}
