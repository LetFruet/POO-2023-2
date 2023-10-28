package Trabalho02;
import java.util.ArrayList;
import java.util.List;
public class Vilao extends Personagem {

    private int tempoDePrisao;
    public static List<Vilao> listaViloes = new ArrayList<Vilao>();

    public Vilao(String nome, String nomeVidaReal, int tempoDePrisao) {
        super(nome, nomeVidaReal);
        setTempoDePrisao(tempoDePrisao);
        listaViloes.add(this);
    }

    public int getTempoDePrisao() {
        return tempoDePrisao;
    }

    public void setTempoDePrisao(int tempoDePrisao) throws IllegalArgumentException {
        if (tempoDePrisao < 0) {
            throw new IllegalArgumentException("Tempo de prisão inválido");
        }
        this.tempoDePrisao = tempoDePrisao;
    }

    //for para percorrer a lista e organizar a saída
    private String printarLista() {
        String str = "";
        for (Superpoder s : getListaSuperpoders()) {
            str += s.getNome() + " (Categoria " + s.getCategoria() + ") | ";
        }
        return str;
    }

    @Override
    public String toString() {
        return "Vilão: " + getNome() + "\n    Nome real: " + getNomeVidaReal() + "\n    Poderes: " + printarLista() + "\n----------";
    }
}