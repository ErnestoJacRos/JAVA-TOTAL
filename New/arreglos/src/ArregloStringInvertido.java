import java.util.Arrays;
import java.util.Collections;

public class ArregloStringInvertido {
    public static void main(String[] args) {
        String[] paises = {"Honduras", "Salvador", "México", "Australia",
        "Peru", "Brasil", "Irlanda", "Francia", "España"};
        Arrays.sort(paises);
        Collections.reverse(Arrays.asList(paises));
        for (String pais : paises){
            System.out.println("pais = " + pais);

        }

    }
}
