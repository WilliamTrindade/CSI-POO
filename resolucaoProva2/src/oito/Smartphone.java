package oito;

public class Smartphone extends Celular{
    
    Smartphone() {
        super(y);
        y = y * 3;
    }
    public static void main(String[] args) {
        
        new Smartphone();
        System.out.println(y);
        
    }
    
}