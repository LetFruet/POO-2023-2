package Unidade02.Lista05.Exe02;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Artigo {
 
    private String titulo, periódico; //private: classe
    private Date dataPublicacao;
    private char qualis;

    public Artigo(String titulo, String periódico, Date dataPublicacao, char qualis) {
        setTitulo(titulo);
        setPeriódico(periódico);
        setDataPublicacao(dataPublicacao);
        setQualis(qualis);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws IllegalArgumentException {
        if (titulo == null || titulo.isEmpty() || titulo.isBlank()) {
            throw new IllegalArgumentException("Título inváldo");
        }
        this.titulo = titulo;
    }

    public String getPeriódico() {
        return periódico;
    }

    public void setPeriódico(String periódico) throws IllegalArgumentException {
        if (periódico == null || periódico.isEmpty() || periódico.isBlank()) {
            throw new IllegalArgumentException("Periódico inváldo");
        }
        this.periódico = periódico;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) throws IllegalArgumentException {
        if (dataPublicacao == null) {
            throw new IllegalArgumentException("Data inválda");
        }
        this.dataPublicacao = dataPublicacao;
    }

    public char getQualis() {
        return qualis;
    }

    public void setQualis(char qualis) {

        this.qualis = qualis;
    }

    public String exibirDados() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //verificando o formato da data
        return "\nTítulo: " + getTitulo() + "\nPeriódico: " + getPeriódico() + "\nQualis: " + getQualis() + "\nData de publicação: " + sdf.format(getDataPublicacao());
    }
}
