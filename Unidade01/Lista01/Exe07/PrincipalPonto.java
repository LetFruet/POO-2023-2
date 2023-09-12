//É necessário desenvolver um método para calcular a distância de dois pontos em um sistema de coordenadas cartesiano. Este valor é dado pela 
//equação: d = raiz[ (x1 – x2)^2 + (y1 – y2)^2 ]. Onde: x1 e y1 são as coordenadas do ponto 1 e x2 e y2 as do ponto 2, que devem ser passadas como 
//argumentos para calcular a distância entre os dois pontos. Retorne o valor em double e responda: a distância pode ser negativa? Sim/Não e por quê? 
package Unidade01.Lista01.Exe07;
public class PrincipalPonto {
    
    //modificador de acesso + retorno + nome + ( + lista de parâmetros + )
    //public +
    //private -
    
    //tenho acesso aos pontos para fazer o cálculo? Não, portanto há necessidade de parâmetros
    public static double calcularDistancia(Ponto p1, Ponto p2) {
    
        //diferença entre x1 e x2 elevada ao quadrado
        double difX = Math.pow(p1.getX() - p2.getX(), 2);
        
        //diferença entre y1 e y2 elevada ao quadrado
        double difY = Math.pow(p1.getY() - p2.getY(), 2);

        //somar as diferenças e tirar a raiz
        return Math.sqrt(difX + difY);
    }  

    public static void main(String[] args) {

        Ponto vetor[] = new Ponto[7];

        //criando vários objetos do tipo Ponto e armazenando dentro do vetor 
        vetor[0] = new Ponto(1,1);
        vetor[1] = new Ponto(1,3);
        vetor[2] = new Ponto(2,4);
        vetor[3] = new Ponto(4,5);
        vetor[4] = new Ponto(-1,3);
        vetor[5] = new Ponto(1,4);
        vetor[6] = new Ponto(-1,-3);
    
        double menorDistancia = 99;
        double distancia = 0;
        Ponto p1 = null, p2 = null;

        //varrendo o vetor de Pontos
        for(int i=0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {

                //calculando e armazenando a distância entre os pontos 
                distancia = calcularDistancia(vetor[i], vetor[j]);

                //verificando se a distância calculada é a menor 
                calcularDistancia(vetor[i], vetor[j]);
                if (calcularDistancia(vetor[i], vetor[j]) < menorDistancia) {
                    menorDistancia = distancia;
                    p1 = vetor[i];
                    p2 = vetor[j];
                }
                
                System.out.println("A distância é: " + distancia);
            }
        }
        
        System.out.println("---------------------------------");
        System.out.println("A menor distância é: " + menorDistancia + "\nOs pontos P1 são: " + "\nX: " + p1.getX() + " Y: " + p1.getY() + 
                           "\nOs pontos P2 são: " + "\nX: " + p2.getX() + " Y: " + p2.getY());
    
    /*
    //criando um objeto do tipo ponto 
    Ponto p1 = new Ponto(1,1); 
    Ponto p2 = new Ponto(1,3);

    //chamando método que calcula a distância euclidiana
    //estanciar um objeto, ou tornar o método estático para conseguir chamar ele
    calcularDistancia(p1, p2);
    System.out.println("Distância calculada: " + calcularDistancia(p1, p2));
    */
    }
}