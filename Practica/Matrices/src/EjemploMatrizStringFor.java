public class EjemploMatrizStringFor {
    public static void main(String[] args) {
        String[][] nombres = new String[3][2];
        nombres[0][0] = "Sara";
        nombres[0][1] = "Ernesto";
        nombres[1][0] = "Ale";
        nombres[1][1] = "Monica";
        nombres[2][0] = "Salma";
        nombres[2][1] = "Carolina";

        for (int indice = 0; indice < nombres.length; indice++) {
            for (int indiceDos = 0; indiceDos < nombres[indice].length ; indiceDos++) {
                System.out.print(nombres[indice][indiceDos] + ", ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Arreglo con ForEach");

        for (String[] fila : nombres){
            for (String cols : fila){
                System.out.print(cols + ", ");
            }
            System.out.println();
        }

    }
}
