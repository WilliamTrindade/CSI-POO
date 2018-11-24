package model;
public class Pessoa {
    private String nome;
    private Float nivelFome;
    private Veiculo veiculo;
    
    //contrutores
    public Pessoa(){
        
    }
    public Pessoa(String nome, Float nivelFome, Veiculo veiculo){
        this.nome = nome;
        this.nivelFome = nivelFome;
        this.veiculo = veiculo;
    }
    
    //metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getNivelFome() {
        return nivelFome;
    }

    public void setNivelFome(Float nivelFome) {
        this.nivelFome = nivelFome;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
}
