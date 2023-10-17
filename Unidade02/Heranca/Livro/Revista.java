package Unidade02.Heranca.Livro;

public class Revista extends Publicacao {
    
    private String periodicidade;

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nEditora: " + getEditora() + //atributo da classe pai
               "\nPeriodicidade: " + getPeriodicidade();             //atributo da classe filha
    }

}
