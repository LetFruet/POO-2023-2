package Unidade02.Lista04.Exe01;
public class Prova {

    //atributo, getters e setters, demais métodos
    //a classe concorrente vira atributo da classe prova 
    private Concorrente umConcorrente; //associação (etapa 1)
    private double nota;

    public Prova(Concorrente umConcorrente, double nota) {
        setUmConcorrente(umConcorrente);
        setNota(nota);
    }

    public void setUmConcorrente(Concorrente umConcorrente) {
        this.umConcorrente = umConcorrente; //associação (etapa 2)
    }

    public Concorrente getConcorrente() {
        return this.umConcorrente;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    //método para mostrar as informações dos atributos da classe
    public String imprimir() { 
        return "Nome: " + umConcorrente.getNome() + "\nÁrea de especialização: " + umConcorrente.getAreaDeEspecializacao() + "\nInscrição: "
               + umConcorrente.getInscricao() + "\nTelefone: " + umConcorrente.getTelefone() + "\nNota: " + getNota();
    }
}
