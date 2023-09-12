//Escreva um método que some dois valores do tipo int passados como parâmetros. Sobrecarregue o método para que ele consiga também somar valores 
//do tipo double. Cada método retorna o resultado da soma.
package Unidade01.Lista01.Exe04;
public class PrincipalSoma {
    
    public static void main(String[] args) {
        
        //criando objetos do tipo Soma
        Soma primeiraSoma = new Soma(1,1);
        Soma segundaSoma = new Soma(3,5);
        Soma terceiraSoma = new Soma(7,9);

        //chamando o método imprimir() para printar a soma referente a cada valor cadastrado
        System.out.println(primeiraSoma.imprimir());
        System.out.println(segundaSoma.imprimir());
        System.out.println(terceiraSoma.imprimir());
    }
}
