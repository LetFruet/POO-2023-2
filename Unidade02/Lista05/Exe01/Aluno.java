package Unidade02.Lista05.Exe01;

public abstract class Aluno {
   
    private String nome;
    private String curso;
    
    public Aluno(String nome, String curso) {
        setNome(nome);
        setCurso(curso);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws IllegalArgumentException {
        if(nome == null || nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) throws IllegalArgumentException {
        if(curso == null || curso.isEmpty() || curso.isBlank()){
            throw new IllegalArgumentException("Curso inválido");
        }
        this.curso = curso;
    }

    public abstract String exibirDados();
}