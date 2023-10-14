/*Coleção de CD’s (cenário A): Adriano tem uma coleção grande de CD’s e gostaria de cadastrar no seu Palm a lista desses CD’s, 
pois às vezes nem sabe o que tem. Ele pensou em cadastrar o nome do cantor(a) ou conjunto, o título do CD e o ano de lançamento. */
package Unidade02.Lista04.Exe11;
public class Cds {
    
    private String nomeCantor;
    private String tituloCd;
    private int anoLancamento;
    
    public Cds(String nomeCantor, String tituloCd, int anoLancamento, Palm palm) {
        setNomeCantor(nomeCantor);
        setTituloCd(tituloCd);
        setAnoLancamento(anoLancamento);
        palm.adicionarCd(this);
    }

    public String getNomeCantor() {
        return nomeCantor;
    }

    public void setNomeCantor(String nomeCantor) throws IllegalArgumentException {
        if (nomeCantor == null || nomeCantor.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do cantor ou conjunto inválido");
        }
        this.nomeCantor = nomeCantor;
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

    @Override
    public String toString() {
        
        return "Cantor/Conjunto: " + getNomeCantor() + "\t| Título: " + getTituloCd() + "\t| Ano lançamento: " + getAnoLancamento();
        
    }
}