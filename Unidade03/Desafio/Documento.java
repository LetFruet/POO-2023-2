/*Exercício de arquivo texto:

Faça um método que crie o documento texto:
1) Solicite ao usuário qual será o nome do arquivo e a extensão.
2) Crie um arquivo texto na pasta raiz de seu projeto.

Faça um método que escreva no documento de texto:
1) Solicite ao usuário que entre com dados para escrever no arquivo ou digite "FIM" para parar a escrita
2) Persista os dados no documento

Faça um método que leia o arquivo de texto:
1) Solicite o nome do arquivo a ser lido
2) Imprima o texto lido em um bloco de texto na Console

DESAFIO:
- Pergunte se desja substituir o arquivo caso já exista e siga com a vontade do usuário */
package Unidade03.Desafio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class Documento {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        //criando um try para escrever um arquivo
        try {

            //pedindo para o usuário informar o nome e a extensão do arquivo a ser criado
            System.out.println("Informe o nome do arquivo: ");
            String nomeArq = kb.nextLine();
            System.out.println("Informe a extensão do arquivo: ");
            String extensaoArq = kb.nextLine();

            //criando o repósitorio e um arquivo com o nome definido pelo usuário 
            File arquivo = new File("C:\\Users\\Leticia\\" + nomeArq + "." + extensaoArq); //define o arquivo
            FileOutputStream fos = new FileOutputStream(arquivo, true);  //cria o arquivo
            PrintWriter arquivoGravar = new PrintWriter(fos); //imprime o arquivo

            //chamando os métodos de escrita e leitura
            EscreverDoc(arquivoGravar);
            LerDoc(arquivo);

            //fechando o teclado 
            kb.close();
            
        //caso ocorra uma exceção, o catch é ativado
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void EscreverDoc(PrintWriter arquivoGravar) {

        //chamando o teclado e pedindo para o usuário gravar o arquivo
        Scanner kb = new Scanner(System.in);
        System.out.println("Escreva o que desejar no arquivo: (FIM para finalizar)");
        String escrita = kb.nextLine();

        //criando um loop para o usuário continuar gravando no arquivo 
        while (!escrita.equalsIgnoreCase("FIM")) {

            //recebendo a entrada do usúario no arquivo criado por ele
            arquivoGravar.println(escrita);

            //pulando linha
            escrita = kb.nextLine();

            //fechando a gravação
            arquivoGravar.close();
        }

        //fechando o teclado
        kb.close();
    }

    public static void LerDoc(File arquivo) {

        //criando um try para escrever um arquivo
        try {
            //chamando o teclado com o arquivo 
            Scanner kb = new Scanner(arquivo);
            
            //lendo o arquivo inteiro
            while (kb.hasNext()) { //enquanto ainda há linhas a serem lidas
                System.out.println(kb.nextLine());
            }

            kb.close();

        //caso ocorra uma exceção, o catch é ativado
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}