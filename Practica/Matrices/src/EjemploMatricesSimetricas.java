public class EjemploMatricesSimetricas {
    public static void main(String[] args) {
        boolean simetrica = true;
        int indice, indiceDos;
        int[][] matriz =  {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };
        buscador: for (indice = 0; indice < matriz.length ; indice++) {
            /*en el segundo for solo vamos a iterar la mitad de la matriz para saber si realmente
            * es simétrica y para eso estamos optimizado est aparta la solo recorrer la mitad  */
            for (indiceDos = 0; indiceDos < indice; indiceDos++) {
                    if (matriz[indice][indiceDos] != matriz[indiceDos][indice]){
                        simetrica = false;
                        break buscador;
                    }
            }
        }

        if (simetrica){
            System.out.println("La matriz es simétrica ");
        }else {
            System.out.println("La matriz no es simétrica");
        }

    }
}
