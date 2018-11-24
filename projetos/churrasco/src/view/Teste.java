package view;
import model.*;
public class Teste {
    
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Uno", "Fiat");
        Veiculo v2 = new Veiculo("Camaro", "Chevrolet");
        Veiculo v3 = new Veiculo("Malibu", "Chevrolet");
        Veiculo v4 = new Veiculo("kombi", "Volkswagen");
        
        Pessoa p1 = new Pessoa("William", 7.5f, v2);
        Pessoa p2 = new Pessoa("João", 8.5f, v1);
        Pessoa p3 = new Pessoa("Ewerton", 5.5f, v3);
        Pessoa p4 = new Pessoa("Arthur", 5.5f, v4);
        
        Assador a1 = new Assador("Assador Violento", 90);
        a1.setPessoa(p1);
        Churrasco churrasco = new Churrasco("Rua : Alberto Bins, 189, Jardim, Sapucaia do Sul - RS", a1, "01");
        churrasco.adicionarParticipante(p1);
        churrasco.adicionarParticipante(p2);
        churrasco.adicionarParticipante(p3);
        churrasco.adicionarParticipante(p4);
   
        imprimirChurrasco(churrasco);
        churrasco.imprimeParticipantes();
    }
    public static void imprimirChurrasco(Churrasco x){
        System.out.println("Churrasco : \nEndereco: " + x.getEndereco()
        + "\nAssador:\nNome Artístico: " + x.getAssador().getNome() + "\nNome Cívil: "
        + x.getAssador().getPessoa().getNome()
        +"\nHabilidades: " + x.getAssador().getHabilidade() + "\n");
    }
}
