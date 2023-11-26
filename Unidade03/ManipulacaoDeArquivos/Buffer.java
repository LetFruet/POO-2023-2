package Unidade03.ManipulacaoDeArquivos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class Buffer {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Fluxo de saida de um arquivo
        OutputStream os = new FileOutputStream("C:\\Users\\Leticia\\teste.txt"); //diretorio e nome do arquivo a ser gravado
        Writer wr = new OutputStreamWriter(os);     //criando um escritor
        BufferedWriter br = new BufferedWriter(wr); //criando um escritor de buffer

		//criando uma matriz que contenha informações a serem gravadas
        String m[][] = { {"Joao","Ilhota", "20"}, {"Maria", "Gaspar", "23"} };

		//varrendo a matriz e gravando os dados no arquivo
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                 br.write(m[i][j] + ";");
             }
             br.newLine();            
        }

		//fechando arquivo com as informações salvas
        br.close();
        
        //lendo um arquivo .csv
        FileInputStream fos = new FileInputStream("c://temp//suicidio.csv"); //selecionando o arquivo a ser lido 
        InputStreamReader reader = new InputStreamReader(fos); //criando um leitor
        BufferedReader brx = new BufferedReader(reader); //criando um leitor de buffer
		
		//lendo a primeira linha do arquivo
        String linha = brx.readLine(); 

        //criando loop para ler as demais linhas do arquivo 
        while(linha != null) { 

			  //separando as colunas a partir do delimitador ;
              String[] textoSeparado = linha.split(";");
              System.out.print(textoSeparado[0] + " "); 
              System.out.print(textoSeparado[1] + " "); 
              System.out.print(textoSeparado[2]+ " ");  
              System.out.println("");

			  //verificando se existe mais linhas a serem lidas
              linha = brx.readLine(); 
        }

        //fazendo a leitura do arquivo via teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        //fechando o teclado
        teclado.readLine();       
    }
}