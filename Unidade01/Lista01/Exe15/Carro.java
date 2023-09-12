package Unidade01.Lista01.Exe15;
public class Carro {

    //definindo os atributos 
    private double velocidade;

    //encapsulando os métodos acessores e modificadores dos atributos (get e set)
    public Carro(double velocidade) {
        setVelocidade(velocidade);
    }

    //getters e setters
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    //método para receber a velocidade 
    public void setCarro(double setVelocidade) {
        velocidade = setVelocidade;
    }

    //método para retornar a velocidade do carro
    public String getCarro(){

        return "A velocidade atual do carro é de " + getVelocidade();
    }
    
    //método para acelerar a velocidade do carro (de 0 a 19km)
    public void acelerar(double setVelocidade) {

        if (setVelocidade >= 0 && setVelocidade < 20) {
            velocidade += setVelocidade;
        } else {
            System.out.println("Não foi possível acelerar");
        }
    }

    //método para reduzor a velocidade do carro (de 0 a 29km)
    public void reduzir(double setVelocidade) {

        if (setVelocidade >= 0 && setVelocidade < 30) {
            velocidade -= setVelocidade;
        } else {
            System.out.println("Não foi possível reduzir");
        }
    }
}