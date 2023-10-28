package Unidade02.Lista05.Exe06;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Avaliacao {
    
    private String avalSituacaoAtual;
    private List<String> itensMecanicos = new ArrayList<String>();

    public Avaliacao(String avalSituacaoAtual) {
        setAvalSituacaoAtual(avalSituacaoAtual);
    }

    public String getAvalSituacaoAtual() {
        return avalSituacaoAtual;
    }

    public void setAvalSituacaoAtual(String avalSituacaoAtual) throws IllegalArgumentException {
        if (!avalSituacaoAtual.equalsIgnoreCase("necessita de troca") && 
            !avalSituacaoAtual.equalsIgnoreCase("ruim") &&
            !avalSituacaoAtual.equalsIgnoreCase("razoavel") && 
            !avalSituacaoAtual.equalsIgnoreCase("bom") && 
            !avalSituacaoAtual.equalsIgnoreCase("otimo")) {
            throw new IllegalArgumentException("Aval da situação atual do carro inválido");
        }
        this.avalSituacaoAtual = avalSituacaoAtual;
    }

    public List<String> getItensMecanicos() {
        return Collections.unmodifiableList(itensMecanicos);
    }

    public void adicionarItensMecanicos(String item) {
        itensMecanicos.add(item);
    }
}