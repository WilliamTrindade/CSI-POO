package classe.classeabstrata;
/*
classe abstrata não pode ser instanciada
*/
public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario; 
    
    public double getBonificacao() {
        return this.salario * 1.2;
    }
   
}
