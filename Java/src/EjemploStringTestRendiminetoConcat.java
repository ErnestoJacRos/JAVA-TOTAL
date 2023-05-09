public class EjemploStringTestRendiminetoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
        //    c =  c.concat(a).concat(b).concat("\n");// 500 veces => 7 milisegundo con 1000 se tarda 11 milisegundos
            //c += a + b + "\n";// con 500 => 46 milisegunods con 1000 => 56 milisegundos
            /*donde StringBuilder si es mutable entonces no crea un nuevo objetos y para concatenar son metodos encadenados */
            sb.append(a).append(b).append("\n");//con 500 y 1000 se tardoo 0 milisegundos eso quiere decir que es mas efeciente que las
            //otras formas
        }
        long fin =  System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
