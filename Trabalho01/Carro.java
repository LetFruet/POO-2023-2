//Letícia Fruet

package Trabalho01;
public class Carro {
    
    //definindo e declarando os atributos (modelo, marca, placa, cor, ano, valor e localização)
    //private: priva o acesso aos dados atributos (só quem possui autorização pode acessar os dados)
    private String modelo;
    private String marca;
    private String placa;
    private String cor;
    private int ano;
    private double valor;
    private int localizacao; 

    //criando métodos acessores e modificadores dos atributos
    public Carro(String modelo, String marca, String placa, String cor, int ano, double valor, int localizacao) {
        setModelo(modelo);
        setMarca(marca);
        setPlaca(placa);
        setCor(cor);
        setAno(ano);
        setValor(valor);
        setLocalizacao(localizacao);
    }

    //setters: cadastram os atributos 
    //getters: retornam os atributos
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    } 

}