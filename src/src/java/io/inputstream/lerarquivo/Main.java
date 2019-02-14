package java.io.inputstream.lerarquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * FileInputStream: filha de InputStream
 * Classe Uilizadas para leitura de arquivo
 * 
 * InputStream tem diversas outras filhas, como	
 * ObjectInputStream, AudioInputStream, ByteArrayInputStream, entre outras.
 *
 * Esse	padrão de composição é bastante	utilizado e conhecido.É	o 
 * Decorator Pattern.
 */
public class Main {
    /*
     * Quando trabalhamos com java.io, diversos	métodos	lançam IOException, que
     * é uma exception do tipo checked - o que nos obriga a tratá-la ou	declará-la
     */
    public static void main(String[] args) throws IOException {
        InputStream is;                 
        is = new FileInputStream("file.txt"); // dJá passo no construtor (Lê Bytes)
        
        /*
         * InputStreamReader é filha da classe abstrata Reader
         * Ela manupula chars
         */
        // Decodifica para Unicode (Ele pode receber o Unicode desejado como UTF-8)
        // (Lê Char)
        InputStreamReader isr = new InputStreamReader(is); 
        
        /*
         * Para juntar esses Chars em uma String
         * Tem-se a Classe BufferedReader tambem filha de Reader
         * Para isso tem-se o método readLine()
        */
        // (Passa para String)
        // A estrutura try-with-resources, que já fará o finally cuidar dos
        // recursos declarados dentro do try(),	 invocando close(Para fechar o arquivo).
        try(BufferedReader br = new BufferedReader(isr)) {// Junta a em String
            // com exceção ou não, o close()do br sera invocado
            String s = br.readLine(); // Primeira Linha
            // Ler todas linhas
            while(s != null) {
                System.out.println(s);
                s = br.readLine();
            }
        }
    }
}
