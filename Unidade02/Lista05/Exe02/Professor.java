package Unidade02.Lista05.Exe02;
import java.util.ArrayList;
import java.util.List;
public class Professor {
    
    private String nome, area;
    private List<Artigo> listaArtigo = new ArrayList<>();

    public Professor(String nome, String area) {
        setNome(nome);
        setArea(area);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inváldo");
        }
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) throws IllegalArgumentException {
        if (area == null || area.isEmpty() || area.isBlank()) {
            throw new IllegalArgumentException("Nome inváldo");
        }
        this.area = area;
    }

    public void adicionarArtigo(Artigo novoArtigo) {
        if (listaArtigo == null) {
            throw new IllegalArgumentException();
        }

        listaArtigo.add(novoArtigo);
    }
    
    public String mostrarEstatistica() {
        String str = "Nome: " + getNome() + "\nÁrea: " + getArea() + "\nArtigos: ";

        for (Artigo a : listaArtigo) {
            str += a.exibirDados() + "\n";
        }

        return str;
    }
}