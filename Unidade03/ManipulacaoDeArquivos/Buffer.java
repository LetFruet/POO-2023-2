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
        OutputStream os = new FileOutputStream("C:\\Users\\Leticia\\teste.txt"); // nome do arquivo
        Writer wr = new OutputStreamWriter(os);     // criação de um escritor
        BufferedWriter br = new BufferedWriter(wr); // adiciono um escritor de buffer

		//matriz que contem informações a serem gravadas
        String m[][] = {
			              {"Joao","Ilhota", "20"},
                          {"Maria", "Gaspar", "23"}
						};

		//varrendo a matriz e gravando no arquivo
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                 br.write(m[i][j] + ";");
             }
             br.newLine();            
        }

		//fechando arquivo
        br.close();
        
        //lendo arquivo .csv
        FileInputStream stream = new FileInputStream("c://temp//suicidio.csv"); 
        InputStreamReader reader = new InputStreamReader(stream); 
        BufferedReader brx = new BufferedReader(reader); 
		
		//Leitura da primeira linha do arquivo
        String linha = brx.readLine(); 
        while(linha != null) { 

			  //separando as colunas a partir do delimitador ;
              String[] textoSeparado = linha.split(";");
              System.out.print(textoSeparado[0] + " "); 
              System.out.print(textoSeparado[1] + " "); 
              System.out.print(textoSeparado[2]+ " ");  
              System.out.println("");
			  // verificando se existe mais linhas 
              linha = brx.readLine(); 
        }

        //Leitura via teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(
				System.in));
        
        teclado.readLine();       
    }
}