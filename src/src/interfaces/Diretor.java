package interfaces;
public class Diretor extends Funcionario implements Autenticavel{
    private int senha;
    
    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
}
