package Unidade02.Revisao_Prova02.Revisao02;
import java.util.Scanner;
public class Principal {
 
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe: \n1 - Pedir uma bebida \n2 - Pedir um vinho \n3 - Pedir um prato \n4 - Encerrar o pedido");
        int escolha = kb.nextInt();

        while (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4) {
            System.out.println("Entrada inválida. Por favor, informe: \n1 - Pedir um prato \n2 - Pedir um vinho \n3 - Pedir bebida \n4 - Encerrar o pedido");
            escolha = kb.nextInt();
        }

        System.out.print("Informe o nome do cardápio: ");
        String nomeCardapio = kb.next();
        kb.nextLine();
        System.out.print("Informe a versão do cardápio: ");
        int versaoCardapio = kb.nextInt();

        Cardapio umCardapio = new Cardapio(nomeCardapio, versaoCardapio);

        while (escolha == 1 || escolha == 2 || escolha == 3) {
            if (escolha == 1) {
                System.out.print("Escolha a bebida: ");
                String bebida = kb.next();
                kb.nextLine();
                System.out.print("Valor da bebida R$ ");
                double valorBebida = kb.nextDouble();
                System.out.print("Bebida alcóolica? (Sim/Não) ");
                String alcoolica = kb.next();
                kb.nextLine();

                while (!alcoolica.equalsIgnoreCase("sim") && !alcoolica.equalsIgnoreCase("nao")) {
                    System.out.print("Valor inválido! Bebida alcóolica? (Sim/Não)");
                    alcoolica = kb.next();
                    kb.nextLine();
                }

                boolean bebidaAlcoolica = false;
                if (alcoolica.equalsIgnoreCase("sim")) {
                    bebidaAlcoolica = true;
                }

                umCardapio.addBebida(bebida, valorBebida, bebidaAlcoolica);

                System.out.println("Informe: \n1 - Pedir uma bebida \n2 - Pedir um vinho \n3 - Pedir um prato \n4 - Encerrar o pedido");
                escolha = kb.nextInt();
            }

            if (escolha == 2) {
                System.out.print("Escolha o vinho: ");
                String vinho = kb.next();
                kb.nextLine();
                System.out.print("Valor do vinho R$ ");
                double valorVinho = kb.nextDouble();
                System.out.print("Ano da safra: ");
                int safra = kb.nextInt();
                System.out.print("Tipo do vinho: ");
                String tipo = kb.next();
                kb.nextLine();

                umCardapio.addVinho(vinho, valorVinho, safra, tipo);

                System.out.println("Informe: \n1 - Pedir uma bebida \n2 - Pedir um vinho \n3 - Pedir um prato \n4 - Encerrar o pedido");
                escolha = kb.nextInt();
            }

            if (escolha == 3) {

                System.out.print("Escolha o prato: ");
                String prato = kb.next();
                kb.nextLine();
                System.out.print("Valor do prato R$ ");
                double valorPrato = kb.nextDouble();
                System.out.print("Ingredientes: ");
                kb.nextLine();  
                String ingredientes = kb.nextLine();
                System.out.print("Prato vegetariano? (Sim/Não) ");
                String vegetariano = kb.next();
                kb.nextLine();

                while (!vegetariano.equalsIgnoreCase("sim") && !vegetariano.equalsIgnoreCase("nao")) {
                    System.out.print("Valor inválido! Prato vegetariano? (Sim/Não)");
                    vegetariano = kb.next();
                    kb.nextLine();
                }

                boolean pratoVegetariano = false;
                if (vegetariano.equalsIgnoreCase("sim")) {
                    pratoVegetariano = true;
                }

                umCardapio.addPrato(prato, valorPrato, ingredientes, pratoVegetariano);  

                System.out.println("Informe: \n1 - Pedir uma bebida \n2 - Pedir um vinho \n3 - Pedir um prato \n4 - Encerrar o pedido");
                escolha = kb.nextInt();
            }
        }

        if (escolha == 4) {
            System.out.print("Valor a pagar R$" + Cardapio.getMediaValor());
            System.out.print("\nLista de produtos selecionados: \n");
            System.out.print(Cardapio.getListaProdutos());
            System.out.print("\nLista ordenada: \n");
            System.out.print(Cardapio.listaProdutosOrdenados());
        }

        kb.close();
    }
}
