package classe;
class Conta {
    int numero;
    String titular;
    double saldo;
}

public class Main {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta(); // instanciar objeto
        minhaConta.numero = 12;
        minhaConta.titular = "William";
        minhaConta.saldo = 2000.00;
    }
}
