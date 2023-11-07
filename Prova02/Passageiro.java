// LETÍCIA FRUET

package Prova02;
import java.util.ArrayList;
import java.util.List;
public class Passageiro {
    
    private String nome;
    private double tarifa;
    public static List<Passageiro> listaPassageiro = new ArrayList<Passageiro>();

    public Passageiro(String nome) {
        setNome(nome);
        setTarifa(5.30);
        listaPassageiro.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do passageiro inválido");
        }
        this.nome = nome;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) throws IllegalArgumentException {
        if (tarifa != 5.30) {
            throw new IllegalArgumentException("Valor da tarifa inválida");
        }
        this.tarifa = tarifa;
    } 

    @Override 
    public String toString() {
        return "Nome: " + getNome() + "\nValor base da tarifa R$ " + getTarifa();
    }
}