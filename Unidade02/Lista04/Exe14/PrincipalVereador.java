package Unidade02.Lista04.Exe14;

public class PrincipalVereador {
    
    public static void main(String[] args) {
                
        Vereador p1 = new Vereador("Letícia", "PL", 123, 10, 9);
        Vereador p2 = new Vereador("Paula", "Novo", 345, 23, 17);
        Vereador p3 = new Vereador("Heitor", "PL", 123, 6, 5);
        Vereador p4 = new Vereador("Guilherme", "Novo", 345, 36, 21);
        Vereador p5 = new Vereador("Ana", "PL", 123, 15, 3);

        CamaraMunicipal c1 = new CamaraMunicipal();
        c1.adicionarVereadores(p1);
        c1.adicionarVereadores(p2);
        c1.adicionarVereadores(p3);
        c1.adicionarVereadores(p4);
        c1.adicionarVereadores(p5);

        // Imprimindo todos os vereadores e seus desempenhos
        for (Vereador p : Vereador.listaVereadores) {
            System.out.println(p.toString());
        }
        System.out.println();

        //imprimindo o vereador com mais projetos aprovados
        System.out.println(c1.verificarMaisProjetosAprovados());

        //imprimindo o vereador com menor desempenho
        System.out.println(c1.verificarMenorDesempenho());

        //imprimindo média de desempenho do partido PL
        System.out.println(c1.verificarMediaPartido("PL"));

        //imprimindo projetos apresentados e aprovados do partido Novo
        System.out.println(c1.verificarAprovadosPorPartido("Novo"));
        
        //imprimindo todos os projetos de um vereador específico
        System.out.println(p1.calcularProjetosAprovados());

        //imprimindo a média de desempenho
        System.out.println(" - A média geral de desempenho é : " + c1.calcularMediaDesepenho());

        //imprimindo vereadores com desempenho acima da média
        System.out.println("\nVereadores com desempenho acima da média: ");
        System.out.println(c1.desempenhoAcimaMedia());
        

    }
}