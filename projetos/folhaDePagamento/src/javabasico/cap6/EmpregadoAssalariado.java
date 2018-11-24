package javabasico.cap6;
public class EmpregadoAssalariado extends Empregado {
    private float salarioMensal;

    public EmpregadoAssalariado(String nome, String cpf) {
        super(nome, cpf);
    }
    
    @Override
    public float salario(){
        return this.getSalarioMensal() * getInsalubridade();
    }
    
    @Override
    public String toString(){
        return super.toString() + salario();
    }
    
    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        if(salarioMensal < 0){
            this.salarioMensal = 0;
        }else{
            this.salarioMensal = salarioMensal;
        }
    }

    
}
