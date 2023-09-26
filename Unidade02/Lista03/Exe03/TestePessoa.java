package Unidade02.Lista03.Exe03;
import java.util.HashMap;
public class TestePessoa {
    
    //crianso o método main para executar o código
    public static void main(String[] args) {
        new TestePessoa();
    }

    //criando um HashMap para armazenar os valores
    //String é o tipo da chave, Pessoa é o tipo dos objetos armazenados, pessoas é o nome da variável
    private HashMap<String, Pessoa> pessoas;

    public TestePessoa() {

        //criando instâncias de Pessoa
        Pessoa p1 = new Pessoa("Letícia", "123");
        Pessoa p2 = new Pessoa("Ana", "234");
        Pessoa p3 = new Pessoa("Lucas", "345");
        Pessoa p4 = new Pessoa("João", "456");
        Pessoa p5 = new Pessoa("Lúcia", "567");

        pessoas = new HashMap<String, Pessoa>();

        //inserindo instâncias no HashMap usando o método inserir
        inserir("987", p1, pessoas);
        inserir("876", p2, pessoas);
        inserir("765", p3, pessoas);
        inserir("654", p4, pessoas);
        inserir("543", p5, pessoas);

        //imprimindo dados armazenados no HashMap
        System.out.println(imprimir());
    }

    //p é objeto de pessoa / pessoas é objeto de HashMap
    public void inserir(String cpf, Pessoa p, HashMap<String, Pessoa> pessoas) {

        if (p == null) {
            throw new IllegalArgumentException();
        }

        //verificando se a chave está sendo repetida
        if (!pessoas.containsKey(p.getCpf())) {
            pessoas.put(p.getCpf(), p);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String imprimir() {
        String resultado = " ";
        for (Pessoa p: pessoas.values()) {
            resultado += "\nCPF: " + p.getCpf() + ", Nome: " + p.getNome();
        }
        return resultado;
    }
}