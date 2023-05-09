package com.jacros.app.jardin;

import com.jacros.app.hogar.*;
import static com.jacros.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona =  new Persona();
        persona.setNombre("Andrés");
        System.out.println(persona.getNombre());

        Perro perro  = new Perro();
        perro.nombre = "Chente";
        perro.raza = "Bulldog francés";

        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);


        String generoMasculino = GENERO_MASCULINO;


    }
}
