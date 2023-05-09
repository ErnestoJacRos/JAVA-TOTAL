package tests;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,2,8);
        numeros.forEach(i ->{

            System.out.println("i = " + i);
        });
    }
}
