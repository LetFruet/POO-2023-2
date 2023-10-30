// LETÍCIA FRUET

package Trabalho02;
import java.util.ArrayList;
import java.util.List;
public abstract class Personagem {
    
    private String nome, nomeVidaReal;
    private List<Superpoder> listaSuperpoderes = new ArrayList<Superpoder>();

    public Personagem(String nome, String nomeVidaReal) {
        setNome(nome);
        setNomeVidaReal(nomeVidaReal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String nomeVidaReal) throws IllegalArgumentException {
        if (nomeVidaReal == null || nomeVidaReal.isEmpty() || nomeVidaReal.isBlank()) {
            throw new IllegalArgumentException("Nome real inválido");
        }
        this.nomeVidaReal = nomeVidaReal;
    }

    public List<Superpoder> getListaSuperpoders () {
        return listaSuperpoderes;
    }

    public void setListaSuperpoders(List<Superpoder> listaSuperpoderes) {
        this.listaSuperpoderes = listaSuperpoderes;
    }

    public void adicionarSuperpoder(Superpoder sp) {
        
        if (listaSuperpoderes.size() >= 4) {
            throw new IllegalArgumentException("Lista cheia");
        }
        listaSuperpoderes.add(sp);
    }
    
    public double getPoderTotal() {
        double somarPoderes = 0;
        for (Superpoder s : listaSuperpoderes) {
            somarPoderes += s.getCategoria();
        }
        return somarPoderes;
    }
}