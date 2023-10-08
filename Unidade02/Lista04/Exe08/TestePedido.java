package Unidade02.Lista04.Exe08;

public class TestePedido {
    
    public static void main(String[] args) {
        
        Pedido umPedido = new Pedido(1, "Letícia");

        umPedido.adicionaItemAoPedido(new Produto(2, "X-Salada", 15.50));
        umPedido.adicionaItemAoPedido(new Produto(3, "Água",4));

        System.out.println(umPedido.toString());
    }
}
