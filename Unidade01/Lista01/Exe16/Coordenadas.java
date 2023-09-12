package Unidade01.Lista01.Exe16;

//criando a estrutura ponto
public class Coordenadas {
   
    //declarando atributos
    private double x;
    private double y;

    //encapsulando os métodos acessores e modificadores dos atributos (get e set)
    public Coordenadas(double x, double y) {
        setX(x);
        setY(y);
    }

    //criando métodos acessores e modificadores (setters/gettrs)
    //set: cadastra a característica
    public void setX(double x) {
        this.x = x; 
    }
    //get: mostra na tela a característica
    public double getX() {
        return x; 
    }
    public void setY(double y) {
        this.y = y; 
    }
    public double getY() {
        return y; 
    }

    //modificador de acesso + retorno + nome + ( + lista de parâmetros + )
    //método para verificar o quandrante onde o ponto se encontra
    private int verificarQuadrante() {
        if (getX() >= 0 && getY() >= 0) {
            return 1;
        } else if (getX() < 0 && getY() > 0) {
            return 2;
        } else if (getX() < 0 && getY() < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    //chamando o método verificarQuadrante() para printar a resposta
    public String imprimirResposta() {
            return "As coordendas ( " + getX() + ", " + getY() + " ) encontram-se no quadrante: " + verificarQuadrante();
    }
}