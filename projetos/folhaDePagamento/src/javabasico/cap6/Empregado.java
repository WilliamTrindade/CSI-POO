package javabasico.cap6;
public class Empregado {
    private String nome;
    private String cpf;
    private final float insalubridade = 2.21f;

    public Empregado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    @Override
    public String toString(){
        return this.nome + this.cpf;
    }
    
    public float salario(){
        return 0f;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getInsalubridade() {
        return insalubridade;
    }
 
}
