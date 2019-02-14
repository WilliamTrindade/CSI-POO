package gettersesetters;
public class Main {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setTitular("William");
        c.setNumero(100);
        c.deposita(100);
        c.saca(10);
        System.out.println(c.getSaldo());
    }
}