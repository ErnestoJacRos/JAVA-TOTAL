package pruebas;

public class OperadorTernario {
    public static void main(String[] args) {
        int resultado = 3 < 5 ? 1 : 2;
        System.out.println("resultado = " + resultado);
        System.out.println(5 < 3 ? "es verdadero": "Es falso y chinga tu puta perra madre");
    }
}
