package Unidade03.ManipulacaoDeArquivos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArquivoBinario {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //definindo diretorio e nome de arquivo a ser criado e gravado
        File f = new File("C:\\Users\\Leticia\\teste.txt");
        //criando arquivo a permitir que seja gravado algo
        FileOutputStream  fos = new FileOutputStream(f);
        
        //gravando algo no arquivo
        fos.write(90);
        fos.write(100);
        fos.write(200);
        fos.write(400);
        fos.write(1000);
        
        //fechando o arquivo
        fos.close();
        
        //abrindo o arquivo para realizar a leitura das informações
        FileInputStream fis = new FileInputStream(f);
        
        int dado;
        //loop para ler o arquivo
        while(true) {
            //lendo cada byte
            dado = fis.read();

            //verificando se não chegou ao final do arquivo
            if (dado != -1 ) {                
                System.out.println(dado);
            } else {
                break;
            }
        }
    }
}