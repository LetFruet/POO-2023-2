package Unidade03.ManipulacaoDeArquivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class EscritaTexto {
    
    public static void main(String[] args) {
        
        //try para fazer a escrita de um arquivo
        try {
            //definindo o diretorio e o nome do arquivo a ser criado e gravado
            File arquivo = new File("C:\\Users\\Leticia\\aula.txt"); 
            //escrevendo os dados no arquivo (true: manter os dados do arquivo e escrever a parte nova | false: sobrescrever a parte nova)
            FileOutputStream fos = new FileOutputStream(arquivo, true);
            //printando os dados no arquivo criado
            PrintWriter arquivoTexto = new PrintWriter(fos); 

            //gravando os dados no arquivo
            arquivoTexto.println("Nome: ");
            arquivoTexto.println("Letícia");
            arquivoTexto.println();
            arquivoTexto.println(true);
            arquivoTexto.println("Idade: ");
            arquivoTexto.println("19");

            //fechando o arquivo
            arquivoTexto.close();

        //caso ocorra uma exceção no try, o catch é ativado
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}