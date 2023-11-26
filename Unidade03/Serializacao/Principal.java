package Unidade03.Serializacao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {

    public static void main(String[] args) {

        //try para chamar os métodos
        try {
            escreverArquivo();
            lerArquivo();
                    
        //caso ocorra uma exceção no try, um dos catches é ativado, de acordo com a exceção lançada
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }     
    }

    private static void escreverArquivo() {
        
        //criando um try para escrever um arquivo
        try {
            
            //definindo o nome do arquivo a ser escrito
            File arquivo = new File("arqSerializado.bin");
            //escrevendo os dados no arquivo (true: manter os dados do arquivo e escrever a parte nova | false: sobrescrever a parte nova)
            FileOutputStream fos = new FileOutputStream(arquivo, false); 

            //gravando objetos com serialização
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("Exemplo de gravação serializada.");
            oos.writeObject(new Pessoa("Leticia", 19));
            oos.writeObject(new Publicacao("1", "1"));

            //fechando o gravador
            oos.close();
        
        //caso ocorra uma exceção no try, o catch é ativado
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void lerArquivo() throws IOException, ClassNotFoundException {
                
        //criando um try para escrever um arquivo
        try {
                        
            //definindo o nome do arquivo a ser lido
            File arquivo = new File("arqSerializado.bin"); 
            //lendo o arquivo definido
            FileInputStream fis = new FileInputStream(arquivo);

            //lendo osobjetos gravados no arquivo
            ObjectInputStream ois = new ObjectInputStream(fis);

            //lendo a frase inicial, o objeto de Pessoa e o objeto de Publicacao
            String frase = (String) ois.readObject(); 
            Pessoa pessoa = (Pessoa) ois.readObject();
            Publicacao publicacao = (Publicacao) ois.readObject();

            //fechando o leitor
            fis.close();

            //imprimindo os dados do arquivo recém gravado
            System.out.println(frase);
            System.out.println(pessoa.toString());
            System.out.println(publicacao.toString());

        //caso ocorra uma exceção no try, o catch é ativado
        } catch (IOException e) {
            e.getMessage();
        } 
    }
}