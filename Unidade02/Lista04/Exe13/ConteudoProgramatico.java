package Unidade02.Lista04.Exe13;
import java.util.ArrayList;
import java.util.List;
public class ConteudoProgramatico {
    
    private String nomeConteudo;
    private String descricaoConteudo;
    public static List<ConteudoProgramatico> listaConteudos = new ArrayList<>();

    public ConteudoProgramatico(String nomeConteudo, String descricaoConteudo) {
        setDescricaoConteudo(descricaoConteudo);
        setNomeConteudo(nomeConteudo);
        listaConteudos.add(this);
    }

    public String getNomeConteudo() {
        return nomeConteudo;
    }

    public void setNomeConteudo(String nomeConteudo) throws IllegalArgumentException {
        if (nomeConteudo == null || nomeConteudo.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do conteúdo programático inválida");
        }
        this.nomeConteudo = nomeConteudo;
    } 
    public String getDescricaoConteudo() {
        return descricaoConteudo;
    }

    public void setDescricaoConteudo(String descricaoConteudo) throws IllegalArgumentException {
        if (descricaoConteudo == null || descricaoConteudo.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição do conteúdo programático inválida");
        }
        this.descricaoConteudo = descricaoConteudo;
    }

    public static List<ConteudoProgramatico> getListaConteudos() {
        return listaConteudos;
    }

    public static void setListaConteudos(List<ConteudoProgramatico> listaConteudos) {
        ConteudoProgramatico.listaConteudos = listaConteudos;
    }

    @Override
    public String toString() {

        return " -  Conteúdo: " + getNomeConteudo() + "\t|    Descrição: " + getDescricaoConteudo();
    }
}