package java.io.inputstream.lerteclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *  O System.in	é uma referência a classe InputStream o qual, lê da entrada padrão.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is;
        is = System.in; // Byte
        InputStreamReader isr = new InputStreamReader(is); // Char
        BufferedReader br = new BufferedReader(isr); // String
        String s = br.readLine(); // Primeira Linha
        
        while(s != null) {
            System.out.println(s);
            s = br.readLine();
        }
    }
}
