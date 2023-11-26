/**
 * @author Alana Andreazza e Leticia Fruet 
 */

package Questao01;
import java.util.ArrayList;
import java.util.List;
public class DadosQuestao01 {
    
    private String municipio;
    private String populacao;
    public static List<DadosQuestao01> listaDados = new ArrayList<DadosQuestao01>();

    public DadosQuestao01(String municipio, String populacao) {
        setMunicipio(municipio);
        setPopulacao(populacao);
        listaDados.add(this);
    }

    public static List<DadosQuestao01> getListaDados() {
        return listaDados;
    }

    public static void setListaDados(List<DadosQuestao01> listaDados) {
        DadosQuestao01.listaDados = listaDados;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public static String verificarMenorPopulação() {

        int menorPopulacao = Integer.MAX_VALUE;
        String municipioMenorPopulacao = "";

        for (DadosQuestao01 d : listaDados) {
            if (Integer.parseInt(d.getPopulacao()) < menorPopulacao) {
                menorPopulacao = Integer.parseInt(d.getPopulacao());
                municipioMenorPopulacao = d.getMunicipio();
            }
        }

        return "Municipio com menor populacao: " + municipioMenorPopulacao + " - " + menorPopulacao + " habitantes";
    }

    public static String verificarMaiorPopulação() {

        int maiorPopulacao = Integer.MIN_VALUE;
        String municipioMaiorPopulacao = "";

        for (DadosQuestao01 d : listaDados) {
            if (Integer.parseInt(d.getPopulacao()) > maiorPopulacao) {
                maiorPopulacao = Integer.parseInt(d.getPopulacao());
                municipioMaiorPopulacao = d.getMunicipio();
            }
        }

        return "Municipio com maior populacao: " + municipioMaiorPopulacao + " - " + maiorPopulacao + " habitantes";
    }
}
