// Desenvolver uma classe chamada Apólice, com os seguintes atributos: nome, idade e valorPremio. A classe deverá conter os seguintes métodos: 
//imprimir(): Este método retorna uma String que mostrará na tela todos os atributos da classe Apólice 
//calcularPremio(): Este método não retoma valor, mas, deverá calcular o valor do prêmio seguindo as seguintes regras, para a idade: 
//- maior ou igual a 18 e menor ou igual a 25 anos, use a fórmula: valorPremio += (valorPremio * 20) / 100 
//- superior a 25 e menor ou igual a 36 anos, use a fórmula: valorPremio += (valorPremio * 15) / 100 
//- superior a 36, use a fórmula: valorPremio += (valorPremio * 10)/100. 
//oferecerDesconto(): Este método não retoma valor, mas recebe o parâmetro cidade, que irá conter o nome da cidade para o cálculo do desconto. 
//Caso a cidade seja Ilhota, dê um desconto no valor do prêmio de 5%. Caso seja Blumenau, dê um desconto no valor do prêmio de 3%. Caso seja 
//Itajaí, dê um desconto no valor do prêmio de 1%. Para realizar a comparação de strings neste exercício utilizar o método equals(). Desenvolver 
//uma classe chamada PrincipalApolice, com método main(). Nesta classe, deve-se criar um objeto da classe Apolice usando o comando: 
//Apolice umaApolice = new Apolice() e, 
//a) Para cada atributo da classe atribuir um valor; 
//b) Executar o método imprimir() e analisar o que será impresso na tela; 
//c) Em seguida, executar o método calcularPremio(); 
//d) Executar o método imprimir() novamente e analisar o que será exibido na tela ; 
//e) Executar o método oferecerDesconto() passando como parâmetro a cidade de Blumenau; 
//f) Executar novamente o método imprimir() e analisar o que será mostrado na tela
package Unidade01.Lista01.Exe12;
public class PrincipalApólice {
    
    public static void main(String[] args) {
                
        //criando um objeto do tipo Apolice
        Apolice umaApolice = new Apolice("João da Silva", 27, 900);

        //chamando o método imprimir() para printar os valores referente a cada método da classe Apolice
        System.out.println(umaApolice.imprimir());
        umaApolice.calcularPremio();
        System.out.println(umaApolice.imprimir());
        umaApolice.oferecerDesconto("Blumenau");
        System.out.println(umaApolice.imprimir());
    }
}
