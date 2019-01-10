package classe.modificadordeacesso.modificadorprivate;
public class Main {
    public static void main(String[] args) {
        Conta c = new Conta();
        // proibe o acesso aos atributos privados por outra classe
        // c.saldo;
    }
}
