/*
 * A list utiliza da interface Collection que define alguns métodos 
 *
 * A implementação mais	utilizada da interface List é a	ArrayList, que trabalha
 * com um array interno para gerar uma lista. 
 * Portanto, ela é mais rápida na pesquisa do que sua concorrente,
 * a LinkedList, que é mais rápida na inserção e remoção de itens nas pontas.
 * Temos na interface List : ArrayList - LiinkedList - Vector
 */
package collectionsframework.listas;

import java.util.ArrayList;
import java.util.List;

class Conta {
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
}
public class Main {
    public static void main(String[] args) {
        // ArrayList lista = new ArrayList();
        List lista; // Abstrair pela Interface List
        lista = new ArrayList();
        
        // Inserir no Final
        lista.add("William");
        lista.add("João");
        lista.add("Maria");
        
        // Insere em qualquer posição
        lista.add(1, "Leo");
        
        // Pegar o numero de elementos
        System.out.println(lista.size());
        
        // Pegar um Indice em Especifico
        for(int i=0; i<lista.size();i++) {
            System.out.println(lista.get(i));
        }
        
        // Fazer um cast para iterar sobre objeto
        // Pois o retorno do Get é do tipo Object
        Conta c = new Conta(1, 200);
        Conta c2 = new Conta(2, 1000);
        Conta c3 = new Conta(3, 10);
        List contas;
        contas = new ArrayList();
        contas.add(c);
        contas.add(c2);
        contas.add(c3);
        
        for(int x=0;x<contas.size();x++) {
            Conta ci = (Conta) contas.get(x);
            System.out.println("Conta " + x + " - " + ci.getSaldo());
        }
        
        // Remover da lista
        lista.remove("Maria");
        contas.remove(c);
        
        // Verificar se elemento existe na lista
        System.out.println(lista.contains("William"));
        
        /**
         * Generics:
         * Podemos Usar Generics para delimitar a insercao na Lista
         */
        List<Conta> contas1;
        contas1 = new ArrayList<>();
        contas1.add(c);
        contas1.add(c2);
        contas1.add(c3);
        
        System.out.println(lista);
    }
}
