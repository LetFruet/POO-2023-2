//Letícia Fruet

package Trabalho01;
import java.util.Scanner;
public class CarroPrincipal {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        //inicializando as variáveis do método main
        Carro vetor[] = new Carro[5];
        int escolha = escolhaInicial(kb);
        String resultado = " ";

        //instanciando vários objetos do tipo Carro e armazenando os dados dos carros dentro do vetor vetor[]
        vetor[0] = new Carro("Gol", "VW", "MMM001", "Preto", 2009, 25000, 1);
        vetor[1] = new Carro("Fox", "VW", "LML002", "Vermelho", 2010, 30000, 2);
        vetor[2] = new Carro("Uno", "FIAT", "MLM003", "Cinza", 2011, 32000, 3);
        vetor[3] = new Carro("Fiesta", "FORD", "LLL004", "Branco", 2009, 29000, 1);
        vetor[4] = new Carro("Palio", "FIAT", "KKK345", "Amarelo", 2011, 26000, 1);
        
        //caso seja escolhido um valor que não aparece no print de entrada, o usuário tem a possibilidade de escolher novamente um número válido
        while (escolha != 1 && escolha != 2 && escolha != 3){
            System.out.println("Número não encontrado. Por favor informe:" +
                               "\n1- Para encontrar o(s) carro(s) mais caro(s) de determinado ano;" +
                               "\n2- Para encontrar o(s) preço(s), entre X e Y, dos carros de determinada marca; " +
                               "\n3- Para encontrar o(s) carro(s) mais caro(s) e mais barato(s) de determinado local;");
        escolha = kb.nextInt();
        }

        //instruções de seleção para inicializar o método referente ao númeor informado 
        switch (escolha) { //aqui aparece o retorno da variável do método escolhaInicial
            case 1:
                do {
                    //inputs que aparecerão ao usuário caso inicialmente ele escolha o número 1
                    System.out.print("Informe o ano desejado: ");
                    int ano = kb.nextInt();
                    //o resultado recebe o método que deve retornar 
                    resultado = valorPorAno(kb, vetor, ano);
                    //esse sysout printa o retorno da variável String do método valorPorAno
                    System.out.println(resultado);
                //caso o usuário entre com um ano inexistente nos registros
                //startsWith serve para verificar se determinada String inicia com um prefixo específico
                } while (resultado.startsWith("Nenhum carro encontrado para o ano"));
                break;
            case 2:
                do {    
                    //inputs que aparecerão ao usuário caso inicialmente ele escolha o número 2
                    System.out.print("Informe a marca desejada: ");
                    String marca = kb.next().toUpperCase();
                    System.out.print("Informe o menor valor desejado: ");
                    double menorValorDesejado = kb.nextDouble();
                    System.out.print("Informe o maior valor desejado: ");
                    double maiorValorDesejado = kb.nextDouble();
                    //o resultado recebe o método que deve retornar 
                    resultado = valorPorMarca(kb, vetor, marca, maiorValorDesejado, menorValorDesejado);
                    //esse sysout printa o retorno da variável String do método valorPorMarca
                    System.out.println(resultado);
                //caso o usuário entre com uma marca inexistente nos registros
                } while (resultado.startsWith("Nenhum carro encontrado para a marca"));
                break;
            case 3:
                do {
                    //inputs que aparecerão ao usuário caso inicialmente ele escolha o número 3
                    System.out.print("Informe o local desejado: ");
                    int localizacao = kb.nextInt();
                    //o resultado recebe o método que deve retornar 
                    resultado = valorPorLocalizacao(kb, vetor, localizacao);
                    //esse sysout printa o retorno da variável String do método valorPorLocalizacao
                    System.out.println(resultado);
                //caso o usuário entre com uma localização inexistente nos registros
                } while (resultado.startsWith("Nenhum carro encontrado na localização"));
                break;
        }
        kb.close();
    }

    //método que inicia a seleção
    public static int escolhaInicial(Scanner kb) {
        
        //inputs que aparecerão inicialmente ao usuário
        System.out.println("1- Para encontrar o(s) carro(s) mais caro(s) de determinado ano;" +
                            "\n2- Para encontrar o(s) preço(s), entre X e Y, dos carros de determinada marca; " +
                            "\n3- Para encontrar o(s) carro(s) mais caro(s) e mais barato(s) de determinado local;");
        int escolha = kb.nextInt();

        //retornando a variável escolha, que recebe o valor informado pelo usuário
        return escolha;
    }

    //método para verificar o carro mais caro do ano informado pelo usuário
    public static String valorPorAno(Scanner kb, Carro vetor[], int ano) {
            
        //inicializando as variáveis do método valorPorAno
        double maiorValor = Integer.MIN_VALUE;
        String resultadovalorPorAno = "O(s) carro(s) mais caro(s) de " + ano + " é(são): " + "\n";
        int cont = 0;

        for (int i = 0; i < vetor.length; i++) {
            //verificando se o ano existe nos registos 
            if (ano == vetor[i].getAno()) {
                //verificando o maior valor existente no ano informado pelo usuário
                if (vetor[i].getValor() > maiorValor) {
                    //caso o ano exista e o valor do índice analisado for maior do que o valor armazenado na variável maiorValor (que possui o menor valor
                    //existente) a variável maiorValor recebe o valor do índice e o resultado recebe o ano escolhido, o modelo do carro e o valor do mesmo
                    maiorValor = vetor[i].getValor();
                    resultadovalorPorAno += vetor[i].getModelo() + " - Valor: R$" + maiorValor + "\n";
                    //contador recebe um pois há apenas um carro com esse valor
                    cont = 1; 
                //caso exista mais de um carro com o mesmo valor, o resultado recebe todos os modelos com o mesmo valor e mesmo ano
                } else if (vetor[i].getValor() == maiorValor) {
                        resultadovalorPorAno += vetor[i].getModelo() + " - Valor: R$" + maiorValor + "\n";
                        //contador armazena a quantidade de carros com o mesmo valor
                        cont++;
                }
            }
        }
        //caso não existam carros registrados no ano informado, o contador recebe zero e o usuário tem a possibilidade de escolher novamente um ano para verificação
        if (cont == 0) {
            resultadovalorPorAno = "Nenhum carro encontrado para o ano " + ano + ". Informe o ano novamente!";
        }
        return resultadovalorPorAno;
    }

    //método para verificar os carros disponíveis entre o maior e o menor valor informados pelo usuário
    public static String valorPorMarca(Scanner kb, Carro vetor[], String marca, double maiorValorDesejado, double menorValorDesejado) {
 
        //inicializando as variáveis do método valorPorAno
        String resultadovalorPorMarca = "Carros da marca " + marca + " entre R$" + menorValorDesejado + " e R$" + maiorValorDesejado + ": \n";
        int cont = 0;

        for (int i = 0; i < vetor.length; i++) {
            //verificando se a marca existe nos registos 
            if (marca.equals(vetor[i].getMarca())) {
                //verificando se existem carros entre o maior e menor valor informados
                if (vetor[i].getValor() >= menorValorDesejado && vetor[i].getValor() <= maiorValorDesejado) {
                //caso a marca exista e existam carros entre os valores informados, o resultado recebe a marca disponível e o valor do carro
                resultadovalorPorMarca += vetor[i].getModelo() + " - Valor: R$" + vetor[i].getValor() + "\n";
                //contador armazena a quantidade de carros entre os valores informados
                cont++;
                }
            }
        }
            //caso não existam carros registrados na marca informada, o contador recebe zero e o usuário tem a possibilidade de escolher novamente uma marca para verificação
            if (cont == 0) {
                resultadovalorPorMarca = "Nenhum carro encontrado para a marca " + marca + " entre R$" + menorValorDesejado + " e R$" + maiorValorDesejado + ". Informe a marca novamente!"; 
            }
        return resultadovalorPorMarca;
    }


    //método para encontrar os carros da localização informada pelo usuário
    public static String valorPorLocalizacao(Scanner kb, Carro vetor[], int localizacao) {

        //inicializando as variáveis do método valorPorAno
        double maiorValor = Integer.MIN_VALUE, menorValor = Integer.MAX_VALUE; 
        String resultadovalorPorLocalizacao = "Na localização " + localizacao + ":\n";

        //criando uma matriz para armazenar os carros com o maior e o menor valor existentes em dado local 
        Carro carrosPorLoc[] = new Carro[2];

        for (int i = 0; i < vetor.length; i++) {
            //verificando se a localização existe nos registos 
            if (localizacao == vetor[i].getLocalizacao()) {
                //caso a localização exista e o valor do índice analisado for maior do que o valor armazenado na variável maiorValor (que possui o 
                //menor valor existente) a variável maiorValor recebe o valor do índice e a linha zero do vetor recebe o valor existente no índice
                if (vetor[i].getValor() > maiorValor) {
                    maiorValor = vetor[i].getValor();
                    carrosPorLoc[0] = vetor[i];
                } 
                //caso a localização exista e o valor do índice analisado for menor do que o valor armazenado na variável menorValor (que possui o 
                //maior valor existente) a variável menorValor recebe o valor do índice e a linha um do vetor recebe o valor existente no índice
                if (vetor[i].getValor() < menorValor) {
                    menorValor = vetor[i].getValor();
                    carrosPorLoc[1] = vetor[i];
                }
            }
        }

        //caso o maior valor recebido for diferente do menor valor existente e o menor valor recebido for diferente do maior valor existente, 
        //o resultado recebe a localização, o modelo e valor dos carros mais caros e mais baratos registrados na localização informada
        if (maiorValor != Integer.MIN_VALUE && menorValor != Integer.MAX_VALUE) {
            resultadovalorPorLocalizacao += "O(s) carro(s) mais caro(s) da localização " +  localizacao + " são:  " + 
                                            carrosPorLoc[0].getModelo()  + " - R$ " + maiorValor + "\n";
            resultadovalorPorLocalizacao += "O(s) carro(s) mais barato(s) da localização " + localizacao + " são:  " + 
                                            carrosPorLoc[1].getModelo()  + " - R$ " + menorValor + "\n";
        //caso não existam carros registrados na localização informada, o usuário tem a possibilidade de escolher novamente uma marca para verificação
        } else {
            resultadovalorPorLocalizacao = "Nenhum carro encontrado na localização " + localizacao + ". Informe a localização novamente!"; 
        }
        return resultadovalorPorLocalizacao;
    }
}