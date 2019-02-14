/*
 * A Set utiliza da interface Collection que define alguns métodos 
 *
 * Um conjunto é representado pela interface Set e tem como suas principais
 * implementações as classes 
 * HashSet, LinkedHashSet e TreeSet.
 * A ordem na dos elementos vária entre as tres
 * Seu forte é na Pesquisa
 */
package collectionsframework.conjuntos;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<String> cargos;
        cargos = new HashSet<>();
        cargos.add("CTO");
        cargos.add("CEO");
        cargos.add("Gerente de Projetos");
        cargos.add("Programador");
        cargos.add("Programador"); // Repetido (false)
        
        System.out.println(cargos);
    }
}
