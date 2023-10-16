package Unidade02.Lista04.Exe10;
import java.util.List;
import java.util.ArrayList;
public class Aeroporto {
    
    private String codigoAeroporto; 
    private String nomeAeroporto;
    private boolean internacional;
    private List<Aviao> listaAvioes = new ArrayList<>();
    public static List<Aeroporto> listaAeroportos = new ArrayList<>();
    public static List<Aeroporto> listaPartida = new ArrayList<>();
    public static List<Aeroporto> listaChegada = new ArrayList<>();

    public Aeroporto(String codigoAeroporto, String nomeAeroporto, boolean internacional) {
        setCodigoAeroporto(codigoAeroporto);
        setNomeAeroporto(nomeAeroporto);
        setInternacional(internacional);
        listaAeroportos.add(this);
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

    public boolean aeronavePousada(String prefixo) {
        for (Aviao a : listaAvioes) {
            if (a.getNomeModelo().equals(prefixo)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean possuiRota(Aeroporto aeroporto) {
        if (listaPartida.contains(aeroporto)) {
            return true;
        }
        for (Aeroporto a : listaPartida) {
            if (a.possuiRota(aeroporto)) {
                return true;
            }
        }
        return false;
    }

    public boolean aviaoComPrefixo(String prefixo) {
        for (Aviao a : listaAvioes) {
            if (a.verificarPrefixo().equals(prefixo)) {
                return true;
            }
        }
        return false;
    }

    public void adicionarAviao(Aviao novoAviao) {
        listaAvioes.add(novoAviao);
    }

    public void adicionarPartida(Aeroporto novaPartida) {
        listaPartida.add(novaPartida);
    }

    @Override
    public String toString() {

        String str = "Aeroporto: " + getNomeAeroporto() + "\nCódigo: " + getCodigoAeroporto();

        if (isInternacional()) {
            str += "\nInternacional";
        }
        return str;
    }
}