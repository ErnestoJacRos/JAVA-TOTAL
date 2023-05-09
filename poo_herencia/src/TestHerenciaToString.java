import com.ejacros.pooherencia.Alumno;
import com.ejacros.pooherencia.AlumnoInternacional;
import com.ejacros.pooherencia.Persona;
import com.ejacros.pooherencia.Profesor;

public class TestHerenciaToString {
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
         System.out.println(persona);
     }
}
