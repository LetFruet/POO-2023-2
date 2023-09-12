package Unidade01.Lista01.Exe17;
public class PontoRetangulo {

    //declarando atributos
    private double x1, y1;
    private double x2, y2;

    //encapsulando os métodos acessores e modificadores dos atributos (get e set)
    public PontoRetangulo(double x1, double y1, double x2, double y2){
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }

    //getters e setters
    public void setX1(double x1){
        this.x1 = x1;
    }

    public double getX1(){
        return this.x1;
    }

    public void setY1(double y1){
        this.y1 = y1;
    }

    public double getY1(){
        return this.y1;
    }

    public void setX2(double x2){
        this.x2 = x2;
    }

    public double getX2(){
        return this.x2;
    }

    public void setY2(double y2){
        this.y2 = y2;
    }

    public double getY2(){
        return this.y2;
    }

    //método que verifica se há ou não alguma intersecção entre o retângulo e o ponto
    //o método inicia retornando falso e, caso haja intersecção retorna verdadeiro
    public boolean verificarPonto(PontoRetangulo novoPonto){
        boolean inter = false;
        //verificando se o p1 (x1, y1) possui intersecção com algum ponto do retângulo base 
        if (novoPonto.x1 > getX1() && novoPonto.x1 < getX2() || novoPonto.x1 < getY1() && novoPonto.x1 > getY2() &&
            novoPonto.y1 > getX1() && novoPonto.y1 < getX2() || novoPonto.y1 < getY1() && novoPonto.y1 > getY2()) {
            inter = true;
        }
        //verificando se o p2 (x2, y2) possui intersecção com algum ponto do retângulo base 
        if (novoPonto.x2 > getX1() && novoPonto.x2 < getX2() || novoPonto.x2 < getY1() && novoPonto.x2 > getY2() &&
            novoPonto.y2 > getX1() && novoPonto.y2 < getX2() || novoPonto.y2 < getY1() && novoPonto.y2 > getY2()){
            inter = true;
        }
        return inter;
    }

    //método que verifica se há ou não alguma intersecção entre o retângulo e a linha
    //o método inicia retornando falso e, caso haja intersecção retorna verdadeiro
    public boolean verificarLinha(PontoRetangulo novoPonto){
        boolean inter1 = false;
        boolean inter2 = false;
        //verificando se o p1 (x1, y1) possui intersecção com algum ponto do retângulo base 
        if (novoPonto.x1 > getX1() && novoPonto.x1 < getX2() || novoPonto.x1 < getY1() && novoPonto.x1 > getY2() &&
            novoPonto.y1 > getX1() && novoPonto.y1 < getX2() || novoPonto.y1 < getY1() && novoPonto.y1 > getY2()) {
            inter1 = true;
        }
        //verificando se o p2 (x2, y2) possui intersecção com algum ponto do retângulo base 
        if (novoPonto.x2 > getX1() && novoPonto.x2 < getX2() || novoPonto.x2 < getY1() && novoPonto.x2 > getY2() &&
            novoPonto.y2 > getX1() && novoPonto.y2 < getX2() || novoPonto.y2 < getY1() && novoPonto.y2 > getY2()){
            inter2 = true;
        }
        //caso haja intersecção entre od dois pontos (que formam a linha), então o retorno é verdadeiro, senão é falso
        if (inter1 == true && inter2 == true) {
            return true;
        } else {
        return false;
        }
    } 
}