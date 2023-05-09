public class OperadoresIncrementales {
    public static void main(String[] args) {
    //Pre incremento
        System.out.println("Pre incremento");
        int i = 1;
        System.out.println("i = " + i);
    int j = ++i;
        System.out.println("i = " + i);//aqui ya no es el valor
        System.out.println("j = " + j);// un pre incremento incrementa la variable después la usa

        // post incremento
        System.out.println("Post incremento");
        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        System.out.println("Pre decremento");
        i = 2;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post decremento
        System.out.println("Post Decremento");
        i = 3;
        j = i --;
        System.out.println("i = " + i);
        System.out.println("j = " + j);



    }
}
