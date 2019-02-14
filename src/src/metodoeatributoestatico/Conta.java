package metodoeatributoestatico;
public class Conta {
    
    // não é preciso instanciar um objeto para utilizar
    private static int totalDeContas;
    private int numero;
    private String titular;
    private double saldo;
    
    /* construtor da classe */
    Conta(String titular) {
        // incrementa o total de contas
        Conta.totalDeContas = Conta.totalDeContas + 1;
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

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }  
}
