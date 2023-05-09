import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema " + varEnv);

        /*pasamos por argumento en el método el nombre de la variable de ambiente*/

        String userName = System.getenv("USERNAME");
        System.out.println("userName variable de ambiente = " + userName);
        System.out.println("Java Home variable de ambiente = " + System.getenv("JAVA_HOME"));

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("PATH");
        System.out.println("path con Mayúsculas  = " + path);
        System.out.println("-------------Listando variables de entorno del sistema----------------");
        for (String key : varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }

    }
}
