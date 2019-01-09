/*
 * Faz Loop
 */
package repeticao.whileedowhile;
public class Main {
    public static void main(String[] args) {
        // verifica antes de rodar a primeira vez
        int idade = 0;
        while(idade < 18) {
            System.out.println("Menor wh");
            idade++;
        }
        // executa ao menos uma vez
        idade = 0;
        do{
            System.out.println("Menor do");
            idade++;
        }while(idade<18);
    }
}
