package Unidade02.Lista04.Exe10;
import java.util.List;
import java.util.ArrayList;
public class Aeroporto {
    
    private String codigoAeroporto; 
    private String nomeAeroporto;
    private boolean internacional;
    private List<Aviao> listaAvioes;
    public static List<Aeroporto> listaAeroportos = new ArrayList<>();
    public static List<Aeroporto> listaPartida = new ArrayList<>();
    public static List<Aeroporto> listaChegada = new ArrayList<>();

    public Aeroporto(String codigoAeroporto, String nomeAeroporto, boolean internacional) {
        setCodigoAeroporto(codigoAeroporto);
        setNomeAeroporto(nomeAeroporto);
        setInternacional(internacional);
        this.listaChegada = new ArrayList<>();
        this.listaPartida = new ArrayList<>();
    }

    public String getCodigoAeroporto() {
        return codigoAeroporto;
    }

    public void setCodigoAeroporto(String codigoAeroporto) throws IllegalArgumentException {
        if (codigoAeroporto == null || codigoAeroporto.trim().isEmpty()) {
            throw new IllegalArgumentException("Código do aeroporto inválido");
        }
        this.codigoAeroporto = codigoAeroporto;
    }

    public String getNomeAeroporto() {
        return nomeAeroporto;
    }

    public void setNomeAeroporto(String nomeAeroporto) throws IllegalArgumentException {
        if (nomeAeroporto == null || nomeAeroporto.trim().isEmpty()) {
            throw new IllegalArgumentException("Código do aeroporto inválido");
        }
        this.nomeAeroporto = nomeAeroporto;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public List<Aviao> getListaAvioes() {
        return listaAvioes;
    }

    public void setListaAvioes(List<Aviao> listaAvioes) {
        this.listaAvioes = listaAvioes;
    }

    public static List<Aeroporto> getListaPartida() {
        return listaPartida;
    }

    public static void setListaPartida(List<Aeroporto> listaPartida) {
        Aeroporto.listaPartida = listaPartida;
    }

    public static List<Aeroporto> getListaChegada() {
        return listaChegada;
    }

    public static void setListaChegada(List<Aeroporto> listaChegada) {
        Aeroporto.listaChegada = listaChegada;
    }

    public boolean equals(Aeroporto outroAeroposto) {
        
        for (Aeroporto a : listaAeroportos) {
            if (a.getCodigoAeroporto() == outroAeroposto.getCodigoAeroporto()) {
                return true;
            } 
        }
        return false;
    }
}

/*
d) Um método que receba um prefixo de avião como parâmetro e informe se a aeronave está pousada nele 
e) Um método que receba um outro aeroporto como parâmetro e verifique se existe alguma forma de se chegar nele. Para isto, o aeroporto 
deve verificar se ele possui vôo partindo para o aeroporto desejado, e caso não saia, se existe alguma forma de chegar nele à partir 
dos aeroportos de onde sai − public boolean possuiRota(Aeroporto aeroporto) 
Obs.: A quantidade máxima de aeronaves que um aeroporto pode ter em terra é igual a 100 e a quantidade 
máxima de outros aeroportos com os quais o aeroporto pode ter linhas saindo e chegando é 100. */ 