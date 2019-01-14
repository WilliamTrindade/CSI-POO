package interfaces;
public class Gerente extends Funcionario implements Autenticavel {
    private int senha;
    
    @Override
    public boolean autentica(int senha) {
        //pode fazer outras possíveis verificações, como saber se esse
        //departamento do gerente tem acesso ao	Sistema
	return this.senha == senha;
    }	

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}