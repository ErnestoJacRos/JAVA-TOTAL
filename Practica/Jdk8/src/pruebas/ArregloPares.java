package pruebas;

public class ArregloPares {
    public static void main(String[] args) {
        Double [] arregloFlotante = {1d, 2d, 3d, 4d, 5d, 6d, 9.5};
        double [] arregloDos = new double[arregloFlotante.length];
        int contador = 0;
       tag: for (int indice = 0; indice < arregloFlotante.length; indice++) {
            contador++;
            if (arregloFlotante[indice] % 2 == 0){
                for (int indiceDos = 0; indiceDos < contador; indiceDos++) {
                    arregloDos[indiceDos] = arregloFlotante[indice];
                        break tag;
                }
            }
        }

        for (int indice = 0; indice < arregloDos.length; indice++) {
            System.out.println(arregloDos[indice]);
        }
    }
}
