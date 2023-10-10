package Unidade02.Lista04.Exe09;
import java.util.ArrayList;
import java.util.List;
public class Multas {
    
    private String localMulta;
    private String tipoMulta;
    private double valorMulta;
    private boolean statusMulta;
    public static List<Multas> listaMultas;

    public Multas(String localMulta, String tipoMulta, double valorMulta, boolean statusMulta) {
        setLocalMulta(localMulta);
        setTipoMulta(tipoMulta);
        setValorMulta(valorMulta);
        setStatusMulta(statusMulta);
        listaMultas = new ArrayList<>();
    }

    public String getLocalMulta() {
        return localMulta;
    }

    public void setLocalMulta(String localMulta) throws IllegalArgumentException {
        if (localMulta == null || localMulta.trim().isEmpty()) {
            throw new IllegalArgumentException("Local da multa inválido");
        }
        this.localMulta = localMulta;
    }

    public String getTipoMulta() {
        return tipoMulta;
    }

    public void setTipoMulta(String tipoMulta) throws IllegalArgumentException {
        if (tipoMulta == null || tipoMulta.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo da multa inválido");
        }
        this.tipoMulta = tipoMulta;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) throws IllegalArgumentException {
        if (valorMulta < 0) {
            throw new IllegalArgumentException("Valor da multa inválido");
        }
        this.valorMulta = valorMulta;
    }

    public boolean isStatusMulta() {
        return statusMulta;
    }

    public void setStatusMulta(boolean statusMulta) {
        this.statusMulta = statusMulta;
    } 

    @Override
    public String toString() {
        
        String str = "Local: " + getLocalMulta() + "\nTipo: " + getTipoMulta() + "\nValor: R$" + getValorMulta() + "\nStatus: ";

        if (isStatusMulta()) {
            str += "em aberto";
        } else {
            str += "pago";
        }

        return str;
    }
}