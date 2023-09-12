//Letícia Fruet
package Prova01;
public class Teste {
    
    public static void main(String[] args) {
        
        //vetro que guarda a quantidade de telhados
        Telhado vetor[] = new Telhado[2];

        vetor[0] = new Telhado(7.20, 8.0, 0.0);
        vetor[1] = new Telhado(4.50, 8.0, 0.0);

        System.out.println(vetor[0].areaTotal + vetor[0].quantidadeCondutores(vetor));
        System.out.println(vetor[1].areaTotal + vetor[1].quantidadeCondutores(vetor));
        System.out.println(vetor[0].maiorArea(vetor));
    }
}
