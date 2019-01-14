package transferirdadosentreclasses;
class Conta {
    int numero;
    String titular;
    double saldo;
    
    boolean saca(double valor) {
        if(this.saldo < valor) {
            return false;
        }else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
    void deposita(double quantia) {
        this.saldo+=quantia;
    }
    // tranfere valores entre classes
    boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if(retirou == true){
            destino.deposita(valor);
            return true;
        }else {
            return false;
        }
    }
}
public class Main {
    public static void main(String[] args) {
       Conta c = new Conta();
       c.deposita(200);
       Conta c2 = new Conta();
       c.transfere(c2, 10);
       System.out.println(c2.saldo);
    }
}
