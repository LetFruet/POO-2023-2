//Escreva um método que recebe como argumento um ano e retorne 1 se este for bissexto e 0 se não for um ano bissexto. 
//Um ano é bissexto se for divisível por 4, mas não por 100. Um ano também é bissexto se for divisível por 400.
package Unidade01.Lista01.Exe03;
public class PrincipalAnoBissexto {
    
    public static void main(String[] args) {

        //criando objetos do tipo AnoBissexto (primeiroAno, segundoAno e terceiroAno)
        AnoBissexto primeiroAno = new AnoBissexto();
        AnoBissexto segundoAno = new AnoBissexto();
        AnoBissexto terceiroAno = new AnoBissexto();

        //atribuindo anos atrelados às variáveis AnoBissexto
        primeiroAno.setAno(2000);
        segundoAno.setAno(2015);
        terceiroAno.setAno(2024);

        //chamando o método imprimir() para printar se o ano cadastrado é ou não é bissexto
        System.out.println("O primeiro ano é " + primeiroAno.imprimir());
        System.out.println("O primeiro ano é " + segundoAno.imprimir());
        System.out.println("O primeiro ano é " + terceiroAno.imprimir());
    }
}
