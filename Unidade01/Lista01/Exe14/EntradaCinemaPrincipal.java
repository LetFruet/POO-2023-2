//Desenvolver uma classe chamada EntradaCinema com os atributos dataFilme, horário, sala e valor. Implemente os métodos: 
//EntradaCinema(): Construtor: com a finalidade de inicializar todos os atributos. 
//CalculaDesconto(): Este método receberá como parâmetro a data de nascimento do cliente (do tipo Data) e caso seja menor de 12 anos,  
//deve ser dado um desconto de 50% no valor normal. 
//CalculaDesconto(): Este método receberá como parâmetro a data de nascimento do cliente (do tipo Data) e o número de sua carteira de 
//estudante (do tipo int). Se o estudante tiver idade entre 12 e 15 anos, deve ser dado um desconto de 40%, de 16 a 20 um desconto de 
//30% e mais que 20 anos um desconto de 20% no valor normal. 
//CalculaDescontoHorário() Este método deve dar um desconto de 10% sobre o valor aferido após todas as outras opções de desconto,  
//caso o horário do filme seja antes das 16 horas. 
//toString() Este método deve imprimir todos os dados do ingresso. 
//Desenvolver uma classe chamada PrincipalCinema, com método main(), que leia os dados necessários para instanciar e imprimir o 
//ingresso para clientes normais, menores de 12 anos e estudantes.
package Unidade01.Lista01.Exe14;
import java.time.LocalDate;
import java.time.LocalTime;
public class EntradaCinemaPrincipal {
    
    public static void main(String[] args) {
        
        //criando as variáveis e chamando os métodos para printar as respostas desejadas
        EntradaCinema primeiraEntrada = new EntradaCinema(LocalDate.of(2023, 9, 5), LocalTime.of(15, 30), 1, 100); 
        System.out.println("Primeiro cliente: \nData de nascimento: " + LocalDate.of(1990, 1, 1));
        System.out.println("    Sem Desconto:\n" + primeiraEntrada.toString());
        primeiraEntrada.CalculaDesconto(LocalDate.of(1990, 1, 1));
        System.out.println("    Com Desconto por Idade:\n" + primeiraEntrada.toString());
        primeiraEntrada.CalculaDesconto(LocalDate.of(1990, 1, 1), 123);  
        System.out.println("    Com Desconto Estudantil:\n" + primeiraEntrada.toString());
        primeiraEntrada.CalculaDescontoHorário(LocalTime.of(15, 30));  
        System.out.println("    Com Desconto de Horário:\n" + primeiraEntrada.toString());
        
        EntradaCinema segundaEntrada = new EntradaCinema(LocalDate.of(2023, 9, 5), LocalTime.of(16, 30), 8, 100); 
        System.out.println("---------------------");
        System.out.println("Segundo cliente: \nData de nascimento: " + LocalDate.of(2008, 5, 8));
        System.out.println("    Sem Desconto:\n" + segundaEntrada.toString());
        segundaEntrada.CalculaDesconto(LocalDate.of(2008, 5, 8));
        System.out.println("    Com Desconto por Idade:\n" + segundaEntrada.toString());
        segundaEntrada.CalculaDesconto(LocalDate.of(2008, 5, 8), 456);  
        System.out.println("    Com Desconto Estudantil:\n" + segundaEntrada.toString());
        segundaEntrada.CalculaDescontoHorário(LocalTime.of(16, 30));  
        System.out.println("    Com Desconto de Horário:\n" + segundaEntrada.toString());

        EntradaCinema terceiraEntrada = new EntradaCinema(LocalDate.of(2023, 9, 5), LocalTime.of(17, 45), 6, 100); 
        System.out.println("---------------------");
        System.out.println("Terceiro cliente: \nData de nascimento: " + LocalDate.of(2015, 10, 19));
        System.out.println("    Sem Desconto:\n" + terceiraEntrada.toString());
        terceiraEntrada.CalculaDesconto(LocalDate.of(2015, 10, 19));
        System.out.println("    Com Desconto por Idade:\n" + terceiraEntrada.toString());
        terceiraEntrada.CalculaDesconto(LocalDate.of(2015, 10, 19), 789);  
        System.out.println("    Com Desconto Estudantil:\n" + terceiraEntrada.toString());
        terceiraEntrada.CalculaDescontoHorário(LocalTime.of(17, 45));  
        System.out.println("    Com Desconto de Horário:\n" + terceiraEntrada.toString());
    }
}
