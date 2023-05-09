package test;

import com.ejacros.pooherencia.*;
public class TestHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("=== Creando la instancia de la claseAlumnoInter Alumno=== ");
        Alumno alumno = new Alumno("Ernesto", "Jacros", 13,"Instituto Nacional");
        alumno.setNotaEspanhol(5.3);
        alumno.setNotaMate(7.3);
        alumno.setNotaHisto(6.6);

        System.out.println("=== Creando la instancia de la claseAlumnoInter Alumno Internacional=== ");
        AlumnoInternacional alumnoInter = new AlumnoInternacional("Taris","Goslin", "Australia");
        alumnoInter.setEdad(15);
        alumnoInter.setInstituto("Intituto Nacional");
        alumnoInter.setNotaIdiomas(6.8);
        alumnoInter.setNotaEspanhol(6.2);
        alumnoInter.setNotaMate(5.8);
        alumnoInter.setNotaHisto(6.3);

        System.out.println("=== Creando la instancia de la claseAlumnoInter Profesor=== ");
        Profesor profesor =  new Profesor("Luci","Pérez","Matemáticas");

        imprimir(alumno);
        System.out.println();
        imprimir(alumnoInter);
        System.out.println();
        imprimir(profesor);





     }
     public static void imprimir(Persona persona){
         System.out.println("Imprimiendo datos en común del tipo Persona");
         System.out.println("Nombre: " + persona.getNombre()+
                 ", Apellido: " + persona.getApellido() +
                 ", Edad: " +  persona.getEdad() +
                 ", Email: " + persona.getEmial());
         if (persona instanceof Alumno){
             System.out.println("Imprimiendo los datos del tipo Alumno");
             System.out.println("Institución: " + ((Alumno)persona).getInstituto());
             System.out.println("Nota Matemáticas: " + ((Alumno)persona).getNotaMate());
             System.out.println("Nota Historia: " + ((Alumno)persona).getNotaHisto());
             System.out.println("Nota Español: " + ((Alumno)persona).getNotaEspanhol());
             if (persona instanceof AlumnoInternacional){
                 System.out.println("Imprimiendo los datos del tipo Alumno Internacional");
                 System.out.println("Nota Idiomas: " + ((AlumnoInternacional)persona).getNotaIdiomas());
                 System.out.println("País: " + ((AlumnoInternacional)persona).getPais());


             }
             System.out.println("==================sobre escritura de calcularPromedio=============");
             System.out.println("Promedio: " + ((Alumno)persona).calcularPromedio());

         }
         if (persona instanceof Profesor){
             System.out.println("Imprimiendo los datos del tipo Profesor");
             System.out.println("Asignatura " + ((Profesor)persona).getAsignatura());

         }
         System.out.println();
         System.out.println("===============override método saludar========== ");
         System.out.println(persona.saludar());
         System.out.println("==================================================");




     }
}
