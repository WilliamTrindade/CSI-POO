package posepreincremento;
public class Main {
    public static void main(String[] args) {
        int i = 5, j = 5, a, b;
        // retorna o valor antigo e incrementa
        a = i++;
        // incrementa e retorna o novo valor
        b = ++j;
        System.out.println("A = " + a + " B = " + b);
        System.out.println("I = " + i + " J = " + j);
    }
}
