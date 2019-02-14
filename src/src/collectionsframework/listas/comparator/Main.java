/*
 * É  possível definir outros critérios de ordenação usando a interface do java.util
 * chamada Comparator.
 * Para isso na Collections existe um método sort que recebe alem da List
 * Recebe um critério de ordenação
 */
package collectionsframework.listas.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> alunos;
        alunos = new ArrayList<>();
        alunos.add("William");
        alunos.add("Joao");
        alunos.add("Ana");
        alunos.add("ze");
        System.out.println(alunos);
        /*
         * Classe de Comparação por tamanho
         * compare : Método que compara pelo tamanho da String
         */
        // Implemento ela como classe Anonima já que será usada apenas aqui
        // Defino e ja implemento
        
        // Forma 1
        /*
        Collections.sort(alunos, new Comparator<String>() {
            @Override
            public int compare(String t, String t1) {
                return Integer.compare(t.length(), t1.length());
            }
        });
        */
        
        // Forma Com expressão Lambda do Java 8
        Collections.sort(alunos, (String t, String t1) -> Integer.compare(t.length(), t1.length()));
        
        System.out.println(alunos);
        
        /*
         * Uma novidade do Java 8 é a possibilidade de declarar métodos concretos
         * dentro de uma interface	
         */
    }
}
