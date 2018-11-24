package javabasico.cap6;

import java.util.Arrays;

public class FolhaDePagamento {
    public static void main(String[] args) {
        
        EmpregadoAssalariado ea = new EmpregadoAssalariado("William", "0211232324");
        ea.setSalarioMensal(1000);
 
        EmpregadoComissionado ec = new EmpregadoComissionado("João", "000222334");
        ec.setComissao(200);
        ec.setVendaBrutaMensal(20);
        
        empregados(ea, ec);
                
    }
    public static void empregados(Empregado... empregado){
        System.out.println(Arrays.toString(empregado) );
    }
}
