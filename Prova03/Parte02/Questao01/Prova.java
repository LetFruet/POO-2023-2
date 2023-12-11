/**
 * @author Letícia Fruet
 */

package Prova03.Parte02.Questao01;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
public class Prova {
    
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        serializar("atleta", "arqBinario");
    }

    public static void serializar(String arqOrigem, String arqDestino) {

        FileInputStream fis = new FileInputStream("atletas.csv"); 
        InputStreamReader isr = new InputStreamReader(fis); 
        BufferedReader br = new BufferedReader(isr); 

        String linha = br.readLine(); 
        linha = br.readLine();

        while (linha != null) { 

            String[] textoArquivo = linha.split(";");          

            Atleta umAtleta = new Atleta(textoArquivo[0], textoArquivo[1], textoArquivo[2], textoArquivo[3], new Endereco(textoArquivo[4], textoArquivo[5], textoArquivo[6], textoArquivo[7], textoArquivo[8], textoArquivo[9]));

            linha = br.readLine(); 
        }

        try {
            File arquivo = new File(arqDestino + ".bin");
            FileOutputStream fos = new FileOutputStream(arquivo, false);
            PrintWriter arquivoTexto = new PrintWriter(fos);

            arquivoTexto.println(Atleta.toString());

            arquivoTexto.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}