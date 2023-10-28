package Trabalho02;
import java.util.ArrayList;
import java.util.List;
public class SuperHeroi extends Personagem {
    
    public static List<SuperHeroi> listaHerois = new ArrayList<SuperHeroi>();

    public SuperHeroi(String nome, String nomeVidaReal) {
        super(nome, nomeVidaReal);
        setListaSuperpoders(aumentarPoderTotal());
        listaHerois.add(this);
    }
 
    public double getPoderTotal() {
        double somarPoderes = 0;
        for (Superpoder s : getListaSuperpoders()) {
            somarPoderes += s.getCategoria();
        }
        return somarPoderes;
    }

    public List<Superpoder> aumentarPoderTotal() {

        List<Superpoder> listaRetorno = new ArrayList<Superpoder>();

        for (Superpoder s : super.getListaSuperpoders()) {
            double aumentarPoder = s.getCategoria() * 1.1;
            listaRetorno.add(new Superpoder(getNome(), aumentarPoder));
        }

        return listaRetorno;
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
        return "Herói: " + getNome() + "\n    Nome real: " + getNomeVidaReal() + "\n    Poderes: " + printarLista() + "\n----------";
    }
}
