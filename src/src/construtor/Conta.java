package construtor;
public class Conta {
     
    private int numero;
    private String titular;
    private double saldo;
    
    /* construtor da classe */
    Conta() {
        System.out.println("Contruindo a Classe");
    }
    
    Conta(String titular) {
        this.titular = titular;
    }
    
    Conta(int numero, String titular) {
        this(titular); // construtor chama outro
        this.numero = numero;
    }
    /* métodos */
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
    
    /* get e set permite o aceso aos atributos e metodos privados
    de forma controlada */
    
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
