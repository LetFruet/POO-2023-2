//calcular o valor de imposto de renda (IRPF) a ser pago por uma pessoa. O cálculo do imposto de renda baseia-se no valor de salário recebido 
//pela pessoa. Para calcular o imposto, o governo criou uma tabela que define em que faixa o salário se enquadra:
//Faixa || Faixa de Salário                   || Alíquota
//1ª    || Faixa Até R$ 1.903,98              || Isento
//2ª    || Faixa De R$ 1.903,99 à R$ 2.826,65 || 7,5%
//3ª    || Faixa De R$ 2.826,66 à R$ 3.751,05 || 15,0%
//4ª    || Faixa De R$ 3.751,06 à R$ 4.664,68 || 22,5%
//5ª    || Faixa A partir de R$ 4.664,69      || 27,5%
//exemplificando com um salário de R$ 3.000,00:
//Faixa || Descrição                                                                                                          || Imposto
//1ª    || Para R$ 1.903,98 do valor do salário, não se paga imposto, pois conforme Tabela 1, para este valor está-se isento. ||  R$ 0,00
//2ª    || Como o salário é superior a 1.903,98, paga-se imposto sobre a diferença do salário com o limite da faixa anterior, considerando-se 
//o limite da faixa corrente que é de 2.826,65. Paga-se 7,5% de imposto sobre R$ 922,67 (R$ 2.826,65 – R$ 1.903,98).          ||  R$ 69,20
//3ª    || Como o salário é superior a R$ 2.826,66, paga-se imposto sobre a diferença do salário com o limite da faixa imediatamente anterior. 
//Considerando o limite desta faixa que é de R$ 3.751,05. Deve-se pagar a alíquota de 15% sobre R$ 173,35 (diferença entre R$ 3.000,00 e 
//R$ 2.826,65). R$ 26,00
//Total (soma-se o valor de todas as faixas) R$ 95,20
//Portanto, o indivíduo que recebe o salário de R$ 3.000,00 deverá pagar R$ 95,20 de imposto por mês.Para solucionar o problema, implemente o 
//diagrama de classes abaixo:
//- O atributo nome deva ser utilizado para armazenar o nome de um funcionário;
//- O atributo salario deva representar o salário de um funcionário;
//- O método calcularIrpf() deve ser utilizado para retornar o valor de imposto de renda (IRPF) a ser cobrado sobre o salário informado, 
//utilizando o algoritmo descrito anteriormente.
package Exe01;
public class PrincipalFuncionario {
    
    public static void main(String[] args) {
        
        //criando um objeto do tipo Funcionario
        Funcionario primeiroSalario = new Funcionario("Letícia", 3000);

        //chamando o método imprimir() para printar o resultado
        System.out.println(primeiroSalario.imprimir());
    }
}