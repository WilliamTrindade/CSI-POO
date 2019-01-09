package classe.atributos.valoresdefault;
class Conta {
    int numero = 123;
    String titular = "Hoami";
    double saldo = 2999;
    
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
    
}
public class Main {
    public static void main(String[] args) {
        
    }
}
