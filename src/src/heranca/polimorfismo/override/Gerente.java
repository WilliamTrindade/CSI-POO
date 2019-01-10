package classe.heranca.polimorfismo.override;
public class Gerente extends Funcionario {
    private int	senha;
    private int	numeroDeFuncionariosGerenciados;
    
    // método reescrito na subclasse
    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }
    
    public boolean autentica(int senha) {
        if(this.senha==senha){
            System.out.println("Acesso	Permitido!");
            return true;
        }else{
            System.out.println("Acesso	Negado!");
        }
        return false;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
}

