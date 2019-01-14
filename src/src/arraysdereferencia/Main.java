package arraysdereferencia;
/*
Arrays de referencia guardam referencias(endereços) de objetos
*/
class Conta {
    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
public class Main {
    public static void main(String[] args) {
        Conta[] contas = new Conta[10];
        // popular array
        Conta c = new Conta();
        c.numero = 100;
        contas[0] = c;
        System.out.println(contas[0].numero);
        
        // popular diretamente
        contas[1] = new Conta();
        contas[1].numero = 199;
        System.out.println(contas[1].numero);
    }
}
