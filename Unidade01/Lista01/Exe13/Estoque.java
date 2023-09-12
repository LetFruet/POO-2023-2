package Unidade01.Lista01.Exe13;
public class Estoque {
     
    // definindo os atributos (características)
    private int codigo;
    private double valor;
    private int quantidade;
    
    public Estoque(int codigo, double valor, int quantidade) {
        setCodigo(codigo);
        setValor(valor);
        setQuantidade(0);
    }

    //getters e setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return this.quantidade;
    }

    //métodos para adicionar o valor desejado 
    public void adicionarProduto(int qtdProdutos){
        if(qtdProdutos > 0){
            setQuantidade(qtdProdutos);
        }
    }

    //método para verificar a disponibilidade do produto (true = disponível, false = indisponível)
    public boolean verificarDisponibilidade(int qtdDisponivel){
        if(getQuantidade() > 0 && getQuantidade() >= qtdDisponivel)
            return true;
        else 
            return false;
    }

    //método para verificar retirada da quantidade desejada do produto (true = possível, false = impossível)
    public boolean retirarProduto(int qtdeRetirada){
        if(getQuantidade() >= qtdeRetirada){
            setQuantidade(getQuantidade() - qtdeRetirada);
            return true;
        }
        else{
            return false;
        }
    }
}
