package Unidade02.Revisao_Prova02.Revisao02;
public abstract class Produto {
    
    private String nomeProduto;
    private double valor;

    
    public Produto(String nomeProduto, double valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor incorreto");
        }
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto: " + getNomeProduto() + ".   Valor R$" + getValor();
    }
}
