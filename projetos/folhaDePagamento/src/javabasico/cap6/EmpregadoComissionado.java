package javabasico.cap6;
public class EmpregadoComissionado extends Empregado {
    private float vendaBrutaMensal;
    private float comissao;

    public EmpregadoComissionado(String nome, String cpf) {
        super(nome, cpf);
    }
    
    @Override
    public float salario() {
       return getComissao() * getVendaBrutaMensal() * getInsalubridade(); 
    }
    
    @Override
    public String toString(){
        return super.toString() + getComissao() +getVendaBrutaMensal();
    }
    
    public float getVendaBrutaMensal() {
        return vendaBrutaMensal;
    }

    public void setVendaBrutaMensal(float vendaBrutaMensal) {
        if(vendaBrutaMensal < 0){
            this.vendaBrutaMensal = 0;
        }else{
            this.vendaBrutaMensal = vendaBrutaMensal;
        }
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        if(comissao < 0){
            this.comissao = 0;
        }else{
            this.comissao = comissao;
        }
    }
    
    
}
