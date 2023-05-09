package Pruebas;

public class TestPersonaId {
    public static void main(String[] args) {
        PersonaConID ob = new PersonaConID();
        System.out.println("ob = " + ob);
        System.out.println();
        PersonaConID ob2 = new PersonaConID();
        System.out.println("ob2 = " + ob2);
        System.out.println();
        PersonaConID ob3 = new PersonaConID("Ernesto");
        System.out.println("ob3 = " + ob3);
        System.out.println();
        PersonaConID ob4 = new PersonaConID("Sara","Fernandez");
        System.out.println("ob4 = " + ob4);
        System.out.println();
        PersonaConID ob5 = new PersonaConID("Mónica","Alvama",29);
        System.out.println("ob5 = " + ob5);

    }

}
