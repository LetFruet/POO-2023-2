//Escreva uma classe ModeloDeComputador que encapsule valores que definam a configuração de um microcomputador (tipo de processador, memória RAM, 
//tamanho do disco rígido, tamanho do monitor, por exemplo). Essa classe deve ter um método calculaPreço que calcule o preço do computador como 
//sendo a soma do custo de seus componentes: 
//- Placa-mãe: R$800 
//- Opções de processadores: 1.67Mhz a R$700, 2.23Mhz a R$830, 2.56Mhz a R$910 
//- Opções de memória: 2, 4, 6 ou 8Gb, cada 2Gb custa R$350. 
//- Opções de disco rígido: 320Gb a R$300, 5000Gb a R$420, 750Gb a R$500. 
//- Opções de monitor: 19 polegadas a R$320, 21 polegadas a R$520
package Unidade01.Lista01.Exe06;
public class PrincipalModeloDeComputador {
    
    public static void main(String[] args) {

        //criando objetos do tipo ModeloDeComputador
        ModeloDeComputador primeiroValor = new ModeloDeComputador(800, 910, 1400, 500, 520);
        ModeloDeComputador segundoValor = new ModeloDeComputador(800, 830, 1050, 420, 520);
        ModeloDeComputador terceiroValor = new ModeloDeComputador(800, 700, 350, 300, 320);

        //chamando o método imprimir() para printar o valor final referente a cada computador escolhido
        System.out.println("O valor final do primeiro computador é: R$ " + primeiroValor.imprimir());
        System.out.println("O valor final do segundo computador é: R$ " + segundoValor.imprimir());
        System.out.println("O valor final do terceiro computador é: R$ " + terceiroValor.imprimir());
    }
}
