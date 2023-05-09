package pruebas;

public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0] = new Estudiante("Ernesto", "Jacros", 32);
        estudiantes[1] = new Estudiante("Sara", "Hernández",30);
        estudiantes[2] = new Estudiante("Ale", "Alvama", 28);
        for (int indice = 0; indice < estudiantes.length; indice++) {
            System.out.println("estudiantes = " + estudiantes[indice].obtenerNombre());
        }

    }
}
