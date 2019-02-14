package java.io.scannereprintstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Facilitam a escrita e leitura
 * 
 * Temos a classe java.util.Scanner, que facilita bastante o trabalho de ler 
 * de um InputStream.
 * Além	disso, a classe	PrintStream possui um construtor que já	recebe o nome 
 * de um arquivo como argumento.	
 * 
 */
public class Main {
    // 	PrintStream lança FileNotFoundException se construir passando um arquivo
    public static void main(String[] args) throws FileNotFoundException {
        Scanner	s = new	Scanner(System.in); // Lê entrada
	PrintStream ps = new PrintStream("file.txt"); // Arquivo
        
	while(s.hasNextLine())	{
	    ps.println(s.nextLine());
	}
    }
}
