/*
 * Um mapa é composto por um conjunto de associações entre um objeto
 * chave a um objeto valor. ( Como array no PHP)
 * Ele não estende da Interface Collection apesar de ser parte do framework
 * Ele é feito pela interface Map
 * Suas	principais implementações são o HashMap, o TreeMap e o Hashtable.
 *
 */
package collectionsframework.conjuntos.maps;

import java.util.HashMap;
import java.util.Map;

class Conta {
    int numero;
    private float saldo;
    
    public void deposita(float v) {
        this.saldo+=v;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
}
public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.deposita(200);
        
        Conta c2 = new Conta();
        c2.deposita(300);
        
        // Cria o Map
        Map<String, Conta> mapaDeContas;
        mapaDeContas = new HashMap<>();
        
        // Associa chave - valor
        mapaDeContas.put("CEO", c1);
        mapaDeContas.put("Programador", c2);
        
        // Pega valor
        Conta contaDoCEO;
        contaDoCEO = mapaDeContas.get("CEO");
        
        System.out.println(contaDoCEO.getSaldo());
        
        /**
         * O metodo keySet() retorna um Set com	as chaves daquele mapa e 
         * o método values() retorna a Collection com todos os valores que foram
         * associados a alguma das chaves
         */
    }
}
