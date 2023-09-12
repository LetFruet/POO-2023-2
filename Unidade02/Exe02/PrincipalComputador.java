package Unidade02.Exe02;
import java.util.ArrayList;
public class PrincipalComputador {

    private ArrayList <Computador> computadores;

    public PrincipalComputador() {
        computadores = new ArrayList<>();
        adicionaComputador(computadores, new Computador(1, 10, 50));
        adicionaComputador(computadores, new Computador(2, 20, 100));
        adicionaComputador(computadores, new Computador(3, 30, 150));
        adicionaComputador(computadores, new Computador(4, 40, 200));
        adicionaComputador(computadores, new Computador(5, 50, 250));

        imprimir(computadores);
    }

    private void adicionaComputador(ArrayList<Computador> lista, Computador computador) {

        lista.add(computador);
    }

    public void imprimir(ArrayList<Computador> lista) {
        int totalMemoria = 0;
        System.out.print("Dados dos computadores: ");
        for (Computador informacoes: lista) {
        System.out.print(informacoes.toString());
        totalMemoria += informacoes.getMemoria();
        }

        System.out.println("\nTotal de memória: " + totalMemoria);
    }

    public static void main(String[] args) {
        new PrincipalComputador();
    }
}
