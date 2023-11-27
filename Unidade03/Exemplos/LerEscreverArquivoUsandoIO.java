package Unidade03.Exemplos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class LerEscreverArquivoUsandoIO {

    //chamando os métodos que leem e escrevem o arquivo 
    public static void main(String[] args) {
        escrever();
        ler();
    }

    //criando o método que escreve no arquivo
    public static void escrever() {

        //criando um arquivo
        File arquivo = new File("nome_do_arquivo_io.txt");
        
        //inicializando o loop try
        try {
            if (!arquivo.exists()) {
                //criando um arquivo caso ele ainda não exista 
                arquivo.createNewFile();
            }

            // Uso do FileWriter e BufferedWriter para escrever caracteres em um arquivo
            //true: manter os dados do arquivo e escrever a parte nova;
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);

            //fazendo a gravação no arquivo
            bw.write("Vamos escrever algo nesse arquivo...");
            bw.newLine();
            bw.write("Mais uma linha de dados...");
            bw.newLine();

            //fechando a escrita do arquivo 
            bw.close();
            fw.close();

        //catch para caso de erro
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: "+e);
        }
    }

    //criando o método que lê o arquivo
    public static void ler() {

        //criando um arquivo
        File arquivo = new File("nome_do_arquivo_io.txt");

        //inciando o loop try 
        try {
            
            // Uso do FileWriter e BufferedWriter para escrever caracteres em um arquivo
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            //enquanto tiver informações a serem lidas no arquivo 
            while (br.ready()) {
                System.out.println("LEITURA IO: " + br.readLine());
            }

            // PODE-SE LER "CHAR A CHAR" usando o método "read()"
            //while (br.ready()){
            //    System.out.println("LEITURA IO: " + (char) br.read());
            //}

            //fechando o leitor
            br.close();
            fr.close();

        //catch para caso de erro
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e);
        }
    }
}