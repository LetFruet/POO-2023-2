package Unidade02.Revisao_Prova02.Revisao02;
import java.util.ArrayList;
import java.util.List;
public class Cardapio {
    
    private String nome;
    private int versao;
    public static List<Produto> listaProdutos = new ArrayList<Produto>();

    public Cardapio(String nome, int versao) {
        setNome(nome);
        setVersao(versao);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVersao() {
        return versao;
    }
    public void setVersao(int versao) {
        this.versao = versao;
    }

    public void addBebida(String nome, double valor, boolean alcoolica) {

        Bebida umBebida = new Bebida(nome, valor, alcoolica);
        listaProdutos.add(umBebida);
    }
    
    public void addVinho(String nome, double valor, int safra, String tipo) {

        Vinho umVinho = new Vinho(nome, valor, safra, tipo);
        listaProdutos.add(umVinho);
    }

    public void addPrato(String nome, double valor, String ingredientes, boolean vegetariano) {

        Prato umPrato = new Prato(nome, valor, ingredientes, vegetariano);
        listaProdutos.add(umPrato);
    }

    public static double getMediaValor() {

        double mediaValorFinal = 0;

        for (Produto p : listaProdutos) { 
            mediaValorFinal += p.getValor();
        }

        return mediaValorFinal;
    }

    public static String getListaProdutos() {

        String str = "";

        for (Produto p : listaProdutos) {
            str += p.toString() + "\n";
        }

        return str;
    }

    public static String listaProdutosOrdenados() {
        String str = "";

        /*o método sort aceita um comparador que determina como os elementos da lista serão ordenados. Neste caso, usa-se uma expressão lambda (p1, p2) -> 
          Double.compare(p2.getValor(), p1.getValor()) como comparador. Esta expressão compara dois produtos p1 e p2 com base em seus valores em ordem decrescente. */

        listaProdutos.sort((p1, p2) -> Double.compare(p2.getValor(), p1.getValor()));

        for (Produto p : listaProdutos) {
            str += p.toString() + "\n";
        }

        return str;
    }
}