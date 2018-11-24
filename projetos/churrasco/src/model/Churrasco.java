package model;
import java.util.ArrayList;
public class Churrasco {
    
    private String endereco;
    private Assador assador;
    private String edicao;
    private ArrayList<Pessoa> participante = new ArrayList();
    
    //construtores
    public Churrasco(){
        
    }
    
    public Churrasco(String endereco, Assador assador, String edicao){
        this.endereco = endereco;
        this.assador = assador;
        this.edicao = edicao;
    }
    
    //metodos
    public void adicionarParticipante(Pessoa x){
        this.participante.add(x);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Assador getAssador() {
        return assador;
    }

    public void setAssador(Assador assador) {
        this.assador = assador;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public ArrayList<Pessoa> getParticipante() {
        return participante;
    }

    public void setParticipante(ArrayList<Pessoa> participante) {
        this.participante = participante;
    }
    
    public void imprimeParticipantes(){
        System.out.println("Participantes");
        participante.forEach((p) -> {
            System.out.println("\nNome: " + p.getNome() 
                    + "\nNivel de Fome: " + p.getNivelFome() + 
                    "\nVeículo: \nMarca:" + p.getVeiculo().getMarca() 
                    + "\nModelo: " + p.getVeiculo().getModelo());
        });
    }
}
