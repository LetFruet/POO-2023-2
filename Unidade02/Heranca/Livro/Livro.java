package Unidade02.Heranca;

public class Livro extends Publicacao {
 
    //declarando atributos da classe 
    private String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nEditora: " + getEditora() + //atributo da classe pai
               "\nISBN: " + getISBN();                              //atributo da classe filha
    }
}
