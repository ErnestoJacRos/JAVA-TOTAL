public class EjemploMatrizTransponerMatriz {
    public static void main(String[] args) {
        int[][] a, b;
        a = new int[8][4];
        b = new int[4][8];
        for (int indice = 0; indice < a.length; indice++) {
            for (int indiceDos = 0; indiceDos < a[indice].length; indiceDos++) {
                a[indice][indiceDos] = indice + indiceDos * 3;
                System.out.print(a[indice][indiceDos] + "\t");
            }
            System.out.println();
        }

        for (int indice = 0; indice < a.length; indice++) {
            for (int indiceDos = 0; indiceDos < a[indice].length; indiceDos++) {
                b[indiceDos][indice] = a[indice][indiceDos];
            }
        }

        System.out.println("Matriz b transpuesta de a ");
        for (int indice = 0; indice < b.length; indice++) {
            for (int indiceDos = 0; indiceDos < b[indice].length; indiceDos++) {
                System.out.print(b[indice][indiceDos] + "\t");
            }
            System.out.println();
        }
    }
}
