import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String [] usernames =  new String[2];
        String [] passwords = new String[2];
        usernames[0] = "jacros";
        passwords [0] = "12345";
        usernames[1] = "luis";
        passwords [1]= "8284";
        Scanner entrada =  new Scanner(System.in);

        System.out.println("ingrese el  userName: ");
        String user = entrada.nextLine();
        System.out.println("ingrese el password: ");
        String pWord = entrada.nextLine();

        boolean esAutentificado = false;
        //recorre los arreglos
        for (int inidce = 0; inidce < usernames.length ; inidce++) {
                //
            if ( usernames[inidce] .equals(user) && passwords[inidce].equals(pWord) ){
                esAutentificado = true;
                break;
            }
        }



         if (esAutentificado){
             System.out.println("Bienvenido usario ".concat(user).concat("!"));
         }else {
             System.out.println(" el usuario o contrasenha son incorrecto");
             System.out.println(" lo siento requiere autentificacion");
         }

    }
}
