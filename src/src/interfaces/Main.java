package interfaces;
public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(1234);
        System.out.println(g.autentica(1234));
    }
}
