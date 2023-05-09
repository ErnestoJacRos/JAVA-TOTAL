public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if (args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1);

        }
        for (int indice = 0; indice < args.length; indice++) {
            System.out.println("Argumentos n° " + indice + ": " + args[indice]);
        }


    }
}
/* javac ArgumentosLineaComando.java "-encoding utf8" para poder ingresar acentos en consola */