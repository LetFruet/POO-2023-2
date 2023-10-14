/*Coleção de CD’s (cenário B): Adriano notou que alguns CD’s são de coletâneas. Sendo assim, não têm apenas um cantor (ou conjunto) 
e sim vários. Ele quer cadastrar essa lista de músicos, sem relacioná-los às músicas. Deseja controlar também se o CD é de coletânea 
e se é duplo. Adriano gostaria de ter cadastrada a lista das músicas de cada CD, com o tempo de duração de cada faixa. São relatórios 
desejados: os CD’s de um determinado músico e em quais CD’s está uma determinada música.  */
package Unidade02.Lista04.Exe12;
import java.util.ArrayList;
import java.util.List;
public class CdsB {
    
    private String tituloCd;
    private int anoLancamento;
    private boolean coletania;
    private boolean duplo;
    private List<Cantores> listaCantores = new ArrayList<>();
    private List<Musicas> listaMusicas = new ArrayList<>();
    public static List<CdsB> listaCds = new ArrayList<>();

    public CdsB(String tituloCd, int anoLancamento, boolean coletania, boolean duplo) {
        setTituloCd(tituloCd);
        setAnoLancamento(anoLancamento);
        setColetania(coletania);
        setDuplo(duplo);
        listaCds.add(this);
    }

    public String getTituloCd() {
        return tituloCd;
    }

    public void setTituloCd(String tituloCd) throws IllegalArgumentException {
        if (tituloCd == null || tituloCd.trim().isEmpty()) {
            throw new IllegalArgumentException("Título do cd inválido");
        }
        this.tituloCd = tituloCd;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) throws IllegalArgumentException {
        if (anoLancamento < 0) {
            throw new IllegalArgumentException("Ano de lançamento inválido");
        }
        this.anoLancamento = anoLancamento;
    }

    public boolean isColetania() {
        return coletania;
    }

    public void setColetania(boolean coletania) {
        this.coletania = coletania;
    }

    public boolean isDuplo() {
        return duplo;
    }

    public void setDuplo(boolean duplo) {
        this.duplo = duplo;
    }

    public List<Cantores> getCantores() {
        return listaCantores;
    }

    public void addCantor(Cantores cantor) {
        this.listaCantores.add(cantor);
    }

    public List<Musicas> getMusicas() {
        return listaMusicas;
    }

    public void addMusica(Musicas musica) {
        this.listaMusicas.add(musica);
    }

    @Override
    public String toString() {
        
        String str = "\nCantor(es)/Conjunto(s): " + listaCantores.toString() + "\nMúsica(s): " + listaMusicas.toString() + 
                      "\nTítulo: " + getTituloCd() + "\nAno de lançamento: " + getAnoLancamento();

        if (isColetania()) {
            str += "\nÁlbum coletânia";
        }

        if (isDuplo()) {
            str += "\nÁlbum duplo";
        }

        return str;
    }
}
