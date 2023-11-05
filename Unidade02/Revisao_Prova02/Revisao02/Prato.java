package Unidade02.Revisao_Prova02.Revisao02;
import java.time.LocalDate;
import java.time.Month;
public class Prato extends Produto {

    private String ingredientes; 
    private boolean vegetariano;

    public Prato(String nomeProduto, double valor, String ingredientes, boolean vegetariano) {
        super(nomeProduto, valor);
        setIngredientes(ingredientes);
        setVegetariano(vegetariano);
    }

    public String getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(String ingredientes) throws IllegalArgumentException {
        if (ingredientes.length() < 2) {
            throw new IllegalArgumentException("Ingrediente inválido");
        }
        this.ingredientes = ingredientes;
    }
    public boolean isVegetariano() {
        return vegetariano;
    }
    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }
    
    public double getValor() {
        LocalDate dataAtual = LocalDate.now();
        Month mesAtual = dataAtual.getMonth();
        Month maio = Month.MAY;
        double valorFinal = super.getValor();
            
        if (mesAtual == maio) {
            valorFinal *= 1.1; 
        }
    
        return valorFinal;
    }
    

    @Override
    public String toString() {
        String str = super.toString() + ".   Ingredentes: " + getIngredientes();

        if (isVegetariano()) {
            str += ".   Prato vegetariano";
        }

        return str;
    }
}
