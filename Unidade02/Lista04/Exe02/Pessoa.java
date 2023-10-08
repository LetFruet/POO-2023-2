/*Implemente o relacionamento entre as classes Familia e Pessoa. Suponha que uma dada família possua vários membros (Pessoa). 
Para tanto, faz-se necessário a inclusão dos seguintes métodos: 
a) Faça um método para adicionar membros à família 
b) Faça um método que retorne a pessoa mais velha da família 
c) Faça um método que imprime o nome dos membros da família */
package Unidade02.Lista04.Exe02;
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) throws IllegalArgumentException {
        if (sobrenome == null || sobrenome.trim().isEmpty()) {
            throw new IllegalArgumentException("Sobrenome inválido");
        }
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IllegalArgumentException {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida");
        }
        this.idade = idade;
    } 

    @Override
    public String toString() {

        return "Nome: " + getNome() + " " + getSobrenome() + "\tIdade: " + getIdade();
    }
}
