package Unidade02.Lista01.Exe05;
import java.util.ArrayList;
import java.util.Scanner;
public class PrincipalImposto {
    
    private ArrayList<Pessoa> listaContribuintes;
    public static void main(String[] args) {
        new PrincipalImposto();
    }

    public PrincipalImposto() {
        Scanner kb1 = new Scanner(System.in);

        System.out.println("Informe a operação desejada: \n1- Cadastrar novo contribuinte; \n2- Verificar os dados de um contribuinte" + 
                           "\n3- Encontrar o contribuinte que tem o maior imposto a pagar; \n4- Encerrar o sistema;");
        int escolha = kb1.nextInt();

        while (escolha != 4) {
            if (escolha == 1) {
                adicionarContribuinte();
            } else if (escolha == 2) {
                System.out.print("Informe o CPF do contribuinte a ser procurado: ");
                String cpf = kb1.nextLine();
                verificarDados(cpf);
            } else if (escolha == 3) {
                maiorImposto();
            } else {
                System.out.println("Entrada incorreta. Por favor, informe a operação desejada: \n1- Cadastrar novo contribuinte;" +
                                   "\n2- Verificar os dados de um contribuinte \n3- Encontrar o contribuinte que tem o maior imposto a pagar;" +
                                   "\4- Encerrar o sistema;");
                                   escolha = kb1.nextInt();
            }
             
            System.out.println("Informe a operação desejada: \n1- Cadastrar novo contribuinte; \n2- Verificar os dados de um contribuinte" + 
                               "\n3- Encontrar o contribuinte que tem o maior imposto a pagar; \4- Encerrar o sistema;");
            escolha = kb1.nextInt();
        }
        kb1.close();
    }

    public void adicionarContribuinte() {
        Scanner kb2 = new Scanner(System.in);

        System.out.print("Informe o nome do contribuinte: ");
        String nome = kb2.nextLine();
        System.out.print("Informe o CPF do contribuinte: ");
        String cpf = kb2.nextLine();
        System.out.print("Informe a renda anual do contribuinte: ");
        double rendaAnual = kb2.nextDouble();

        Pessoa p = new Pessoa(nome, cpf, rendaAnual);
        boolean existe = false;

        for (Pessoa p2 : listaContribuintes) {
            if (p2.getCpf() == p.getCpf()) {
                existe = true;
            }
        }

        if (!existe) {
            listaContribuintes.add(p);
        }
        kb2.close();
    }

    public void verificarDados(String cpf) {

        for (Pessoa p : listaContribuintes) {
            if (p.getCpf().equals(cpf)) {
                System.out.println("Nome: " + p.getNome() + "\nCPF: " + p.getCpf() + "Renda anual: " + p.getRendaAnual() + 
                                   "Imposto a ser pago: " + p.calcularImposto());
            }
        }
    }

    public void maiorImposto() {

        double maiorImposto = Double.MIN_VALUE;

        for (Pessoa p : listaContribuintes) {
            if (p.calcularImposto() > maiorImposto) {
                maiorImposto = p.calcularImposto();
                System.out.println("Nome: " + p.getNome() + "\nCPF: " + p.getCpf() + "Renda anual: " + p.getRendaAnual() + 
                                   "Imposto a ser pago: " + p.calcularImposto());
            }
        }
    }
}
