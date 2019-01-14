/*
 Toda Classe herda da classe Object do pacote java.lang
*/
package java.lang.object;
class Pessoa {
    private String nome;
    
    // reescrevendo método da classe object
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

    }
}
