package Unidade03.ManipulacaoDeArquivos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class ArquivoBinario {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //definindo o diretorio e o nome a ser criado e gravado
        //criando um arquivo de texto (txt)
        File f = new File("C:\\Users\\Leticia\\teste.txt");
        //criando arquivo de saída (que permite que algo seja gravado)
        FileOutputStream fosGravar = new FileOutputStream(f);
        
        //gravando algo no arquivo
        fosGravar.write(90);
        fosGravar.write(100);
        fosGravar.write(200);
        fosGravar.write(400);
        fosGravar.write(1000);
        
        //fechando o arquivo com as gravações já armazenadas nele
        fosGravar.close();
        
        //abrindo o arquivo para realizar a leitura das informações
        FileInputStream fisLeitura = new FileInputStream(f);
        
        int dado;

        //criando loop para ler todos os dados do arquivo criado
        while(true) {
            //lendo cada byte do artigo
            dado = fisLeitura.read();

            //verificando se não chegou ao final do arquivo
            //caso não tenha terminado, ele continuará a ler o arquivo
            if (dado != -1 ) {                
                System.out.println(dado);
            //se o arquivo terminou, o programa encerra
            } else {
                break;
            }
        }
    }
}