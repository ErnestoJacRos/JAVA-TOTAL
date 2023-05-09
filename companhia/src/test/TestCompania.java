package test;

import com.ejacros.compania.Gerente;

public class TestCompania {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Sara","jacros","sja-2484","México",
                12,85000,790000);
        gerente.aumentarRemuneracion(12);
        gerente.setPresupuesto(800000);
        System.out.println(gerente);
    }
}
