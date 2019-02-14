/*
 * A classe Collections	traz métodos que ordenam
 */
package collectionsframework.listas.ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Conta implements Comparable<Conta> {
    private final int numero;
    private int saldo;
    public Conta(int numero, int saldo) {
        this.saldo = saldo;
        this.numero = numero;
    }
    public int getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public int compareTo(Conta outra) {
        if(this.saldo<outra.saldo) {
	    return	-1;
	}
	if(this.saldo>outra.saldo) {
	    return	1;
	}
	return	0;
    }
}
public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("William");
        lista.add("Leo");
        lista.add("Joao");
        
        // Crdenar crescente
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        
        // Ordenar Objeto
        /*
         * Para ordenar objeto extendemos a classe a Comparable<Tipo de Classe>
         * E após damos override no método compareTo()
         * Assim definimos um criterio de ordenação
         */
        Conta c = new Conta(1, 200);
        Conta c2 = new Conta(2, 1000);
        Conta c3 = new Conta(3, 10);
        List contas;
        contas = new ArrayList();
        contas.add(c);
        contas.add(c2);
        contas.add(c3);
        System.out.println(contas);
        Collections.sort(contas);
        System.out.println(contas);
        // Consulte a documentação para	ver outros métodos
    }
}
