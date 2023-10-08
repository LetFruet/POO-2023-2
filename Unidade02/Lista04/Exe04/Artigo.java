package Unidade02.Lista04.Exe04;
import java.util.ArrayList;

public class Artigo {
    
    private String titulo;
    private String nome;

    private ArrayList<Revisor> avaliadores = new ArrayList<>(); 
    //private ArrayList<Revisor> avaliadores; //1° passo agregação

    public Artigo(String titulo, String nome) {
        setTitulo(titulo);
        setNome(nome);
        //avaliadores = new ArrayList<Revisor>(); //2° passo agragação
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws IllegalArgumentException {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título inválido");
        }
        this.titulo = titulo;
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

    public ArrayList<Revisor> getAvaliadores() {
        return avaliadores;
    }

    public void setAvaliadores(ArrayList<Revisor> avaliadores) {
        this.avaliadores = avaliadores;
    }

    //método para adicionar/vincular avaliação dos avaliadores
    public void adicionarAvaliacao(Revisor umRevisor) {
        avaliadores.add(umRevisor); // 3° passo agregação (método de vinculação)
    }

    //método para imprimir as informações do objeto
    public String imprimir() {
        String dados = "Título: " + getTitulo() + "\nAutor: " + getNome() + "\n";

        //varrendo e juntando com as avaliações dos revisores
        for (int i = 0; i < avaliadores.size(); i++) {
            dados += "\n----- Parecer do revisor " + (i+1) + " -----" + avaliadores.get(i).toString() + "\n";
        }
        return dados;
    }
}
