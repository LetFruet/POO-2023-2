//João Vinícius Rosá e Letícia Fruet
package Unidade02.Lista04.Exe05;
import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {
        // Criando um setor pessoal com capacidade para 5 funcionários
        SetorPessoal setorPessoal = new SetorPessoal(5);

        // Adicionando alguns funcionários para teste
        setorPessoal.adicionarFuncionario(new Funcionario(1, "João", 1, 3000, "Programador"));
        setorPessoal.adicionarFuncionario(new Funcionario(2, "Maria", 2, 3500, "Analista"));
        setorPessoal.adicionarFuncionario(new Funcionario(3, "Carlos", 1, 4000, "Gerente"));

        // Exibindo o menu
        exibirMenu(setorPessoal);
    }

    // Método responsável por exibir o menu e interagir com o usuário
    private static void exibirMenu(SetorPessoal setorPessoal) {
        while (true) {
            // Solicitação da escolha do usuário por meio de uma caixa de diálogo
            String escolha = JOptionPane.showInputDialog("Escolha uma opção:\n" +
                    "1. Adicionar Funcionário\n" +
                    "2. Imprimir Folha de Pagamento\n" +
                    "3. Calcular Valor Total da Folha\n" +
                    "4. Funcionário com Maior Salário\n" +
                    "5. Funcionários de um Departamento\n" +
                    "6. Funcionários de uma Função\n" +
                    "7. Folha de Pagamento em Ordem Crescente de Salário\n" +
                    "0. Sair");

            // Verifica se o usuário cancelou a operação ou fechou a janela
            if (escolha == null) {
                // Encerra o programa
                break;
            }

            // Estrutura switch para processar a escolha do usuário
            switch (escolha) {
                case "1":
                    // Chama o método para adicionar um novo funcionário
                    adicionarFuncionario(setorPessoal);
                    break;
                case "2":
                    // Chama o método para imprimir a folha de pagamento
                    imprimirFolhaDePagamento(setorPessoal);
                    break;
                case "3":
                    // Chama o método para calcular o valor total da folha de pagamento
                    calcularValorTotalDaFolha(setorPessoal);
                    break;
                case "4":
                    // Chama o método para encontrar o funcionário com maior salário
                    calcularMaiorSalario(setorPessoal);
                    break;
                case "5":
                    // Chama o método para verificar os funcionários de um departamento
                    verificarFuncionariosDepartamento(setorPessoal);
                    break;
                case "6":
                    // Chama o método para verificar os funcionários de uma função
                    verificarFuncionariosFuncao(setorPessoal);
                    break;
                case "7":
                    // Chama o método para imprimir a folha de pagamento em ordem crescente de
                    // salário
                    imprimirFolhaOrdenada(setorPessoal);
                    break;
                case "0":
                    // Encerra o programa
                    System.exit(0);
                    break;
                default:
                    // Exibe uma mensagem de erro para escolha inválida
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
    }

    // Método para adicionar um novo funcionário
    private static void adicionarFuncionario(SetorPessoal setorPessoal) {
        try {
            // Solicitação dos dados do novo funcionário por meio de caixas de diálogo
            int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do funcionário:"));
            String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
            int departamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do departamento:"));
            float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do funcionário:"));
            String funcao = JOptionPane.showInputDialog("Digite a função do funcionário:");

            // Cria um novo objeto Funcionario com os dados fornecidos
            Funcionario novoFuncionario = new Funcionario(matricula, nome, departamento, salario, funcao);

            // Adiciona o novo funcionário ao SetorPessoal
            setorPessoal.adicionarFuncionario(novoFuncionario);

            // Exibe uma mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            // Exibe uma mensagem de erro para formato inválido
            JOptionPane.showMessageDialog(null,
                    "Formato inválido para um ou mais campos. Certifique-se de inserir valores numéricos corretos.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            // Exibe uma mensagem de erro para argumento inválido
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para imprimir a folha de pagamento
    private static void imprimirFolhaDePagamento(SetorPessoal setorPessoal) {
        // Obtém a folha de pagamento do SetorPessoal
        String folhaPagamento = setorPessoal.imprimirFolhaDePagamento();

        // Exibe a folha de pagamento por meio de uma caixa de diálogo
        JOptionPane.showMessageDialog(null, folhaPagamento, "Folha de Pagamento", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para calcular o valor total da folha de pagamento
    private static void calcularValorTotalDaFolha(SetorPessoal setorPessoal) {
        // Obtém o valor total da folha de pagamento do SetorPessoal
        double totalFolha = setorPessoal.calcularValorTotalDaFolha();

        // Exibe o valor total da folha de pagamento por meio de uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "Valor total da folha de pagamento: R$" + totalFolha,
                "Total da Folha de Pagamento", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para calcular o funcionário com o maior salário
    private static void calcularMaiorSalario(SetorPessoal setorPessoal) {
        // Obtém a informação sobre o funcionário com maior salário do SetorPessoal
        String funcionarioMaiorSalario = setorPessoal.calcularMaiorSalario();

        // Exibe a informação sobre o funcionário com maior salário por meio de uma
        // caixa de diálogo
        JOptionPane.showMessageDialog(null, funcionarioMaiorSalario, "Maior Salário", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para verificar os funcionários de um departamento
    private static void verificarFuncionariosDepartamento(SetorPessoal setorPessoal) {
        // Solicitação do número do departamento por meio de uma caixa de diálogo
        String inputDepartamento = JOptionPane.showInputDialog("Digite o número do departamento:");

        try {
            // Converte o número do departamento para inteiro
            int departamento = Integer.parseInt(inputDepartamento);

            // Obtém e exibe os funcionários do departamento do SetorPessoal
            String resultado = setorPessoal.verificarDepartamento(departamento);
            JOptionPane.showMessageDialog(null, resultado, "Funcionários do Departamento",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            // Exibe uma mensagem de erro para número de departamento inválido
            JOptionPane.showMessageDialog(null, "Número de departamento inválido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para verificar os funcionários de uma função
    private static void verificarFuncionariosFuncao(SetorPessoal setorPessoal) {
        try {
            // Solicitação do nome da função por meio de uma caixa de diálogo
            String nomeFuncao = JOptionPane.showInputDialog("Digite o nome da função:");

            // Obtém e exibe os funcionários da função do SetorPessoal
            String resultado = setorPessoal.verificarFuncao(nomeFuncao);

            JOptionPane.showMessageDialog(null, resultado, "Funcionários da Função", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
            // Exibe uma mensagem de erro para argumento inválido
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para imprimir a folha de pagamento em ordem crescente de salário
    private static void imprimirFolhaOrdenada(SetorPessoal setorPessoal) {
        // Obtém a folha de pagamento ordenada do SetorPessoal
        String folhaOrdenada = setorPessoal.ordenarSalarios();

        // Exibe a folha de pagamento ordenada por meio de uma caixa de diálogo
        JOptionPane.showMessageDialog(null, folhaOrdenada, "Folha de Pagamento Ordenada",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
