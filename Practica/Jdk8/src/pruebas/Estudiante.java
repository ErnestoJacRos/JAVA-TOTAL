package pruebas;

public class Estudiante {
    //atributos
    private String nombre;
    private String apellido;
    private Integer edad;

    public Estudiante(String nombre, String apellido, Integer edad){
        this.nombre = nombre;
        this.apellido = apellido;
        if (edad > 0 ){
            this.edad = edad;
        }
    }

    public void establecerNombre(String nombre){
         this.nombre = nombre;
    }
    public String obtenerNombre(){
        return this.nombre;
    }

    public void establecerApellido(String apellido){
        this.apellido = apellido;
    }
    public String obtenerApellido(){
        return this.apellido;
    }

    public void establecerEdad(Integer edad){
        if (edad > 0){
            this.edad = edad;
        }
    }
    public Integer obtenerEdad(){
        return this.edad;
    }





}
