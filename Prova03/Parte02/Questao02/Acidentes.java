/**
 * @author Letícia Fruet
 */

package Prova03.Parte02.Questao02;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Acidentes {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("acidentes_transito.csv"); 
        InputStreamReader isr = new InputStreamReader(fis); 
        BufferedReader br = new BufferedReader(isr); 

        String linha = br.readLine(); 
        linha = br.readLine();

        while (linha != null) { 

            String[] informacoes = linha.split(";");          

            DadosAcidente gravarDados = new DadosAcidente(informacoes[0], informacoes[1], informacoes[2], informacoes[3]);

            linha = br.readLine(); 
        }

        try {
            File arquivoGravacao = new File("D:\\Documents\\Faculdade\\2º sem\\POO-2023-2\\Prova03\\resultados_acidentes.txt");
            FileOutputStream fos = new FileOutputStream(arquivoGravacao, false);
            PrintWriter arquivoTextoGravado = new PrintWriter(fos);

            arquivoTextoGravado.println(DadosAcidente.verificarVeiculos());
            arquivoTextoGravado.println(DadosAcidente.verificarEstadoCivil());

            arquivoTextoGravado.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}