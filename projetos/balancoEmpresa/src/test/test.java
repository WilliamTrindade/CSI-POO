package test;
import model.*;
public class test {
    public static void main(String[] args) {
        Salario s = new Salario();
        s.setGastosJaneiro(15000);
        s.setGastosFevereiro(23000);
        s.setGastosMarco(17000);
        System.out.println("Gastos " + s.getGastosTrimestre());
        System.out.println("Média Mensal " + s.getMediaMensal());
    }
}
