// LETÍCIA FRUET

package Prova02;
public class Motorista extends Passageiro {

    private String cnh;

    public Motorista(String nome, String cnh) {
        super(nome);
        setCnh(cnh);
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) throws IllegalArgumentException {
        if (cnh == null || cnh.isEmpty() || cnh.isBlank()) {
            throw new IllegalArgumentException("Registro da CNH inválido");
        }
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return super.toString() + ". Registro de CNH: " + getCnh();
    }
}