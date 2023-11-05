package Unidade02.Revisao_Prova02.Revisao02;

public class Vinho extends Produto {

    private int safra; 
    private String tipo;
    
    public Vinho(String nomeProduto, double valor, int safra, String tipo) {
        super(nomeProduto, valor);
        setSafra(safra);
        setTipo(tipo);
    }

    public int getSafra() {
        return safra;
    }
    public void setSafra(int safra) throws IllegalArgumentException {
        if (safra < 1900) {
            throw new IllegalArgumentException("Ano da safra inválido");
        }
        this.safra = safra;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Override
    public String toString() {
        return super.toString() + ".   Safra: " + getSafra() + ".   Tipo: " + getTipo();

    }
}
