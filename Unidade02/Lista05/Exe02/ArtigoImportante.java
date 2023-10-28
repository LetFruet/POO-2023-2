package Unidade02.Lista05.Exe02;
import java.util.Date;
public class ArtigoImportante extends Artigo {
    
    private int fatorImpacto;

    public ArtigoImportante(String titulo, String periódico, Date dataPublicacao, char qualis,int fatorImpacto) {
        super(titulo, periódico, dataPublicacao, qualis);
        setFatorImpacto(fatorImpacto);
    }

    public int getFatorImpacto() {
        return fatorImpacto;
    }

    public void setFatorImpacto(int fatorImpacto) throws IllegalArgumentException {
        if (fatorImpacto < 0) {
            throw new IllegalArgumentException("Fator de impacto inválido");
        }
        this.fatorImpacto = fatorImpacto;
    }

    @Override //sobrescrevendo o exibirDados da classe pai
    public String exibirDados() {
        return super.toString() + "\nFator de impacto: " + getFatorImpacto();
    }
}