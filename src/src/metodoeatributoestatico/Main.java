package classe.metodoeatributostatic;
public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(100, "wil");
        Conta c1 = new Conta(2200, "leo");
        /*
        para acessar algo static 
        usa-se Classe.algumaCoisa
        */
        System.out.println(Conta.getTotalDeContas());
    }
}
