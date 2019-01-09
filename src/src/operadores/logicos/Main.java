/*
    &&
    ||
    !
    =
    ==
*/
package operadores.logicos;
public class Main {
    public static void main(String[] args) {
        int idade = 7;
        boolean dono = true;
        if(idade >= 18 && dono == true) {
            System.out.println("Entre!");
        }else {
            if((idade == 3) || !(idade != 7)) { // desnecessário(gambs)
                System.out.println("Desculpa criança de 3 ou 7 Anos");
            } else {
            }
            System.out.println("Nao entre");
        }
    }
}
