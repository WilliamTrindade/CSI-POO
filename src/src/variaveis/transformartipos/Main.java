package variaveis.transformartipos;

/**
 * Podemos transforma de Int para String por ex. e de outros tipos tambem
 */
public class Main {
    public static void main(String[] args) {
        // Número -> String
        int num = 10;
        String tex = "" + num;
        System.out.println(tex);
        // Para Formatar numeros usa-se classes como NumberFormat e Formatter
        
        
        // String -> Número
        // Usa-se as Classes de ajuda dos tipos primitivos
        tex = "101";
        num = Integer.parseInt(tex);
        System.out.println(num);
        
        /*
         * As classes Double, Short, Long, Float etc contêm 
         * o mesmo tipo de método, como	parseDouble e parseFloat que
         */
        
        // Podemos fazer autoboxing antigo wrapping e unwrapping	
        // Passar de Tipo primitivo para objeto
        // Embrulhar
        int i = 5;
        Integer x = i;
        System.out.println(x);
        
        // Desembrulhar
        int z = 5;
        Integer y = i;
        int numero = y;
        System.out.println(y);
    }
}
