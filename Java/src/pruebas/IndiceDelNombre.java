package pruebas;

public class IndiceDelNombre {
    public static void main(String[] args) {
        String[] nombres = {"Marcos", "Laura", "Mónica", "Javier", "Camila", "Martha", "Darío", "Emiliano", "Melisa"};

        for (int indice = 0; indice < nombres.length ; indice++) {
            System.out.println("el nombre " + nombres[indice] + " se ecuentra en el ídice: " + indice);
        }
    }
}
