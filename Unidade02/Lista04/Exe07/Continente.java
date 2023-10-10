package Unidade02.Lista04.Exe07;
import java.util.ArrayList;
import java.util.List;
public class Continente {
   
    private String nome;
    public static List<Continente> listaContinentes = new ArrayList<>(); //chama a partir da classe continente
    private List<Paises> listaPaises = new ArrayList<>();

    public Continente(String nome) {
        setNome(nome);
        listaContinentes.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do continente inválido");
        }
        this.nome = nome;
    }

    public List<Paises> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(List<Paises> listaPaises) {
        this.listaPaises = listaPaises;
    }

    public void adicionar(Paises novoPais) {
        listaPaises.add(novoPais);
    }

    public String calcularDimensaoContinente() {
        
        double dimensaoTotal = 0;
        for (Paises p : listaPaises) {
            dimensaoTotal += p.getDimensaoPais();
        }
        return "A dimensão territorial do contininente é de " + dimensaoTotal + " Km²";
    }

    @Override
    public String toString() {

        return "Coninente: " + getNome() + "\tDimensão: " + calcularDimensaoContinente();
        
    }
}