package test;

import com.ejacros.pooherencia.Alumno;
import com.ejacros.pooherencia.AlumnoInternacional;
import com.ejacros.pooherencia.Persona;
import com.ejacros.pooherencia.Profesor;

public class TestHerencia {
    public static void main(String[] args) {

        System.out.println("=== Creando la instancia de la claseAlumnoInter Alumno=== ");

        Alumno alumno = new Alumno();
        alumno.setNombre("Ernesto");
        alumno.setApellido("Jacros");
        alumno.setInstituto("Instituto Nacional");
        alumno.setNotaEspanhol(5.3);
        alumno.setNotaMate(7.3);
        alumno.setNotaHisto(6.6);

        System.out.println("=== Creando la instancia de la claseAlumnoInter Alumno Internacional=== ");


        AlumnoInternacional alumnoInter = new AlumnoInternacional();
        alumnoInter.setNombre("Taris");
        alumnoInter.setApellido("Goslin");
        alumnoInter.setPais("Australia");
        alumnoInter.setEdad(15);
        alumnoInter.setInstituto("Intituto Nacional");
        alumnoInter.setNotaIdiomas(6.8);
        alumnoInter.setNotaEspanhol(6.2);
        alumnoInter.setNotaMate(5.8);
        alumnoInter.setNotaHisto(6.3);

        System.out.println("=== Creando la instancia de la claseAlumnoInter Profesor=== ");

        Profesor profesor =  new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getNombre()+ " " + alumno.getApellido() +
              " " +  alumno.getInstituto());
        System.out.println(alumnoInter.getNombre() + " "+ alumnoInter.getApellido()
        + " " + alumnoInter.getInstituto() + " " + alumnoInter.getPais());

        System.out.println("Profesor " + profesor.getAsignatura() + ": "
        + profesor.getNombre() + " " + profesor.getApellido());


    Class clase = alumnoInter.getClass();
    while (clase.getSuperclass() != null){
        String hija = clase.getName();
        String padre = clase.getSuperclass().getName();
        System.out.println(hija + " es una clase hija de la clase padre " + padre);
        clase = clase.getSuperclass();

    }
     }
}
