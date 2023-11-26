package Unidade03.ManipulacaoDeArquivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LeituraTexto {
    
    public static void main(String[] args) {
        
        //try para fazer a escrita de um arquivo
        try {

            //inicializando o teclado que fará a leitura do arquivo definido
            Scanner kb = new Scanner(new File ("C:\\Users\\Leticia\\TesteAula.txt"));
            //                                          "C:/Users/Leticia/TesteAula.txt"

            //criando um loop para ler o arquivo inteiro
            /*while (kb.hasNext()) { //enquanto tem linhas a serem lidas
                System.out.println(kb.nextLine());
            }*/

            //lendo 3 linhas do arquivo
            String teste1 = kb.nextLine();
            String teste2 = kb.nextLine();
            String teste3 = kb.nextLine();

            //escrevendo as 3 linhas lidas (para conferência)
            System.out.println("Informações do arquivo: \n" + teste1 + " " + teste2 + " " + teste3);
            kb.close();
                
        //caso ocorra uma exceção no try, o catch é ativado
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}