package Unidade01.Lista01.Exe12;
public class Apolice {
     
    //definindo os atributos
    private String nome;
    private int idade;
    private double valorPremio;
    
    //encapsulando os métodos acessores e modificadores dos atributos (get e set)
    public Apolice(String nome, int idade, double valorPremio) {
        setNome(nome);
        setIdade(idade);
        setValorPremio(valorPremio);
    }

    //getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }
    public double getValorPremio(){
        return this.valorPremio;
    }

    //realizando a soma dos valores
    public void calcularPremio(){
       
        if (idade >= 18 && idade <= 25) {
            valorPremio += (valorPremio * 20) / 100; 
        } else if (idade > 25 && idade <= 36) {
            valorPremio += (valorPremio * 15) / 100 ;
        } else if (idade > 36) {
            valorPremio += (valorPremio * 10) / 100; 
        }
    }

    //realizando a conta dos descontos 
    public void oferecerDesconto(String cidade) {

        if (cidade.equals("Ilhota")) {
            valorPremio = valorPremio - (valorPremio * 0.05);
        } else if (cidade.equals("Blumenau")) {
            valorPremio = valorPremio - (valorPremio * 0.03);
        } else if (cidade.equals("Itajaí")) {
            valorPremio = valorPremio - (valorPremio * 0.01);
        }
    }

    //chamando os atributos para imprimir a resposta 
    public String imprimir() {
        String atributos = "Nome: " + getNome() + " | Idade: " + getIdade() + " | Valor dos prêmios: " + getValorPremio();

        return atributos;
    }
}