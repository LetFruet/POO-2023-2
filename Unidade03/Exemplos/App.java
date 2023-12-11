package Unidade03.Exemplos;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) throws Exception {
        processarUmaPessoa();
        processarVariasPessoas();
        processarVariasPessoasList();
    }

    public static void processarUmaPessoa(){
    	System.out.println("PROCESSAR UMA PESSOA\n");
    	
        //populando o atributo
        Pessoa pessoaCriada = new Pessoa("Gabriel", LocalDate.of(1989, 8, 5), "Nome da Mãe", "Nome do Pai", 
        "Rua Y, número X", "Essa informação não é persistida", "Informação estatica");

        //serializando um objeto (serializar: converter um objeto em byte stream)
        try {
            //definindo um arquivo 
            File arquivo = new File("pessoa.ser");
            //escrevendo os dados no arquivo
            FileOutputStream file = new FileOutputStream(arquivo);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(pessoaCriada);

            out.close();
            file.close();

            System.out.println("Objeto foi serializado.");
        //catch para caso de erro
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao serializar o objeto: "+e);
        }

        //desserializando um objeto (desserializar: converter um byte stream em objeto) 
        try {
            //buscando o arquivo que foi serializado acima
            FileInputStream file = new FileInputStream("pessoa.ser");
            ObjectInputStream input = new ObjectInputStream(file);

            //lendo o arquivo e desserializando
            Object pessoaDesserializada = input.readObject();
            
            //cast: Object para Pessoa (só é possível devido a serialização ter sido feita na classe Pessoa)
            Pessoa pessoa = (Pessoa) pessoaDesserializada;

            //chamando o método que verifica se dois objetos são iguais
            System.out.println(String.format("Sao iguais? [%s]", pessoa.equals(pessoaCriada) ? "Sim" : "Não"));

            //chamando o método que verifica o hashCode de cada objeto (usado em HashMap)
            System.out.println("Objeto criado: HASH CODE - " + pessoaCriada.hashCode());
            System.out.println("Objeto desserializado: HASH CODE - " + pessoa.hashCode());

            System.out.println("Objeto criado: TRANSIENT INFO - "+  pessoaCriada.getInfoNaoSalva());
            System.out.println("Objeto desserializado: TRANSIENT INFO - " + pessoa.getInfoNaoSalva());

            System.out.println("Objeto criado: STATIC INFO - " + pessoaCriada.getInfoStatic());
            System.out.println("Objeto desserializado: STATIC INFO - " + pessoa.getInfoStatic());

            input.close();
            file.close();

        //catches para caso de erro
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada"+e);
        } catch (IOException e) {
            System.out.println("Erro de leitura de arquivo"+e);
        }

    	System.out.println("FIM\n");
    }

    //criando um método que serializa e desserializa vários objetos
    public static void processarVariasPessoas() {
    	System.out.println("PROCESSAR VÁRIAS PESSOAS\n");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Gabriel", LocalDate.of(1989, 8, 5), "Nome da Mãe", "Nome do Pai", 
        "Rua Y, número X", "Essa informação não é persistida", "Informação estatica"));

        pessoas.add(new Pessoa("João", LocalDate.of(1990, 10, 1), "Nome da Mãe", "Nome do Pai", 
        "Rua Y, número X", "Essa informação não é persistida", "Informação estatica"));

        pessoas.add(new Pessoa("Marcio", LocalDate.of(2000, 10, 1), "Nome da Mãe", "Nome do Pai", 
        "Rua Y, número X", "Essa informação não é persistida", "Informação estatica"));

        //serializando um objeto 
        try {
            File arquivo = new File("pessoa_TODOS.ser");

            FileOutputStream file = new FileOutputStream(arquivo);
            ObjectOutputStream out = new ObjectOutputStream(file);

            //lendo todas as pessoas e serializar no mesmo arquivo
            for (Pessoa pessoa : pessoas) {
                out.writeObject(pessoa);
            }

            out.close();
            file.close();

            System.out.println("Objetos foram serializados.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao serializar o objeto: "+e);
        }

        //DESSERIALIZAR - Converter um byte stream em objeto 
        try {
            //Busca o arquivo que foi serializado acima
            File arquivo = new File("pessoa_TODOS.ser");

            FileInputStream file = new FileInputStream(arquivo);
            ObjectInputStream input = new ObjectInputStream(file);

            List<Pessoa> pessoasDesserializadas = new ArrayList<>();

            Object pessoaDesserializada;

            do {
                try {
                    pessoaDesserializada = input.readObject();
                } catch (EOFException e){
                    break;
                }
                //lê o arquivo e desserializa
                pessoasDesserializadas.add((Pessoa) pessoaDesserializada);

            } while (true);

            //PRINT DE TODAS AS PESSOAS DESSERIALIZADAS
            for (Pessoa pessoa : pessoasDesserializadas) {
                System.out.println("DESSERIALIZADO: "+pessoa);
            }

            input.close();
            file.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao desserializar o objeto: "+e);
        } catch (ClassNotFoundException e){
            System.out.println("Classe do objeto serializado não encontrada: "+e);
        }
    	System.out.println("FIM\n");
    }


    /**
     * Método que serializa e desserializa vários objetos em uma lista.
     * Serializar lista
     */
    public static void processarVariasPessoasList(){
    	System.out.println("PROCESSAR UMA LISTA DE PESSOAS\n");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Gabriel", LocalDate.of(1989, 8, 5), "Nome da Mãe", "Nome do Pai", 
        "Rua Y, número X", "Essa informação não é persistida", "Informação estatica"));

        pessoas.add(new Pessoa("João", LocalDate.of(1990, 10, 1), "Nome da Mãe", "Nome do Pai", 
        "Rua Y, número X", "Essa informação não é persistida", "Informação estatica"));

        pessoas.add(new Pessoa("Marcio", LocalDate.of(2000, 10, 1), "Nome da Mãe", "Nome do Pai", 
        "Rua Y, número X", "Essa informação não é persistida", "Informação estatica"));

        //SERIALIZAR - Converter a lista em byte stream
        try {
            File arquivo = new File("pessoa_LISTA.ser");
            FileOutputStream file = new FileOutputStream(arquivo);
            ObjectOutputStream out = new ObjectOutputStream(file);

            //Escreve a lista com todos os objetos
            out.writeObject(pessoas);

            out.close();
            file.close();

            System.out.println("Lista foi serializada.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao serializar a lista: "+e);
        }

        //DESSERIALIZAR - Converter um byte stream em lista de objetos 
        try {
            //Busca o arquivo que foi serializado acima
            File arquivo = new File("pessoa_LISTA.ser");

            FileInputStream file = new FileInputStream(arquivo);
            ObjectInputStream input = new ObjectInputStream(file);

            //Lê o arquivo e converte para uma lista que não tem tipo
            List<?> pessoasDesserializadas = (List<?>) input.readObject();

            //PRINT DE TODAS AS PESSOAS DESSERIALIZADAS
            for (Object pessoa : pessoasDesserializadas) {
                System.out.println("DESSERIALIZADO: "+pessoa);
            }

            input.close();
            file.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao desserializar o objeto: "+e);
        } catch (ClassNotFoundException e){
            System.out.println("Classe do objeto serializado não encontrada: "+e);
        }
    	System.out.println("FIM\n");

    }
}
