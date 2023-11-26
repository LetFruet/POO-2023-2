package Unidade03.Serializacao;
import java.io.Serializable;
//implementando a serialização a classe Publicacao
public class Publicacao implements Serializable { 

    private String nome;
    private String editora;

    public Publicacao(String nome, String editora) {
        setNome(nome);
        setEditora(editora);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Nome editora: " + getNome() + " | Editora: " + getEditora();
    }
}