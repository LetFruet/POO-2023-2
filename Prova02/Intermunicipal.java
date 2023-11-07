// LETÍCIA FRUET

package Prova02;
import java.util.ArrayList;
import java.util.List;
public class Intermunicipal extends Onibus {

    private double taxaEmbarque;
    private List<Passageiro> listaPassageirosIntermunicipal = new ArrayList<Passageiro>();

    public Intermunicipal(String placa, Motorista motorista) {
        super(placa, motorista);
        setTaxaEmbarque(0.70);
        
    }

    public void adicionarPassageiro(Passageiro umPassageiro) {
        listaPassageirosIntermunicipal.add(umPassageiro);
    }

    public double getTaxaEmbarque() {
        return taxaEmbarque;
    }

    public void setTaxaEmbarque(double taxaEmbarque) {
        this.taxaEmbarque = taxaEmbarque;
    }

    public List<Passageiro> getListaPassageirosIntermunicipal() {
        return listaPassageirosIntermunicipal;
    }

    public void setListaPassageirosIntermunicipal(List<Passageiro> listaPassageirosIntermunicipal) throws IllegalArgumentException {
        if (listaPassageirosIntermunicipal == null) { 
            throw new IllegalArgumentException("Lista de passageiros inválida");
        }
        this.listaPassageirosIntermunicipal = listaPassageirosIntermunicipal;
    }

    public String intermunicipalMenorLotacao() {
        int menorQtdPassageiros = Integer.MAX_VALUE;
        String str = "Quantidade de passageiros do ônibus municipal com menor lotação: ";

        if (getListaPassageirosIntermunicipal().size() < menorQtdPassageiros) {
            menorQtdPassageiros = getListaPassageirosIntermunicipal().size();
            str += menorQtdPassageiros + "\n" + toString() + "\n";
        }
        return str;
    }

    @Override
    public String toString() {
        return super.toString() + ". Taxa de embarque: " + getTaxaEmbarque();
    }
}