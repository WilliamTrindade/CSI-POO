package metodoabstrato;
public class Main {
    public static void main(String[] args) {
       Gerente g = new Gerente();
       g.setSalario(100);
       System.out.println(g.getBonificacao());
    }
}
