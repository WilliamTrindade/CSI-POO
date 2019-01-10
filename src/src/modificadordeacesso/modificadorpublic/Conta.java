package classe.modificadordeacesso.modificadorpublic;
public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    // public
    // permite que outras classe acessem
    public boolean saca(double valor) {
        if(this.saldo < valor) {
            return false;
        }else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
    public void deposita(double quantia) {
        this.saldo+=quantia;
    }
}
