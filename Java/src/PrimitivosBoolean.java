public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;

        //accededemos a la constante de clare wrad del primitivo
        boolean dataoLogicodos = Boolean.FALSE.booleanValue();
        System.out.println("dataoLogicodos = " + dataoLogicodos);

        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3;//98.76543
        System.out.println("d = " + d);

        float  f = 1.2345e2f;//123.45
        System.out.println("f = " + f);

        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);

        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);
    }
}
