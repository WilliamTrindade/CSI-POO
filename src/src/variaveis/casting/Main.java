package variaveis.casting;
public class Main {
    public static void main(String[] args) {
        // double - int
        double pi = 3.14;
        int intpi = (int) pi;
        System.out.println(pi);
        System.out.println(intpi);
        
        // int - double
        int i =	5;
        double d2 = i;
        System.out.println(i);
        System.out.println(d2);
        
        // long - int
        long x = 100;
        int a = (int) x;
        System.out.println(x);
        System.out.println(a);
        
        // float - double
        double preco =  12.9;
        float novoPreco = (float) preco;
        System.out.println(preco);
        System.out.println(novoPreco);
    }
}
