/*
 * nao compila erros nas linhas B e D
 * A
*/
package quatro;

class A {
    
    public static void main(String[] args) {
        System.out.println(a(5));
    }
    public static int a(int l) {
        if(l < 10) return b(l); // A
        else return c(); // B
    }
    public static int b(int l) {
        if(l<10) return b(l); // C
        else return c(); // D
    }
    public static long c() {
        return 3;
    }
    
}
