/*
O equals recebe um Object como	argumento e deve verificar se ele mesmo	é igual
ao Object recebido para	retornar um boolean.
Se você não reescrever esse método, o comportamento herdado é fazer um == com o
objeto recebido	como argumento.
*/
package java.lang.object.equals;
abstract class Conta {
    private int numero;
    
    @Override
    public boolean equals(Object object) {
        //primeiro verifica se o outro object não é nulo
	if(object == null) {
            return false;
        }
        // verifica se é do mesmo tipo
        if(!(object instanceof Conta))	{
	    return false;
	}
        // casting de referência
        Conta outraConta = (Conta) object; 
        // retorna a verificação
	return (this.numero == outraConta.numero);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.numero;
        return hash;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   
}

public class Main {
    public static void main(String[] args) {
        
    }
}
