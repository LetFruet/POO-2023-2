package Unidade02.Lista04.Exe14;

public class CameraMunicipal {
   
    public String verificarMaisProjetosAprovados() {
        int maisProjetosAprovados = Integer.MIN_VALUE;
        String vereadorMaisAprovados = "";

        for (Vereador p : Vereador.listaParlamentares) {
            if (p.getProjetosAprovados() > maisProjetosAprovados) {
                maisProjetosAprovados = p.getProjetosApresentados();
                vereadorMaisAprovados = p.getNome();
            }
        }

        return "Vareador com maior número de projetos aprovados: \n" + vereadorMaisAprovados;
    } 

    public String verificarMenorDesempenho() {
        int menorDesempenho = Integer.MAX_VALUE;
        String vereadorMenorDesempenho = "";

        for (Vereador p : Vereador.listaParlamentares) {
            if (p.calcularDesempenho() < menorDesempenho) {
                menorDesempenho = p.getProjetosApresentados();
                vereadorMenorDesempenho = p.getNome();
            }
        }

        return "Vareador com menor desempenho: \n" + vereadorMenorDesempenho;
    } 

    public String calcularMediaDesepenho() {

        double somaDesempenho = 0;

        for (Vereador p : Vereador.listaParlamentares) {
            somaDesempenho += p.calcularDesempenho();
        }
        
        return "A média de desempenho dos vereadores é: " + (somaDesempenho / Vereador.listaParlamentares.size());
    }

    public String verificarMediaPartido() {
        double somaPartido = 0, mediaPartido = 0;
        
        for (Vereador p : Vereador.listaParlamentares) {
            if (p.getNomePartido()) {
                 somaPartido += medi
                vereadorMaisAprovados = p.getNome();
            }
        }

        return "Vareador com maior número de projetos aprovados: \n" + vereadorMaisAprovados;
    }   
}
/*e) A média de desempenho por partido político 
f) O total de projetos apresentados e de aprovados por partido político */