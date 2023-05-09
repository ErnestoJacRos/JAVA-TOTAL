package com.ejacros.pooherencia;

public class Alumno extends Persona{
    private String instituto;
    private double notaMate;
    private double notaEspanhol;
    private double notaHisto;
///////////////////////////////////////////////////////////////////////////////////////////////////
    public Alumno(){

    }
    public Alumno(String nombre, String apellido){
        super(nombre,apellido);
        System.out.println("Alumno: inicializando constructor ");
    }

    public Alumno (String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String instituto){
        super(nombre,apellido,edad);
        this.instituto = instituto;
    }
    public Alumno(String nombre, String apellido, int edad, String instituto,
                  double notaEspanhol, double notaHisto, double notaMate){
        this(nombre,apellido,edad,instituto);
        this.notaEspanhol =  notaEspanhol;
        this.notaHisto = notaHisto;
        this.notaMate = notaMate;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////
public String getInstituto() {
    return this.instituto;
}

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public double getNotaMate() {
        return this.notaMate;
    }

    public void setNotaMate(double notaMate) {
        this.notaMate = notaMate;
    }

    public double getNotaEspanhol() {
        return this.notaEspanhol;
    }

    public void setNotaEspanhol(double notaEspanhol) {
        this.notaEspanhol = notaEspanhol;
    }

    public double getNotaHisto() {
        return this.notaHisto;
    }

    public void setNotaHisto(double notaHisto) {
        this.notaHisto = notaHisto;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    public double calcularPromedio(){
        System.out.println("calcularPRomedio: " + Alumno.class.getCanonicalName());
        return (this.notaMate + this.notaHisto + this.notaEspanhol) / 3;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar + " , soy un alumno y nombre es: " + this.getNombre();
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\ninstituto='" + instituto + '\'' +
                "\n, notaMate=" + notaMate +
                "\n, notaEspanhol=" + notaEspanhol +
                "\n, notaHisto=" + notaHisto;
    }
}
