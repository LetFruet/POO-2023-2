/*Escreva uma classe “Continente”. Um continente possui um nome e um conjunto de países, que dele fazem parte. 
Desenvolva um método que forneça a dimensão total do continente. */
package Unidade02.Lista04.Exe07;
import java.util.ArrayList;
import java.util.List;
public class Paises {
    
    private String nomePais; 
    private double dimensaoPais;
    public static List<Paises> listaPaises = new ArrayList<>(); //chama a partir da classe continente

    public Paises(String nomePais, double dimensaoPais) {
        setNomePais(nomePais);
        setDimensaoPais(dimensaoPais);
        listaPaises.add(this);
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) throws IllegalArgumentException {
        if (nomePais == null || nomePais.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do país inválido");
        }
        this.nomePais = nomePais;
    }

    public double getDimensaoPais() {
        return dimensaoPais;
    }

    public void setDimensaoPais(double dimensaoPais) throws IllegalArgumentException {
        if (dimensaoPais < 0) {
            throw new IllegalArgumentException("Dimensão do país inválida");
        }
        this.dimensaoPais = dimensaoPais;
    } 

    @Override
    public String toString() {

        return "País: " + getNomePais() + "\tDimensão: " + getDimensaoPais();
        
    }
}