package com.ejacros.poo.clases.abstractas.form;

import com.ejacros.poo.clases.abstractas.form.elementos.ElementoFrom;
import com.ejacros.poo.clases.abstractas.form.elementos.InputForm;
import com.ejacros.poo.clases.abstractas.form.elementos.SelectForm;
import com.ejacros.poo.clases.abstractas.form.elementos.TextareaForm;
import com.ejacros.poo.clases.abstractas.form.elementos.select.Opcion;

import java.util.Arrays;
import java.util.List;

public class TestForm {
    public static void main(String[] args) {
        /*las clases abstractas no se pueden, pero,
        * podemos usar una clase anónima de la clase y
        * no es reutilizable
        ElementoFrom el = new ElementoFrom() {
            @Override
            public String dibujarHtml() {
                return null;
            }
        };*/

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email =  new InputForm("email","email");
        InputForm edad =  new InputForm("edad","number");

        TextareaForm experiencia = new TextareaForm("exp",5,9);

        SelectForm lenguaje  = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2","python"))
        .addOpcion(new Opcion("3","JavaScript"))
        .addOpcion(new Opcion("4","TypeScript"))
        .addOpcion(new Opcion("5","PHP"));

        ElementoFrom saludar = new ElementoFrom() {
            @Override
            public String dibujarHtml() {
                return "<input disable name='"+
                        this.nombre+
                        "' value=\""+ this.valor+"\">" ;
            }
        };


        saludar.setValor("¡Hola, que tal, este campo esta deshabilitado! ");
        username.setValor("Ernesto.ja");
        password.setValor("1234");
        email.setValor("correo@dominio.com");
        edad.setValor("28");
        experiencia.setValor("más de 10 años de experiencia");

        java.setSelected(true);

        List<ElementoFrom> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);
       /* elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);*/
        /*for (ElementoFrom eF : elementos){
            System.out.println(eF.dibujarHtml());
        }*/

        elementos.forEach(i ->{
            System.out.println(i.dibujarHtml());
        });








    }
}
