// Crie uma classe Retangulo para representar um retângulo cujos pontos opostos sejam duas instâncias da classe Ponto. 
//Crie um método para calcular a área do retângulo.
package Unidade01.Lista01.Exe08;
public class PrincipalRetangulo {
 
    public static void main(String[] args) {
        
        //criando objetos do tipo Retangulo
        Retangulo primeiraArea = new Retangulo(1,1);
        Retangulo segundaArea = new Retangulo(3,5);
        Retangulo terceiraArea = new Retangulo(7,9);

        //chamando o método imprimir() para printar a área referente a cada ponto cadastrado
        System.out.println("A primeira área é: " + primeiraArea.imprimir());
        System.out.println("A segunda área é: " + segundaArea.imprimir());
        System.out.println("A terceira área é: " + terceiraArea.imprimir());
    }   
}
