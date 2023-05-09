package com.ejacros.pooherencia;

public class AlumnoInternacional extends Alumno {
    private String pais;
    private double notaIdiomas;
///////////////////////////////////////////////////////////////////////////////////////////////////////////
    public AlumnoInternacional(){
        System.out.println("AlumnoInternacional: inicializando constructor...");
    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }
    public AlumnoInternacional(String nombre, String apellido, String pais){
        super(nombre, apellido);
        this.pais = pais;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return this.notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String saludar() {
        return super.saludar() + ", soy extrajero del país " + this.getPais();
    }

    @Override
    public double calcularPromedio() {
        System.out.println("calcularPRomedio: " + AlumnoInternacional.class.getCanonicalName());
        return (( super.calcularPromedio() * 3)) / 4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npais='" + pais + '\'' +
                "\n, notaIdiomas=" + notaIdiomas;
    }
}
