//Deseja-se criar uma classe que simule operações financeiras, cujo diagrama UML é dado abaixo.  
//- nome: String 
//- saldo: double
//+ ContaCorrente() 
//+ ContaCorrente(String) 
//+ ContaCorrente(String, double) 
//+ setContaCorrente(String, double): void 
//+ setNome(String): void 
//+ setSaldo(double): void 
//+ getNome(): String 
//+ getSaldo(): double 
//+ getStatusContaCorrente(): String 
//+ fazerDeposito(double): boolean 
//+ fazerRetirada(double): boolean 
//+ fazerTransferencia(ContaCorrente, double): boolean
//Implemente os métodos: 
//ContaCorrente() Construtor sem parâmetros que inicializa os atributos nome e saldo com os valores “SemNome” e 0.0, respectivamente, usando o 
//método setContaCorrente 
//ContaCorrente(String) Construtor que inicializa o atributo nome com o parâmetro recebido e o atributo saldo com 0.0, usando setContaCorrente() 
//ContaCorrente(String, double) Construtor que inicializa o atributo nome com o primeiro parâmetro recebido e o atributo saldo com o segundo. 
//setContaCorrente(String, double) Método que chama setNome e setSaldo para inicializar os atributos nome e saldo com os valores recebidos como parâmetro. 
//setNome(String): void Método que modifica o atributo nome, conforme parâmetro recebido 
//setSaldo(double): void Método que modifica o atributo saldo, conforme parâmetro recebido 
//getNome(): String Método que retorna a informação contida no atributo nome 
//getSaldo(): double Método que retorna a informação contida no atributo saldo 
//getStatusContaCorrente(): String 
//Método que usa os métodos getNome e getSaldo para retornar uma String contendo o status da conta a partir das informações contidas nos 
//atributos nome e saldo. Formato saída: <nome> seu saldo atual é de <saldo>  
//fazerDeposito(double): boolean: Método que modifica o conteúdo do atributo saldo para saldo + parâmetro recebido (usar setSaldo). 
//Se a operação for realizada com sucesso, retornar True, caso contrário, retornar False 
//fazerRetirada(double): boolean: Método que modifica o conteúdo do atributo saldo para saldo - parâmetro recebido (usar setSaldo). 
//Antes de fazer a retirada, deve-se verificar se há disponibilidade (saldo maior ou igual ao parâmetro recebido). Se a operação for realizada 
//com sucesso, retornar True, caso contrário, retornar False 
//fazerTransferencia(ContaCorrente, double): boolean: Método que modifica o conteúdo do atributo saldo para saldo – parâmetro recibo (usar 
//fazerRetirada). Se o método fazerRetirada retornar False, isso quer dizer que o saldo suficiente (retorne False indicando que a operação não pode 
//ser realizada). Do contrário, efetue a transferência a partir da conta corrente recebida como parâmetro (referência da conta corrente destino), 
//chamando o método fazerDeposito passando o segundo parâmetro recebido como valor a ser transferido. Desenvolver uma classe chamada
//PrincipalContaCorrente, com método main(). Nesta classe, deve-se criar dois objetos a partir da classe ContaCorrente e atribuir valores aos . 
//atributos Executar a chamada dos métodos para que seja possível analisar todas as possibilidades que os métodos criados retomam
package Unidade01.Lista01.Exe16;
public class PrincipalCoordenadas {
    public static void main(String[] args) {
        
    //criando objetos do tipo ponto 
    Coordenadas coord1 = new Coordenadas(2,2); 
    Coordenadas coord2 = new Coordenadas(-3, 1);

    //chamando o método imprimir() para printar o quadrante referente a cada ponto cadastrado
    System.out.println(coord1.imprimirResposta());
    System.out.println(coord2.imprimirResposta());
    }
}