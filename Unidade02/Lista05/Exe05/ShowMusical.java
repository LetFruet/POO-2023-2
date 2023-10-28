package Unidade02.Lista05.Exe05;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class ShowMusical extends Evento {
    
    protected String artista, estiloMusica;
    public static List<ShowMusical> listaShows = new ArrayList<ShowMusical>();

    public ShowMusical(String titulo, double valorIngresso, LocalDate date, String artista, String estiloMusica) {
        super(titulo, valorIngresso, date);
        setArtista(artista);
        setEstiloMusica(estiloMusica);
        listaShows.add(this);
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) throws IllegalArgumentException {
        if (artista == null || artista.isEmpty() || artista.isBlank()) {
            throw new IllegalArgumentException("Nome do artista inválido");
        }
        this.artista = artista;
    }

    public String getEstiloMusica() {
        return estiloMusica;
    }

    public void setEstiloMusica(String estiloMusica) throws IllegalArgumentException {
        if (estiloMusica == null || estiloMusica.isEmpty() || estiloMusica.isBlank()) {
            throw new IllegalArgumentException("Estilo musical inválido");
        }
        this.estiloMusica = estiloMusica;
    } 

    public String mostrar() {
        return super.mostrar() + "\nArtista: " + getArtista() + "\nEstilo musical: " + getEstiloMusica();
    }
}