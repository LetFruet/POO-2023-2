package Unidade01.Lista01.Exe09;
public class RetanguloModificado {
    
    //declarando atributos
    private double x1, y1;
    private double x2, y2;

    //encapsulando os métodos acessores e modificadores dos atributos (get e set)
    public RetanguloModificado(double x1, double y1, double x2, double y2){
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

    //método que verifica se há ou não alguma intersecção entre os dois retângulos
    //o método inicia retornando falso e, caso haja intersecção retorna verdadeiro
    public RetanguloModificado calcularInterseccao(RetanguloModificado novoRetangulo){
        boolean interseccao = false;
        //verificando se o p1 (x1, y1) possui intersecção com algum ponto do retângulo base 
        if (novoRetangulo.x1 > getX1() && novoRetangulo.x1 < getX2() || novoRetangulo.x1 < getY1() && novoRetangulo.x1 > getY2() &&
            novoRetangulo.y1 > getX1() && novoRetangulo.y1 < getX2() || novoRetangulo.y1 < getY1() && novoRetangulo.y1 > getY2()) {
            interseccao = true;
        }
        if (novoRetangulo.x2 > getX1() && novoRetangulo.x2 < getX2() || novoRetangulo.x2 < getY1() && novoRetangulo.x2 > getY2() &&
            novoRetangulo.y2 > getX1() && novoRetangulo.y2 < getX2() || novoRetangulo.y2 < getY1() && novoRetangulo.y2 > getY2()){
            interseccao = true;
        }

        //variáveis para guardar a interecção
        double intersecaoX1 = novoRetangulo.getX1();
        double intersecaoY1 = novoRetangulo.getY1();
        double intersecaoX2 = novoRetangulo.getX2();
        double intersecaoY2 = novoRetangulo.getY2();

        //verificando qual ponto intersecta o retângulo base
        if(getX1() > novoRetangulo.getX1()){
            intersecaoX1 = getX1();
        } 
        if(getY1() > novoRetangulo.getY1()){
            intersecaoY1 = getY1();
        }
        if(getX2() < novoRetangulo.getX2()){
            intersecaoX2 = getX2();
        } 
        if(getY2() < novoRetangulo.getY2()){
            intersecaoY2 = getY2();
        }

        //caso haja intersecção, há retono das variáveis, senão o retorno é vazio
        if(interseccao == true){
            return new RetanguloModificado(intersecaoX1, intersecaoY1, intersecaoX2, intersecaoY2);
        } else{
            return null;
        }
    }
}
        /*verificando qual ponto intersecta o retângulo base
        double intersecaoX1 = Math.max(getX1(), novoRetangulo.getX1()); // 1
        double intersecaoY1 = Math.max(getY1(), novoRetangulo.getY1()); // 1
        double intersecaoX2 = Math.min(getX2(), novoRetangulo.getX2()); // 8
        double intersecaoY2 = Math.min(getY2(), novoRetangulo.getY2()); // 8

        // Verifica se há interseção (método main)
        if (intersecaoX1 < intersecaoX2 && intersecaoY1 < intersecaoY2) {
            return new Retangulo(intersecaoX1, intersecaoY1, intersecaoX2, intersecaoY2);
        } else {
            return null;
        } */