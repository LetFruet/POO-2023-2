package Unidade02.Revisao_Prova02;
public abstract class Pessoa {
    
    private String nome;

    public Pessoa(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }  

    //criando um método abstrato que será chamado em todas as subclasses de Pessoa
    public abstract String toString();
}
