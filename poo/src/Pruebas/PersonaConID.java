package Pruebas;

public class PersonaConID {
    private String nombre;
    private String apellido;
    private int edad;
    private int id;
    private static int ultimoId;


    public PersonaConID(){
        this.id = ++ultimoId;
    }

    public PersonaConID(String nombre) {
        this();
        this.nombre = nombre;
    }

    public PersonaConID(String nombre, String apellido) {
        this(nombre);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public PersonaConID(String nombre, String apellido, int edad) {
        this(nombre,apellido);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }



    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ObjetosConId{" +
                "\nid=" + id +
                "\nnombre='" + nombre + '\'' +
                "\napellido='" + apellido + '\'' +
                "\nedad=" + edad +
                '}';
    }
}
