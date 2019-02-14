package java.io.outputstream.escreverarquivo;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * Mesmo processo de ler 
 * A diferença é a que usamos OutputStream e FileOutputStream
 * 
 * O FileOutputStream pode receber um booleano como segundo parâmetro, para 
 * indicar se você quer	reescrever o arquivo ou	manter o que já	estava 
 * escrito(append) line:21
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        OutputStream os;
        os = new FileOutputStream("file.txt"); // Pega saída
        
        OutputStreamWriter osw = new OutputStreamWriter(os);
        
        // A estrutura try-with-resources, que já fará o finally cuidar dos
        // recursos declarados dentro do try(),	 invocando close(Para fechar o arquivo).
        try (BufferedWriter bw = new BufferedWriter(osw)) {
            // com exceção ou não, o close()do bw sera invocado
            
            // Para quebra de linha chama métdo do BufferedWriter.newLine()
            bw.write("ola"); 
        }
    }
}
