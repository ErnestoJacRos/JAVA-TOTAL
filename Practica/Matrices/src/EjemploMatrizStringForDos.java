public class EjemploMatrizStringForDos {
    public static void main(String[] args) {
        String[][] nombres = { {"Sara", "Ernesto"}, {"Ale", "Mónica"}, {"Salma", "Carolina"} };
        System.out.println("Arreglo con ForEach");

        for (String[] fila : nombres){
            for (String cols : fila){
                System.out.print(cols + ", ");
            }
            System.out.println();
        }

    }
}
