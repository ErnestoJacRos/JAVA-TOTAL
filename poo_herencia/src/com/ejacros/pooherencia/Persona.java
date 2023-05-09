package com.ejacros.pooherencia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String emial;
///////////////////////////////////////////////////////////////////////////////////////////////////
    public Persona(){
        System.out.println("Persona: inicializando constructor");
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public  Persona(String nombre, String apellido, int edad){
        this(nombre,apellido);
        this.edad = edad;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////

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

    public String getEmial() {
        return this.emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////
    public String saludar(){
        return "Hola que tal ";
    }
///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return
                "nombre='" + nombre +
                "\n, apellido ='" + apellido +
                "\n, edad =" + edad +
                "\n, emial ='" + emial +
                "\n, saludar = " + this.saludar();
    }
}
