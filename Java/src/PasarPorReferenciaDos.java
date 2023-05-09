
class Persona{
    //Atributos
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }
    public void modificarNombre(String nombre){
        this.nombre = nombre;
    }

    public String obtenerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferenciaDos {
    public static void main(String[] args) {

    Persona persona1 = new Persona("Ernesto");
    Persona persona2 = new Persona("Jacros");

    mostrarNombre(persona1);
    mostrarNombre(persona2);

    }

    public static void mostrarNombre(Persona persona){

        System.out.println(persona.obtenerNombre());
    }
}
