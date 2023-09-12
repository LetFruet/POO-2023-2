//Escreva um método que retorne uma String com o dia da semana, dado como argumentos o ano, o dia e o mês. Utilize o algoritmo abaixo: 
//valor = ano + dia + 3(mês -1) -1; 
//Se mês < 3 então ano = ano -1; 
//Senão valor = valor – (int)(0.4 x mês + 2.3); 
//valor = valor + (int) ano – (int)(0.75 x (1 + ano ) 
//                       4                      100 
//valor = valor MOD 7 
//Se valor = 0 então “domingo”  Se valor = 1 então “segunda-feira” 
package Unidade01.Lista01.Exe05;
public class PrincipalDiaDaSemana {
    
    public static void main(String[] args) {
        
        //criando objetos do tipo DiaDaSemana
        DiaDaSemana primeiraData = new DiaDaSemana(2010, 2, 2);
        DiaDaSemana segundaData = new DiaDaSemana(2004,9, 28);

        //chamando o método imprimir() para printar o dia da semana referente a cada data cadastrada
        System.out.println("O primeiro dia é " + primeiraData.imprimir());
        System.out.println("O segundo dia é " + segundaData.imprimir());
    }
}