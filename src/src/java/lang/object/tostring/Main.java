/*
 * Toda Classe herda da classe Object do pacote java.lang
 * Por padrão, o método toString do Object retorna o nome da classe  @ um número de identidade:
 */
package java.lang.object.tostring;
class Pessoa {
    private String nome;
    
    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p.toString());
    }
}
