package Unidade03.ManipulacaoDeArquivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LeituraTexto {
    
    public static void main(String[] args) {

        try {
        Scanner kb = new Scanner(new File ("C:\\Users\\Leticia\\TesteAula.txt"));
        //Scanner kb = new Scanner(new File ("C:/Users/Leticia/TesteAula.txt"));

        //lê o arquivo inteiro (do inicio ao fim)
        /*while (kb.hasNext()) { //enquanto tem linhas a serem lidas
            System.out.println(kb.nextLine());
        }*/

        String teste1 = kb.nextLine();
        String teste2 = kb.nextLine();
        String teste3 = kb.nextLine();

        System.out.println("Informações do arquivo: \n" + teste1 + " " + teste2 + " " + teste3);
        kb.close();
    
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    }
    }
}