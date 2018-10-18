package teste;
public class Teste {
    public static void main(String[] args) {
        //declarar
        int a = 10;
        
        // imprime a idade
        int idade = 20;
        System.out.println(idade);
        // gera uma idade no ano seguinte
        int idadeNoAnoQueVem;
        idadeNoAnoQueVem = idade + 1;
        // imprime a idade
        System.out.println(idadeNoAnoQueVem);
        
        
        //ponto flutuante
        double pi = 3.14;
        double x = 5 * 10;
        
        
        //valores booleanos
        boolean verdade = true;
        System.out.println(verdade);

        //mudar valores
        int i = 5; // i recebe uma cópia do valor 5
        int j = i; // j recebe uma cópia do valor de i
        i = i + 1; // i vira 6, j continua 5
    }
}
