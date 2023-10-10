package Unidade02.Lista04.Exe09;
import java.util.ArrayList;
import java.util.List;
public class Veiculo {
    
    private String placaVeiculo;
    private double valorVeiculo;
    private char tipoVeiculo; 
    private boolean movidoAlcool; 
    private double capacidadeCargaVeiculo; 
    private List<Multas> listaMultas;
    public static List<Veiculo> listaVeiculo = new ArrayList<>();

    public Veiculo(String placaVeiculo, double valorVeiculo, char tipoVeiculo, boolean movidoAlcool, double capacidadeCargaVeiculo) {
        setPlacaVeiculo(placaVeiculo);
        setValorVeiculo(valorVeiculo);
        setTipoVeiculo(tipoVeiculo);
        setMovidoAlcool(movidoAlcool);
        setCapacidadeCargaVeiculo(capacidadeCargaVeiculo);
        listaVeiculo.add(this);
        this.listaMultas = new ArrayList<>();
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) throws IllegalArgumentException {
        if (placaVeiculo == null || placaVeiculo.trim().isEmpty()) {
            throw new IllegalArgumentException("Placa do veículo inválida");
        }
        this.placaVeiculo = placaVeiculo;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setValorVeiculo(double valorVeiculo) throws IllegalArgumentException {
        if (valorVeiculo < 0) {
            throw new IllegalArgumentException("Valor do veículo inválida");
        }
        this.valorVeiculo = valorVeiculo;
    }

    public char getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(char tipoVeiculo) throws IllegalArgumentException {
        if (tipoVeiculo == 'c' || tipoVeiculo == 'C' || tipoVeiculo == 'p' || tipoVeiculo == 'P') {
            this.tipoVeiculo = tipoVeiculo;
        } else {
            throw new IllegalArgumentException("Tipo do veículo inválido");
        }
    }

    public boolean isMovidoAlcool() {
        return movidoAlcool;
    }

    public void setMovidoAlcool(boolean movidoAlcool) {
        this.movidoAlcool = movidoAlcool;
    }

    public double getCapacidadeCargaVeiculo() {
        return capacidadeCargaVeiculo;
    }

    public void setCapacidadeCargaVeiculo(double capacidadeCargaVeiculo) throws IllegalArgumentException {
        if (capacidadeCargaVeiculo < 0) {
            throw new IllegalArgumentException("Capacidade do veículo inválida");
        }
        this.capacidadeCargaVeiculo = capacidadeCargaVeiculo;
    }

    public List<Multas> getMulta() {
        return listaMultas;
    }

    public void addMultas(Multas multa) throws IllegalArgumentException {
        if (multa == null) {
            throw new IllegalArgumentException();
        }
        listaMultas.add(multa);
    }

    public double calcularIpva() {
        double ipva = 0;

        if (getTipoVeiculo() == 'c') { //veículo de carga
            if (getCapacidadeCargaVeiculo() > 1.0) {
                ipva = getValorVeiculo() * 0.09;
            } else {
                ipva = getValorVeiculo() * 0.06;
            }

        } else if (getTipoVeiculo() == 'p') { //veículo de passeio
            if (isMovidoAlcool()) {
                ipva = getValorVeiculo() * 0.03;
            } else {
                ipva = getValorVeiculo() * 0.04;
            }

        } else {
            throw new IllegalArgumentException("Tipo de veículo inválido");
        }
        return ipva;
    }

    public double calcularLicenciamento() {
        
        double valorMultasEmAberto = 0;

        for (Multas m : Multas.listaMultas) {
            if (m.isStatusMulta()) { 
                valorMultasEmAberto += m.getValorMulta();
            }
        }

        return (calcularIpva() + valorMultasEmAberto);
    }

    @Override 
    public String toString() {

        String str = "Placa: " + getPlacaVeiculo() + "\nTipo do veículo: " + getTipoVeiculo() + "\nCapacidade de carga: " + 
                      getCapacidadeCargaVeiculo() + "\nValor: R$ " + getValorVeiculo();

        if (isMovidoAlcool()) {
            str += "\nMovido a álcool";
        } else {
            str += "\nMovido a combustível";
        }

        if (listaMultas.size() == 0) {
            str += "\n\n---- Multas ----\n";
            str += listaMultas.toString() + "\n";
        }
        
        return str;
    }
}