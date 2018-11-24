package model;
public class Assador {
    
    private String nome;
    private int habilidade;
    private Pessoa pessoa;
    //construtores
    public Assador(){
        
    }
    public Assador(String nome, int habilidade){
        this.nome = nome;
        this.habilidade = habilidade;
    }
    
    //metodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
