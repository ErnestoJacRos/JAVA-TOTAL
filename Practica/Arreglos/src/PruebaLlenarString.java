import java.util.Arrays;
import java.util.Collections;

public class PruebaLlenarString {
    public static void main(String[] args) {
        String[] productos = {"rrrr", "ttttt", "aaaa", "zzzz"};
        Arrays.sort(productos);
        Collections.reverse(Arrays.asList(productos));
        for (int indice = 0; indice < productos.length; indice++) {
            System.out.println(productos[indice]);
        }
    }
}
