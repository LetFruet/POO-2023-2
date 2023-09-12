package Unidade01.Lista01.Exe08;
public class Retangulo {
 
    //declarando atributos
    private double x;
    private double y;

    //encapsulando os métodos acessores e modificadores dos atributos (get e set)
    public Retangulo(double x, double y) {
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

    //calculando a área do retângulo
    public double CalcularArea() {

        return getX() * getY();
    }

    //chamando o método CalcularArea() para imprimir a resposta 
    public double imprimir() {
        return CalcularArea();
    }
}