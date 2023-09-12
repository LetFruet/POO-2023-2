package Unidade01.Lista01.Exe07;
//criando a estrutura ponto
public class Ponto {
   
    //declarando atributos
    private double x;
    private double y;

    //encapsulando os métodos acessores e modificadores dos atributos (get e set)
    public Ponto(double x, double y) {
        setX(x);
        setY(y);
    }

    //getters e setters
    public void setX(double x) {
        this.x = x; 
    }
    public double getX() {
        return this.x; 
    }
    public void setY(double y) {
        this.y = y; 
    }
    public double getY() {
        return this.y; 
    }
}