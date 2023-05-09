public class EjemploMatrizBuscar {
    public static void main(String[] args) {
        int [][] matrizEnteros = {
                {45, 889, 1, 23},
                {10, 48, 120, 3},
                {1, 2, 3, 4}
        };

        int numeroABuscar = 4,
            indice,
            indiceDos = 0;
        boolean encontrado = false;
buscador:   for ( indice = 0 ; indice < matrizEnteros.length; indice++) {
                for (indiceDos = 0; indiceDos < matrizEnteros[indice].length; indiceDos++) {
                    if (matrizEnteros[indice][indiceDos] == numeroABuscar){
                        encontrado = true;
                    break buscador;
                     }
                 }
            }

            if (encontrado){
                System.out.println("Elemento: " + numeroABuscar + " fue encontrado en las coordenadas "+
                        indice + "," + indiceDos);
            }else {
                System.out.println("Elemento no encontrado");
            }
    }
}
