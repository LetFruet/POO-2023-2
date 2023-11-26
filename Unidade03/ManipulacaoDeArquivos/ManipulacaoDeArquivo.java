package Unidade03.ManipulacaoDeArquivos;
import java.io.File;
public class ManipulacaoDeArquivo {
    
    public static void main(String[] args) {
        
        //definindo um diretorio 
        File diretorio = new File("C:\\Users\\Leticia");
        //pegando a lista de arquivos do diretorio definido
        File conteudoDiretorio[] = diretorio.listFiles();
        //criando uma variável que armazenará o tamanho do diretório definido
        double total = 0;

        //percorrendo todos os itens do File
        for (File f : conteudoDiretorio) {
            //verificando se o item é um diretório
            if (f.isDirectory()) {
                System.out.println("Diretório: " + f.getName());
            //verificando se o item é um arquivo
            } else {
                total += f.length(); //somando mais um arquivo ao total de arquivos
                System.out.println(f.getName() + "\t tamanho: "  + f.length());
            }
            System.out.println(f.getName());
        }

        //imprimindo o total de arquivos e o tamanho do diretorio definido 
        System.out.println("Total: " + conteudoDiretorio.length + "\nTamanho do diretório: " + total);
    }
}