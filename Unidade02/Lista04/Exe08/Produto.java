package Unidade02.Lista04.Exe08;

public class Produto {
    
    private int codigoProduto;
    private String descricaoProduto;
    private double valorProduto;

    public Produto(int codigoProduto, String descricaoProduto, double valorProduto) {
        setCodigoProduto(codigoProduto);
        setDescricaoProduto(descricaoProduto);
        setValorProduto(valorProduto);
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) throws IllegalArgumentException {
        if (codigoProduto < 0) {
            throw new IllegalArgumentException("Código do produto inválido");
        }
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) throws IllegalArgumentException {
        if (descricaoProduto == null || descricaoProduto.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição do produto inválida");
        }
        this.descricaoProduto = descricaoProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) throws IllegalArgumentException {
        if (valorProduto < 0) {
            throw new IllegalArgumentException("Valor do produto inválido");
        }
        this.valorProduto = valorProduto;
    }
    
    @Override
    public String toString() {

        return "\n   Código do produto: " + getCodigoProduto() + "\t|  Descrição: " + getDescricaoProduto() + "\t| Valor R$" + getValorProduto();

    }
}
