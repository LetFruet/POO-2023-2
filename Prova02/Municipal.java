// LETÍCIA FRUET

package Prova02;
import java.util.ArrayList;
import java.util.List;
public class Municipal extends Onibus {

    private int qtdPassageiros;
    private List<Passageiro> listaPassageirosMunicipal = new ArrayList<Passageiro>();

    public Municipal(String placa, Motorista motorista, int qtdPassageiros) {
        super(placa, motorista);
        setQtdPassageiros(qtdPassageiros);
    }

    public void adicionarPassageiro(Passageiro umPassageiro) {
        listaPassageirosMunicipal.add(umPassageiro);
    }

    public int getQtdPassageios() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageios) throws IllegalArgumentException { 
        if (qtdPassageios < 0 || qtdPassageios > 65) {
            throw new IllegalArgumentException("Quantidade de passageiros inválida");
        }
        this.qtdPassageiros = qtdPassageios;
    }

    public List<Passageiro> getListaPassageirosMunicipal() {
        return listaPassageirosMunicipal;
    }

    public void setListaPassageirosMunicipal(List<Passageiro> listaPassageirosMunicipal) throws IllegalArgumentException {
        if (listaPassageirosMunicipal == null) { 
            throw new IllegalArgumentException("Lista de passageiros inválida");
        }
        this.listaPassageirosMunicipal = listaPassageirosMunicipal;
    }
    public String verificarLotacao() {

        String str = "";

        if (qtdPassageiros < 45) {
            str = ". Passageiro viajará sentado";
        } else if (qtdPassageiros > 45 && qtdPassageiros < 65) {
            str = ". Passageiro viajará de em pé";
        } else {
            str = ". Ônibus lotado";
        }

        return str;
    }

    public String municipalMenorLotacao() {
        int menorQtdPassageiros = Integer.MAX_VALUE;
        String str = "Quantidade de passageiros do ônibus municipal com menor lotação: ";

        if (getListaPassageirosMunicipal().size() < menorQtdPassageiros) {
            menorQtdPassageiros = getListaPassageirosMunicipal().size();
            str += menorQtdPassageiros + "\n" + toString() + "\n";
        }
        return str;
    }

    @Override
    public String toString() {
        return super.toString() + ". Quantidade de passageiros: " + getQtdPassageios() + verificarLotacao();
    }
}