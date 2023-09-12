package Unidade02.Exe02;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalComputador {

   double totalMemoria = 0;

    private ArrayList <Computador> listaComputador;

    public PrincipalComputador(){
        listaComputador = new ArrayList<Computador>();
        adicionaComputador();
        imprimir();
    }

    private void adicionaComputador() {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe o número serial do computador: \"0\" para sair: ");
        int numeroSerial = kb.nextInt();

        while (numeroSerial != 0) {
            System.out.println("Informe a capacidade do HD do computador: ");
            double capacidadeHD = kb.nextInt();

            System.out.println("Informe a quantidade de memória do computador: ");
            double memoria = kb.nextInt();
            totalMemoria += memoria;

            Computador informacoes = new Computador(numeroSerial, capacidadeHD, memoria);

            listaComputador.add(informacoes);

            System.out.println("Informe o número serial do computador: \"0\" para sair: ");
            numeroSerial = kb.nextInt();
        }

        kb.close();
    }

    public void imprimir() {
        System.out.println("Dados dos computadores: \nTotal de memória: " + totalMemoria);
        for (Computador informacoes: listaComputador) {
        System.out.println(informacoes.toString());
        }
    }

    public static void main(String[] args) {
        new PrincipalComputador();
    }
}
