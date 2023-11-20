package Unidade03.ManipulacaoDeArquivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class EscritaTexto {
    
    public static void main(String[] args) {
        
        try {
        File arquivo = new File("C:\\Users\\Leticia\\aula.txt");
        FileOutputStream fos = new FileOutputStream(arquivo, true); //true: escreve os dados que existirem
        PrintWriter arquivoTexto = new PrintWriter(fos);

        arquivoTexto.println("Nome: ");
        arquivoTexto.println("Letícia");
        arquivoTexto.println();
        arquivoTexto.println(true);
        arquivoTexto.println("L");
        arquivoTexto.println(19);

        arquivoTexto.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}