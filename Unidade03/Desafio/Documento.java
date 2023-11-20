package Unidade03.Desafio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class Documento {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        try {
            System.out.println("Informe o nome do arquivo: ");
            String nomeArq = kb.nextLine();
            System.out.println("Informe a extensão do arquivo: ");
            String extensaoArq = kb.nextLine();

            File arquivo = new File("C:\\Users\\Leticia\\" + nomeArq + "." + extensaoArq); // define o arquivo
            FileOutputStream fos = new FileOutputStream(arquivo, true);  //cria o arquivo
            PrintWriter arquivoGravar = new PrintWriter(fos);

            EscreverDoc(arquivoGravar);
            LerDoc(arquivo);

            kb.close();
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void EscreverDoc(PrintWriter arquivoGravar) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Escreva o que desejar no arquivo: (FIM para finalizar)");
        String escrita = kb.nextLine();

        while (!escrita.equalsIgnoreCase("FIM")) {

            arquivoGravar.println(escrita);

            escrita = kb.nextLine();

            arquivoGravar.close();
        }

        kb.close();
    }

    public static void LerDoc(File arquivo) {

        try {
            Scanner kb = new Scanner(arquivo);
            
            //lê o arquivo inteiro (do inicio ao fim)
            while (kb.hasNext()) { //enquanto tem linhas a serem lidas
                System.out.println(kb.nextLine());
            }

            kb.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}