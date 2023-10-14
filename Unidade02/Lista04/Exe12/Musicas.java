package Unidade02.Lista04.Exe12;
import java.util.ArrayList;
import java.util.List;
public class Musicas {
    
    private String nomeMusica;
    private double duracaoMusica;
    public static List<Musicas> listaMusicas = new ArrayList<>();

    public Musicas(String nomeMusica, double duracaoMusica) {
        setNomeMusica(nomeMusica);
        setDuracaoMusica(duracaoMusica);
        listaMusicas.add(this);
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) throws IllegalArgumentException {
        if (nomeMusica == null || nomeMusica.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da música inválida");
        }
        this.nomeMusica = nomeMusica;
    }

    public double getDuracaoMusica() {
        return duracaoMusica;
    }

    public void setDuracaoMusica(double duracaoMusica) throws IllegalArgumentException {
        if (duracaoMusica < 0) {
            throw new IllegalArgumentException("Tempo de duração da faixa inválido");
        }
        this.duracaoMusica = duracaoMusica;
    }  

    @Override
    public String toString() {
        return getNomeMusica() + " (" + getDuracaoMusica() + " minutos)";
    }
}