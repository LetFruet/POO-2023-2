/**
 * @author Letícia Fruet
 */

 package Prova03.Parte02.Questao02;
import java.util.ArrayList;
import java.util.List;
public class DadosAcidente {
   
    private String cidade;
    private String tipoVeiculo;
    private int numAcidentes; 
    private String estadoCivil;
    public static List<DadosAcidente> listaDados = new ArrayList<DadosAcidente>();

    public DadosAcidente(String cidade, String tipoVeiculo, int numAcidentes, String estadoCivil) {
        setCidade(cidade);
        setTipoVeiculo(tipoVeiculo);
        setNumAcidentes(numAcidentes);
        setEstadoCivil(estadoCivil);
        listaDados.add(this);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getNumAcidentes() {
        return numAcidentes;
    }

    public void setNumAcidentes(int numAcidentes) {
        this.numAcidentes = numAcidentes;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public static List<DadosAcidente> getListaDados() {
        return listaDados;
    }

    public static void setListaDados(List<DadosAcidente> listaDados) {
        DadosAcidente.listaDados = listaDados;
    }

    public static String verificarCidadeMaisAcidentes() {

        int maiorNumAcidentes = 0;
        String maisAcidentes = "";

        for (DadosAcidente d1 : listaDados) {
            if (d1.getNumAcidentes() > maiorNumAcidentes) {
                maiorNumAcidentes = d1.getNumAcidentes();
                maisAcidentes = d1.getCidade();
            }
        }

        return maisAcidentes;
    }

    public static String verificarVeiculos() {

        String contCarro = "", contMoto = "", contCaminhao = "", contOnibus = "";
        String municipio = verificarCidadeMaisAcidentes();

        for (DadosAcidente d : listaDados) {
            if (d.getCidade() == municipio) {
                if (d.getTipoVeiculo().equalsIgnoreCase("carro")) {
                    contCarro = d.getNumAcidentes();
                } 
                if (d.getTipoVeiculo().equalsIgnoreCase("moto")) {
                    contMoto = d.getNumAcidentes();
                } 
                if (d.getTipoVeiculo().equalsIgnoreCase("caminhão")) {
                    contCaminhao = d.getNumAcidentes();
                } 
                if (d.getTipoVeiculo().equalsIgnoreCase("onibus")) {
                    contOnibus = d.getNumAcidentes();
                }
            }
        }

        return "Municipio(s) com maior(es) quantidade(s) de ocorrencias: " + verificarCidadeMaisAcidentes() + 
                "\nAcidentes com carro: " + contCarro + "\nAcidentes com moto: " + contMoto + 
                "\nAcidentes com caminhão: " + contCaminhao + "\nAcidentes com ônibus: " + contOnibus;
    }

    public static String verificarEstadoCivil() {

        int solteiro = 0, casado = 0, viuvo = 0, separado = 0, uniao = 0, cont = 0;
        String municipio = verificarCidadeMaisAcidentes(), maiorFrequencina = "";

        for (DadosAcidente d : listaDados) {
            if (d.getCidade() == municipio) {
                if (d.getEstadoCivil().equalsIgnoreCase("Solteiro")) {
                    solteiro++;
                } else if (d.getEstadoCivil().equalsIgnoreCase("Casado")) {
                    casado++;
                } else if (d.getEstadoCivil().equalsIgnoreCase("Viuvo")) {
                    viuvo++;
                } else if (d.getEstadoCivil().equalsIgnoreCase("Separado judicialmente")) {
                    separado++;
                } else if (d.getEstadoCivil().equalsIgnoreCase("Uniao estável")) {
                    uniao++;
                }
            }
        }

        int somaOcorrencias = solteiro + casado + viuvo + separado + uniao;

        if (solteiro > cont) {
            maiorFrequencina = "solteiro";
        } else if (casado > cont) {
            maiorFrequencina = "casado";
        } else if (viuvo > cont) {
            maiorFrequencina = "viuvo";
        } else if (separado > cont) {
            maiorFrequencina = "separado judicialmente";
        } else if (uniao > cont) {
            maiorFrequencina = "uniao estável";
        }

        double percSolteiro = 0, percCasado = 0, percViuvo = 0, percSeparado = 0, perctUniao = 0;

        percSolteiro = (solteiro / 100) * somaOcorrencias;
        percCasado = (casado / 100) * somaOcorrencias;
        percViuvo = (viuvo / 100) * somaOcorrencias;
        percSeparado = (separado / 100) * somaOcorrencias;
        perctUniao = (uniao / 100) * somaOcorrencias;

        return "Estado civil com maior ocorrencias: " + maiorFrequencina + "\nPercentual de acidente para cada caso: " +
                "\n- Solteiro: " + percSolteiro + "%" + "\n- Casado: " + percCasado + "%" + "\n- Viuvo: " + percViuvo + "%" +
                "\n- Separado judicialmente: " + percSeparado + "%" + "\n- União estável: " + perctUniao + "%";
    }
}