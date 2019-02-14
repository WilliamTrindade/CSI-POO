package java.lang.math;

/**
 *
 * A classe Math tem métodos estáticos que fazem operações com números
 */
//import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        double preco = 4.5;
        long i = Math.round(preco);
        
        int x = -4;
        int y = Math.abs(x);
        
        // Com o import da Math podemos usar os métodos
        //double a = 5.5;
        //int nota = (int) round(a);
        System.out.println(i);
    }
}
