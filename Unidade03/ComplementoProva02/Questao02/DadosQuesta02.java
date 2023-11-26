/**
 * @author Alana Andreazza e Leticia Fruet 
 */

package Questao02;
import java.util.ArrayList;
import java.util.List;
public class DadosQuesta02 {
    
    private String municipio;
    private String estadoCivil;
    private String sexo;
    public static List<DadosQuesta02> listaDados = new ArrayList<DadosQuesta02>();

    public DadosQuesta02(String municipio, String estadoCivil, String sexo) {
        setMunicipio(municipio);
        setEstadoCivil(estadoCivil);
        setSexo(sexo);
        listaDados.add(this);
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public static int verificarMunicipio() {

        int maiorFrequencia = 0, cont = 0, maiorMunicipio = 0;

        for (DadosQuesta02 d1 : listaDados) {
            int codigoMunicipio = Integer.parseInt(d1.getMunicipio());

            for (DadosQuesta02 d2 : listaDados) {
                if (Integer.parseInt(d2.getMunicipio()) == codigoMunicipio) {
                    cont++;
                }

                if (cont > maiorFrequencia) {
                    maiorFrequencia = cont;
                    maiorMunicipio = codigoMunicipio;
                }
            }
            cont = 0;
        }

        return maiorMunicipio;
    }

    public static String verificarSexo() {

        int contFem = 0, contMasc = 0, municipio = verificarMunicipio();
        for (DadosQuesta02 d : listaDados) {
            if (Integer.parseInt(d.getMunicipio()) == municipio) {
                if (Integer.parseInt(d.getSexo()) == 1) {
                    contMasc++;
                } else if (Integer.parseInt(d.getSexo()) == 2) {
                    contFem++;
                }
            }
        }

        return "Municipio com maior quantidade de ocorrencia: " + verificarMunicipio() + "\nQuantidade de ocorrencia do sexo feminino: " + 
                contFem + "\nQuantidade de ocorrencia do sexo masculino: " + contMasc;
    }

    public static String verificarEstadoCivil() {

        int estado1 = 0, estado2 = 0, estado3 = 0, estado4 = 0, estado5 = 0, estado9 = 0, municipio = verificarMunicipio();

        for (DadosQuesta02 d : listaDados) {
            if (Integer.parseInt(d.getMunicipio()) == municipio) {
                if (Integer.parseInt(d.getEstadoCivil()) == 1) {
                    estado1++;
                } else if (Integer.parseInt(d.getEstadoCivil()) == 2) {
                    estado2++;
                } else if (Integer.parseInt(d.getEstadoCivil()) == 3) {
                    estado3++;
                } else if (Integer.parseInt(d.getEstadoCivil()) == 4) {
                    estado4++;
                } else if (Integer.parseInt(d.getEstadoCivil()) == 5) {
                    estado5++;
                } else if (Integer.parseInt(d.getEstadoCivil()) == 9) {
                    estado9++;
                }
            }
        }
                
        int matriz[][] = {{1, estado1}, {2, estado2}, {3, estado3}, {4, estado4}, {5, estado5}, {9, estado9}};

        int maiorIncidencia = 0, numeroEstado = 0;

        for(int i = 0; i < matriz.length; i++){
            if (matriz[i][1] > maiorIncidencia) {
                maiorIncidencia = matriz[i][1];
                numeroEstado = matriz[i][0];
            }
        }

        String descEstadoCivil = "";
        if (numeroEstado == 1) {
            descEstadoCivil = "Solteiro";
        } else if (numeroEstado == 2) {
            descEstadoCivil = "Casado";
        } else if (numeroEstado == 3) {
            descEstadoCivil = "Viuvo";
        } else if (numeroEstado == 4) {
            descEstadoCivil = "Separado judicialmente";
        } else if (numeroEstado == 5) {
            descEstadoCivil = "Uniao consensual";
        } else if (numeroEstado == 9) {
            descEstadoCivil = "Ignorado";
        }

        return "Estado civil com maior ocorrencia: " + descEstadoCivil;
    }
}