package test;
public class Teste {
    public static void main(String[] args) {
        //double-int
        double a = 3.14;
        int b = (int) a;
        System.out.println(b);
        
        //long-int
        long x = 10000;
        int y = (int) x;
        System.out.println(y);
        
        //A letra f, que pode ser maiúscula ou minúscula, indica que aquele literal deve ser tratado como
        float f = 0.0f;
        System.out.println(f);
        
        //double-float
        double g = 5; 
        float h = 3;
        float i = h + (float) g;
        System.out.println(i);
    }
}
