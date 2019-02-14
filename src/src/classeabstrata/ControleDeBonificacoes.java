package classeabstrata;
public class ControleDeBonificacoes {
    protected double totalDeBonificacoes = 0;
    
    public void registra(Funcionario f) {
        System.out.println("Adicionando	bonificação do funcionario:" + f);
        this.totalDeBonificacoes += f.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return totalDeBonificacoes;
    }
    
}
