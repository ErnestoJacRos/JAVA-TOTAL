public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        if (args.length != 3){
            System.err.println("por favor ingresar una operación (suma, resta, multi, div) y  " +
                    "Dos enteros");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.0;
        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        }catch (NumberFormatException e){
            System.err.println("Cuidado a y b deben de ser enteros");
            e.printStackTrace();
            System.exit(-1);
        }

        switch (operacion){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
            case "multi":
                resultado = a*b;
                break;
            case "div":
                if(b == 0){
                    System.out.println("No s epuede dividir entre Cero!");
                    System.exit(-1);
                }
                resultado = (double) a/b;
                break;
            default:
                System.out.println("no ingresaste una operación validad");
        }
        System.out.println("resultado = " + resultado);
    }
}
