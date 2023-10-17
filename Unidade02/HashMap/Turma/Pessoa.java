package Unidade02.HashMap.Turma;
public class Pessoa {
    private String nome;
    private int cpf;

    public Pessoa(String nome, int cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException{
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}