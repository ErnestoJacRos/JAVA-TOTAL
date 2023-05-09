package ejercicios;


import java.util.Scanner;

public class OperadorTernarioLogin {
    public static void main(String[] args) {
        String [] usernames = {"ernesto","andres","sahara"};
        String [] paswords = {"123","1234","12345"};

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el username");
        String user = entrada.nextLine();
        System.out.println("ingrese el password");
        String passWord = entrada.nextLine();
        boolean esAutentificado = false;

        for (int indice = 0; indice < usernames.length ; indice++) {
            esAutentificado = usernames[indice].equals(user) && paswords[indice].equals(passWord) ? true:esAutentificado;
        }

        String mensaje = esAutentificado?"Bienvenido usario ".concat(user).concat("!"):
                "Lo sentimos, la contraseña o el usario son inocrrecto";
        System.out.println("mensaje = " + mensaje);

    }
}
