//Crie um novo programa que solicite ao usuário o nome e o salário de 5 funcionários. Armazene os funcionários num vetor. 
//Ao final da digitação dos funcionários, exiba uma relação (lista) contendo o nome do funcionário, salário e IRPF
package Exe02;
public class PrincipalFuncionario2 {
    
    public static void main(String[] args) {

        //criando objetos do tipo Funcionario
        Funcionario2 vetor[] = new Funcionario2[5];

        //populando o vetor com as informações necessárias sobre o funcionário
        vetor[0] = new Funcionario2("Letícia", 1000);
        vetor[1] = new Funcionario2("Ana", 2000);
        vetor[2] = new Funcionario2("Lucas", 3000);
        vetor[3] = new Funcionario2("Luiz", 4000 );
        vetor[4] = new Funcionario2("André", 5000);

        //chamando o método imprimir() para printar as respostas
        System.out.println(vetor[0].imprimir());
        System.out.println(vetor[1].imprimir());
        System.out.println(vetor[2].imprimir());
        System.out.println(vetor[3].imprimir());
        System.out.println(vetor[4].imprimir());

        //inicializando variável para armazenar o maior IRPF
        double maiorImposto = Integer.MIN_VALUE;
        Funcionario2 funcionarioComMaiorIRPF = null;

        //encontrando o funcionário com o maior IRPF
        for (int i = 0; i < vetor.length; i++) {
            double imposto = vetor[i].calcularIrpf();
            if (imposto > maiorImposto) {
                maiorImposto = imposto;
                funcionarioComMaiorIRPF = vetor[i];
            }
        }
        
        //imprimindo o funcionário com o maior IRPF
        System.out.println("\nFuncionário que paga mais IRPF: " + funcionarioComMaiorIRPF.imprimir());    
    }
}