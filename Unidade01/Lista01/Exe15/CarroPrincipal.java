//Deseja-se criar uma classe para controlar a velocidade do carro, cujo diagrama UML é dado abaixo. Carro 
//- velocidade: double
//+ Carro() 
//+ Carro(double) 
//+ setCarro(double): void 
//+ getCarro(): String 
//+ setVelocidade(double): void 
//+ getVelocidade(): double 
//+ acelerar(double): void 
//+ reduzir(double): void 
//Implemente os métodos: 
//Carro() Construtor sem parâmetros que inicializa o atributo velocidade com o valor 0.0, usando o método setCarro() 
//Carro (double) Construtor que inicializa o atributo velocidade com 0.0, usando setCarro() 
//setCarro(double): void Método que chama setVelocidade para inicializar o atributo velocidade com o valor recebido como parâmetro 
//getCarro(): String: Método que usa getVelocidade e depois retorna uma String contendo o conteúdo do atributo velocidade no 
//seguinte formato: A velocidade atual do carro é de <velocidade> 
//setVelocidade(double): void Método que modifica o atributo velocidade, conforme parâmetro recebido, desde que não seja negativo 
//getVelocidade(): double Método que retorna a informação contida no atributo velocidade 
//acelerar(double): void: Método que modifica o conteúdo do atributo velocidade para velocidade + parâmetro recebido (usar setVelocidade), 
//mas desde que o valor do parâmetro seja maior ou igual a zero e menor que 20. Senão, imprime a mensagem “Não foi possível acelerar” e mantém 
//valor atual do atributo velocidade 
//reduzir(double): void: Método que modifica o conteúdo do atributo velocidade para velocidade - parâmetro recebido (usar setVelocidade), 
//mas desde que o valor do parâmetro seja maior ou igual a zero e menor que 30. Senão, imprime a mensagem “Não foi possível reduzir” e mantém 
//o valor atual do atributo velocidade. Desenvolver uma classe chamada PrincipalCarro, com método main(). Nesta classe, deve-se criar um objeto 
//a partir da classe Carro e atribuir valores aos atributos. Executar a chamada dos métodos para que seja possível analisar todas as 
//possibilidades que os métodos criados retomam
package Unidade01.Lista01.Exe15;
public class CarroPrincipal {
    
    public static void main(String[] args) {
    
        //criando um objeto do Carro
        Carro carro = new Carro(0.0);

        //chamando os métodos para printar as velocidades desejadas
        carro.setVelocidade(50);
        System.out.println("A velocidade inicial do carro é de: " + carro.getVelocidade());
        
        carro.acelerar(15);
        System.out.println("Após acelerar, a velocidade atual do carro é de: " + carro.getVelocidade());

        carro.reduzir(25);
        System.out.println("Após rezudir, " + carro.getCarro());
        
    }

}