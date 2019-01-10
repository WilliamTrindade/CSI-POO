package metodo.semretorno;
class Conta {
    int numero;
    String titular;
    double saldo;
    
    void saca(double quantia) {
        this.saldo = this.saldo - quantia;
    }
    
    void deposita(double quantia) {
        this.saldo+=quantia;
    }
}

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = 1000;
        c1.titular = "William";
        c1.saldo = 100;
        c1.saca(50);
        c1.deposita(100);
        System.out.println(c1.saldo);
    }
}
