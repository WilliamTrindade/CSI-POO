package repeticao.controladoresdeloops;
public class Main {
    public static void main(String[] args) {
        // break
        int x = 20, y = 100;
        for(;x<y;x++) {
            if(x%19==0) {
                System.out.println("Achei um divisivel! "+ x);
                break; // para a execução
            }
        }
        
        // continue
        int i;
        for(i=0;i<100;i++) {
            if(i>10 && i <90) {
                continue; // vai para o próximo laço
            }
            System.out.println(i);
        }
    }
}
