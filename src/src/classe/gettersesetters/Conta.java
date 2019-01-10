package classe.gettersesetters;
public class Conta {
    
    private int numero;
    private String titular;
    private double saldo;
 
    public boolean saca(double valor) {
        if(this.saldo < valor) {
            return false;
        }else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
    /*
     get e set permite o aceso aos atributos e metodos privados
     de forma controlada
    */
    public void deposita(double quantia) {
        this.saldo+=quantia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }  
    
}
