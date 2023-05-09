package practica;

public class EjemploMatriz {
    public static void main(String[] args) {
        for (int indice = 0; indice < 7; indice++) {
            for (int indice2 = 0; indice2 < 24; indice2++) {
                System.out.print(indice2 + "- ");
            }
            System.out.println();
        }
        
        int[][] numeros = new int[7][24];

        System.out.println("Tamaño de l matriz");
        System.out.print("Filas: " +numeros.length + " ");
        System.out.print("Columnas: "+numeros[0].length);
        System.out.println();
        System.out.println("prueba llenado");
        for (int indiceFlas = 0; indiceFlas < numeros.length; indiceFlas++) {
            for (int indiceCols = 0; indiceCols < numeros[0].length; indiceCols++) {
                numeros[indiceFlas][indiceCols] += indiceCols + 2;
            }
            System.out.println();
        }


        for (int indiceFlas = 0; indiceFlas < numeros.length; indiceFlas++) {
            for (int indiceCols = 0; indiceCols < numeros[0].length; indiceCols++) {
                System.out.print(numeros[indiceFlas][indiceCols] + " ");
            }
            System.out.println();
        }

        String[][] nombres = new String[3][2];
        nombres[0][0] = "Sara";
        System.out.println("indice 0,0 de la matriz: " + nombres[0][0]);
        String nombre = nombres[0][0];
        System.out.println("indice 0,0 de la matriz: " + nombre);


        int[][] nums = { {1, 2, 3, 4, 5, 6, 7}, {11, 22, 33, 44, 55, 66, 7} };
        System.out.println("Arreglo nums");
        for (int indiceFilas = 0; indiceFilas < nums.length; indiceFilas++) {
            for (int indiceDos = 0; indiceDos < nums[indiceFilas].length; indiceDos++) {
                System.out.print(nums[indiceFilas][indiceDos] + ", ");
            }
            System.out.println();
        }
    }
}
