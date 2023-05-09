import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas,
                 claseHistoria,
                 claseLenguaje;
        Scanner entrada = new Scanner(System.in);
        System.out.println("cuantos Alumnos hay en curso");
        int numAlumnos = entrada.nextInt();
        claseMatematicas = new double[numAlumnos];
        claseHistoria = new double[numAlumnos];
        claseLenguaje = new double[numAlumnos];


        double totalMate = 0,
               totalHisto = 0,
               totalLengua = 0,
               promedioMate,
               promedioHisto,
               promedioLengua ;
        System.out.println("ingrese las " + numAlumnos + " calificaciones para Matemáticas");
        for (int indice = 0; indice < claseMatematicas.length; indice++) {
            claseMatematicas[indice] = entrada.nextDouble();
        }
        System.out.println();
        System.out.println("ingrese las " + numAlumnos + " calificaciones para Historia");
        for (int indice = 0; indice < claseHistoria.length; indice++) {
            claseHistoria[indice] = entrada.nextDouble();
        }
        System.out.println();
        System.out.println("ingrese las " + numAlumnos + " calificaciones para Lenguaje");
        for (int indice = 0; indice < claseLenguaje.length; indice++) {
            claseLenguaje[indice] = entrada.nextDouble();
        }

        for (int indice = 0; indice < numAlumnos; indice++) {
            totalMate += claseMatematicas[indice];
            totalHisto += claseHistoria[indice];
            totalLengua += claseLenguaje[indice];
        }
        promedioMate = totalMate / numAlumnos;
        promedioHisto = totalHisto / numAlumnos;
        promedioLengua = totalLengua / numAlumnos;
        System.out.println("promedio Matemáticas = " + promedioMate);
        System.out.println("promedio Historia = " + promedioHisto);
        System.out.println("promedio Lenguaje = " + promedioLengua);
        System.out.println("Promedio total del curso = " + (promedioMate + promedioHisto + promedioLengua) / 3);
        System.out.println();
        System.out.println("Ingrese el id del alumno que desea saber su promedio  del 0 al " + (numAlumnos - 1));
        int id = entrada.nextInt();
        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]) / 3;
        System.out.println("promedio del alumno requerido = " + promedioAlumno);
    }
}
