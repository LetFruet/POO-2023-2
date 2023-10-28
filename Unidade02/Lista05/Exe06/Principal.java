package Unidade02.Lista05.Exe06;

public class Principal {
 public static void main(String[] args) {
        
        Concessionaria conc1 = new Concessionaria();

        Carro c1 = new Carro("MML123", 2006, 1, 250);
        Carro c2 = new Carro("RTF856", 2010, 2, 120);
        Carro c3 = new Carro("IOU469", 2022, 2, 375);
        Carro c4 = new Carro("KFT392", 1998, 1, 55);

        CarroTurbo ct1 = new CarroTurbo("jop59", 2023, 2, 530);
        CarroTurbo ct2 = new CarroTurbo("iuy79", 2000, 1, 125);
        CarroTurbo ct3 = new CarroTurbo("odr23", 2016, 1, 400);
        CarroTurbo ct4 = new CarroTurbo("qqc09", 2008, 2, 50);

        Avaliacao a1 = new Avaliacao("Necessita de troca");
        Avaliacao a2 = new Avaliacao("Ruim");
        Avaliacao a3 = new Avaliacao("Razoavel");
        Avaliacao a4 = new Avaliacao("Bom");
        Avaliacao a5 = new Avaliacao("Otimo");

        c1.adicionarAvaliacao(a1);
        c1.adicionarAvaliacao(a2);
        c2.adicionarAvaliacao(a2);
        c3.adicionarAvaliacao(a3);
        c4.adicionarAvaliacao(a4);
        ct1.adicionarAvaliacao(a5);
        ct2.adicionarAvaliacao(a5);

        conc1.adicionarCarro(c1);
        conc1.adicionarCarro(c2);
        conc1.adicionarCarro(c3);
        conc1.adicionarCarro(c4);
        conc1.adicionarCarro(ct1);
        conc1.adicionarCarro(ct2);
        conc1.adicionarCarro(ct3);
        conc1.adicionarCarro(ct4);

        System.out.println(conc1.printarResposta() + "\n");
        System.out.println(" ----- Consultar placa: -----\n" + conc1.consultarCarroPorPlaca("MML123") + "\n");
        System.out.println(" ----- Relatório da situação mecânica geral: -----\n" + conc1.relatorioSituacaoMecanica() + "\n");
        System.out.println(" ----- Relatório do carro mais novo e do mais velho: -----\n" + conc1.relatorioCarroMaisNovoVelho() + "\n");
        System.out.println(" ----- Carro comum com maior rendimento: -----\n" + conc1.verificarComumMaiorRendimento() + "\n");
        System.out.println(" ----- Carro turbo com menor rendimento: -----\n" + conc1.verificarTurboMenorRendimento() + "\n");
        System.out.println(" ----- Média de rendimento dos carros turbo: -----\n" + conc1.verificarMediaRendimentoTurbo() + "\n");
        System.out.println(" ----- Carros com mais problemas mecânicos: -----\n" + conc1.verificarProblemasMecanicos());
    }
}