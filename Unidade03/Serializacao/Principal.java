package Unidade03.Serializacao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {

    public static void main(String[] args) {

        try {
            escreverArquivo();
            lerArquivo();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }     
    }

    private static void escreverArquivo() {
        try {
            File arquivo = new File("arqSerializado.bin");
            FileOutputStream fos = new FileOutputStream(arquivo, false);

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("Exemplo de gravação serializada."); //frase
            oos.writeObject(new Pessoa("Leticia", 19));
            oos.writeObject(new Publicacao("1", "1"));

            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void lerArquivo() throws IOException, ClassNotFoundException {
        try {
            File arquivo = new File("arqSerializado.bin"); 
            FileInputStream fis = new FileInputStream(arquivo);

            ObjectInputStream ois = new ObjectInputStream(fis);

            String frase = (String) ois.readObject(); //frase
            Pessoa pessoa = (Pessoa) ois.readObject();
            Publicacao publicacao = (Publicacao) ois.readObject();

            fis.close();
            System.out.println(frase);
            System.out.println(pessoa.toString());
            System.out.println(publicacao.toString());

        } catch (IOException e) {
            e.getMessage();
        } 
    }
}