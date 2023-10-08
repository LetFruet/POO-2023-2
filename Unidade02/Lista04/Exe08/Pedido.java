package Unidade02.Lista04.Exe08;
import java.util.ArrayList;
import java.util.List;
public class Pedido {
 
    private int numeroPedido;
    private String nomeCiente; 
    private List<Produto> listaItens = new ArrayList<>(); //1° passo agregação

    public Pedido(int numeroPedido, String nomeCiente) {
        setNumeroPedido(numeroPedido);
        setNomeCiente(nomeCiente);
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) throws IllegalArgumentException {
        if (numeroPedido < 0) {
            throw new IllegalArgumentException("Número do pedido inválido");
        }
        this.numeroPedido = numeroPedido;
    }

    public String getNomeCiente() {
        return nomeCiente;
    }

    public void setNomeCiente(String nomeCiente) throws IllegalArgumentException {
        if (nomeCiente == null || nomeCiente.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente inválido");
        }
        this.nomeCiente = nomeCiente;
    }

    public List<Produto> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Produto> listaItens) {
        this.listaItens = listaItens;
    }   
    
    public void adicionaItemAoPedido(Produto umProduto) {
        listaItens.add(umProduto); 
    }

    /*public void retiraItemAoPedido(Produto codigoProduto) {
        listaItens.remove(codigoProduto); 
    }*/

    private double calculaValorPedido() {
        double somaItens = 0;

        for (Produto p : listaItens) {
            somaItens += p.getValorProduto();
        }

        return somaItens;
    }

    @Override
    public String toString() {
        String dados = "-- Pedido: " + getNumeroPedido() + " \n   Cliente: " + getNomeCiente() + "\n"; 

        for (Produto p : listaItens) { 
            dados += p.toString();
        }
        return dados + "\n\n   Total: R$" + calculaValorPedido();
    }
}