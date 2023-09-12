//Modifique a classe Retangulo para que esta contenha dois métodos adicionais: um para verificar se uma instância da classe Ponto 
//passada como argumento está localizada dentro da instância da classe Retangulo, que deverá retornar true se o ponto estiver dentro do retângulo, 
//e outro para fazer o mesmo com uma instância da classe Linha. Dica: Para verificar se um ponto está dentro do retângulo, verifique se as 
//coordenadas do ponto estão dentro das coordenadas do retângulo. Considerando a figura: onde (x1,y1) e (x2,y2) são as coordenadas que definem 
//o retângulo, o ponto P1 estaria fora do retângulo, uma vez que a sua coordenada y é menor do que a menor coordenada y do retângulo. O ponto P2 
//estaria dentro do retângulo, e o ponto P3 também estaria fora do retângulo. Para verificar se uma linha está dentro ou fora do retângulo, basta 
//verificar os dois pontos que formam suas extremidades: somente se os dois pontos estiverem dentro do retângulo, a linha também estará: na figura 
//acima, a linha L2 está dentro do retângulo, as linhas L1e L3, não.
package Unidade01.Lista01.Exe17;
public class PrincipalPontoRetangulo {
    
       public static void main(String[] args) {
        
        //definindo os pontos p1 e p2
        PontoRetangulo p1 = new PontoRetangulo(1, 1, 10, 10);
        PontoRetangulo p2 = new PontoRetangulo(6, 6, 8, 8);

        //printando se há ou não intersecção
        System.out.println("Verificando se uma instância da classe Ponto passada como argumento está localizada dentro da instância da classe Retangulo: " + p1.verificarPonto(p2));
        System.out.println("Verificando se uma instância da classe Linha passada como argumento está localizada dentro da instância da classe Retangulo: " + p1.verificarLinha(p2));
    }
}