package Unidade02.Lista05.Exe01;

public class AlunoGraduacao extends Aluno {
   private int semestre;

    public AlunoGraduacao(String nome, String curso, int semestre) {
        super(nome, curso);
        setSemestre(semestre);
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) throws IllegalArgumentException {
        if(semestre < 1) {
            throw new IllegalArgumentException("Semestre inválido");
        }
        this.semestre = semestre;
    }

    @Override //indica que o método vem da classe pai e está sendo sobrescrito
    public String exibirDados() {
        return "Nome: " + this.getNome() + "\nCurso: " + this.getCurso() + "\nSemestre: " + this.getSemestre(); //this.getNome(): o this serve para ter certeza que o nome é dessa classe
    }
}