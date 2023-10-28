package Unidade02.Lista05.Exe05;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public class Evento {
    
    protected String titulo;
    protected double valorIngresso;
    protected LocalDate data;
    protected List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();;
    public static List<Evento> listaEventos = new ArrayList<Evento>();

    public Evento(String titulo, double valorIngresso, LocalDate date) {
        setTitulo(titulo);
        setValorIngresso(valorIngresso);
        setData(date); 
        listaEventos.add(this);
    }

    public void adicionarAvaliacao(Avaliacao umAvaliacao) {
        avaliacoes.add(umAvaliacao);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws IllegalArgumentException {
        if (titulo == null || titulo.isEmpty() || titulo.isBlank()) {
            throw new IllegalArgumentException("Título inválido");
        }
        this.titulo = titulo;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) throws IllegalArgumentException {
        if (valorIngresso < 0) {
            throw new IllegalArgumentException("Valor do ingresso inválido");
        }
        this.valorIngresso = valorIngresso;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) throws IllegalArgumentException {
        if (data == null) {
            throw new IllegalArgumentException("Data inválida");
        }
        this.data = data;
    }

    public String mostrar() {
        // Criando um formatador de data no formato "dd/MM/yyyy" em português
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("pt-BR"));

        return "Título: " + getTitulo() + "\nValor do ingresso: " + getValorIngresso() + "\nData: " + getData().format(dateFormatter) + 
                "\nAvaliações: " + avaliacoes;
    }
}