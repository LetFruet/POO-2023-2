// LETÍCIA FRUET

package Prova02;
import java.util.ArrayList;
import java.util.List;
public class Aposentado extends Passageiro {
    
    private String numeroRg;
    public static List<Aposentado> listaAposentados = new ArrayList<Aposentado>();
    
    public Aposentado(String nome, String numeroRg) {
        super(nome);
        setNumeroRg(numeroRg);
        listaAposentados.add(this);
    }

    public String getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(String numeroRg) throws IllegalArgumentException {
        if (numeroRg == null || numeroRg.isEmpty() || numeroRg.isBlank()) {
            throw new IllegalArgumentException("Número de rg inválido");
        }
        this.numeroRg = numeroRg;
    }

    public int tarifaAposentados() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValor da tarifa com desconto para aposentado R$ " + tarifaAposentados() + "\nRG: " + getNumeroRg();
    }
}