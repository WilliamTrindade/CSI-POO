/*
 * Para isso usamos foreach que em si usa o Iterator da Collection
 */
package collectionsframework.percorrercolecoes;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<String> pessoas;
        pessoas = new HashSet<>();
        pessoas.add("William");
        pessoas.add("Ana");
        pessoas.add("Marcelo");
        
        // Percorrer com fereach
        pessoas.forEach((nome) -> {
            System.out.println(nome);
        });
        
        // Percorrer com iterator
        Iterator<String> i;
        i = pessoas.iterator(); // Método que retorna o tipo Iterator
        while(i.hasNext()) {    // Enquanto existir itens
            String nome = i.next();
            System.out.println(nome);
        }
        
    }
}
