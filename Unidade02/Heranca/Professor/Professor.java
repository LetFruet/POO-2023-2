package Unidade02.Heranca.Professor;

public class Professor {
   
    private String nome, matricula;
    private int idade;

    public Professor(String nome, String matricula, int idade) {
        setNome(nome);
        setMatricula(matricula);
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
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) throws IllegalArgumentException {
        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        this.matricula = matricula;
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
        return "Nome: " + getNome() + "\nMatrícula: " + getMatricula() + "\nIdade: " + getIdade();
    }
}