/**
 * @author Alana Andreazza e Leticia Fruet 
 */

package Questao02;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Questa02 {
    
    public static void main(String[] args) throws IOException {

        ///definindo o arquivo a ser lido
        FileInputStream fis = new FileInputStream("D:\\Documents\\Faculdade\\2º sem\\POO-2023-2\\Unidade03\\ComplementoProva02\\suicidio.csv"); 
        //lendo o arquivo definido 
        InputStreamReader isr = new InputStreamReader(fis); 
        //criando um leitor de buffer
        BufferedReader br = new BufferedReader(isr); 

        //lendo a primeira linha do arquivo e ignorando-a
        String linha = br.readLine(); 
        linha = br.readLine();

        //criando loop para ler todo o arquivo 
        while (linha != null) { 

            //separando as colunas a partir do delimitador ;
            String[] gravarTexto = linha.split(";");          

            //gravando as informações do construtor
            DadosQuesta02 umDado = new DadosQuesta02(gravarTexto[12], gravarTexto[9], gravarTexto[7]);

            //verificando se existem mais linhas 
            linha = br.readLine(); 
        }

        try {

            //criando um novo arquivo para armazenar a gravação dos dados 
            File arquivo = new File("respostaDadosQuestao02.txt");
            //sobrescrevendo no arquivo a nova parte a ser gravada
            FileOutputStream fos = new FileOutputStream(arquivo, false);
            //lendo o texto a ser gravado
            PrintWriter arquivoTexto = new PrintWriter(fos);

            //imprimindo as saídas no novo arquivo criado
            arquivoTexto.println(DadosQuesta02.verificarSexo());
            arquivoTexto.println(DadosQuesta02.verificarEstadoCivil());

            //fechando o arquivo
            arquivoTexto.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}