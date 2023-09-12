//Desenvolver uma classe chamada Estoque com os atributos código, valor e quantidade. Implemente os métodos: 
//adicionarProduto(): Este método não retoma valor e deverá receber como parâmetro a quantidade de produtos a serem somados ao total do atributo 
//quantidade. Este método não fará nada quando o valor do parâmetro for menor ou igual a zero. 
//verificarDisponibilidade():Este método deverá retomar verdadeiro/false e receber um parâmetro inteiro. Será retornado TRUE caso existam produtos 
//disponíveis ou FALSE em caso contrário. A existência de produtos disponíveis significa que o atributo tem quantidade é maior que 0 e maior ou 
//igual ao parâmetro recebido. 
//retirarProduto(): Este método retorna verdadeiro/false e deverá receber como parâmetro a quantidade de produtos a serem retirados. Antes de 
//fazer a retirada do estoque, deve-se verificar se há disponibilidade do produto solicitado. Caso tenha, poderá diminuir do atributo quantidade 
//o valor recebido como parametro. Este método deverá retornar TRUE, caso tenha sucesso na retirada dos produtos. Caso contrário, retomar FALSE. 
//Desenvolver uma classe chamada PrincipalEstoque, com método main(). Nesta classe, deve-se criar um objeto da classe Estoque e atribuir valores 
//aos atributos código, descrição e valor, deixando a quantidade em estoque zerada. Executar a chamada dos métodos para que seja possível analisar
//todas as possibilidades que os métodos criados retomam. 
package Unidade01.Lista01.Exe13;
public class PrincipalEstoque {
    
    public static void main(String[] args) {
        
        //criando objetos do tipo Estoque
        Estoque primeiroEstoque = new Estoque(12345, 100, 0);

        //chamando os métodos para printar os valores finais referentes a cada cálculo
        primeiroEstoque.adicionarProduto(1000);
        System.out.println(primeiroEstoque.getQuantidade());
        System.out.println(primeiroEstoque.verificarDisponibilidade(5000));
        System.out.println(primeiroEstoque.retirarProduto(300));
    }
}