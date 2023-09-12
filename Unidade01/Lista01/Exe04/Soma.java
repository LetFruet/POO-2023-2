package Unidade01.Lista01.Exe04;
public class Soma {
    
    //definindo os atributos 
    private int valor01;
    private int valor02;

    //encapsulamento dos métodos acessores e modificadores dos atributos 
    public Soma(int valor01, int valor02) {
        setValor01(valor01);
        setValor02(valor02);
    }
    
    //getters e setters
    public void setValor01(int valor01) {
        this.valor01 = valor01;
    }
    public int getValor01(){
        return this.valor01;
    }
    public void setValor02(int valor02) {
        this.valor02 = valor02;
    }
    public int getValor02(){
        return this.valor02;
    }

    //realizando a soma dos valores cadastrados
    public int soma(){
        return getValor01() + getValor02();
    }

    //chamando o método soma() para imprimir a resposta 
    public int imprimir() {
        return soma();
    }
}