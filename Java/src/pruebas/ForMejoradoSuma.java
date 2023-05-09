package pruebas;

public class ForMejoradoSuma {
    public static void main(String[] args) {
       int [] arreglo = {1,4,5,2,3,4,1,5,2,3,3,5,2,1,1,3,4,5,3,2,3,4,5,4,4,4,4};
       int total = 0;
       for( int indice : arreglo){
           System.out.print(" " + indice );
           total+=indice;

       }
        System.out.println();
        System.out.println("total = " + total);

    }
}
