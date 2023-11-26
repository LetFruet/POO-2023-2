package Unidade03.Serializacao;
import java.io.Serializable;
//implementando a serialização a classe Pessoa
public class Pessoa implements Serializable {

    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 150) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Idade inválida.");
        } 
    }

    public int getIdade() {
        return this.idade;
    }

    @Override
    public String toString() {
        return "Nome pessoa: " + getNome() + " | Idade: " + getIdade();
    }
}