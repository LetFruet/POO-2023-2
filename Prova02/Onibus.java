// LETÍCIA FRUET

package Prova02;
import java.util.ArrayList;
import java.util.List;
public class Onibus {
    
    private String placa;
    private Motorista motorista;
    public static List<Onibus> listaOnibus = new ArrayList<Onibus>();

    public Onibus(String placa, Motorista motorista) {
        setPlaca(placa);
        setMotorista(motorista);
        listaOnibus.add(this);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) throws IllegalArgumentException {
        if (placa == null || placa.isEmpty() || placa.isBlank()) {
            throw new IllegalArgumentException("Placa do ônibus inválida");
        }
        this.placa = placa;
    }
    
    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) throws IllegalArgumentException {
        if (motorista == null) {
            throw new IllegalArgumentException("Motorista inválido");
        }
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "Placa do ônibus: " + getPlaca();
    }   
}