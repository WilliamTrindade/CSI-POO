package metodoabstrato;
public class Gerente extends Funcionario {
    
    @Override
    public double getBonificacao() {
        return this.getSalario() * 1.4 + 1000;
    }
    
}
