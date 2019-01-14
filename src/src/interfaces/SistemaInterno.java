package interfaces;
public class SistemaInterno {
    public void login(Autenticavel a, int senha) {
        // pega	senha de um lugar, ou de um scanner de polegar
	boolean	ok = a.autentica(senha);
	//aqui eu posso	chamar o autentica!	
	//não necessariamente é	um Funcionario!
	//Mais ainda, eu não sei que objeto a	
	//referência "a" está apontando	exatamente! Flexibilidade.
    }
}
