package Unidade02.Lista05.Exe06;
import java.util.ArrayList;
import java.util.List;
public class Concessionaria {
   
    private List<Carro> listaCarros = new ArrayList<Carro>();

    public void adicionarCarro(Carro carro) {
        listaCarros.add(carro);
    }

    public Carro consultarCarroPorPlaca(String placa) {
        for (Carro c : listaCarros) {
            if (c.getPlaca().equals(placa)) {
                return c;
            }
        }
        return null;
    }

    public String relatorioSituacaoMecanica() {
        String str = "";

        for (Carro c : listaCarros) {
            for (Avaliacao a : c.getListaAvaliacoes()) {
                str = c.getPlaca() + ": " + a.getAvalSituacaoAtual();
            }
        }
        return str;
    }

    public String relatorioCarroMaisNovoVelho() {
        Carro maisNovo = listaCarros.get(0);
        Carro maisVelho = listaCarros.get(0);

        for (Carro C : listaCarros) {
            if (C.getAno() > maisNovo.getAno()) {
                maisNovo = C;
            } else if (C.getAno() < maisVelho.getAno()) {
                maisVelho = C;
            }
        }

        return "Carro mais novo: " + maisNovo.toString() + "\nCarro mais velho: " + maisVelho.toString();
    }

    public String verificarComumMaiorRendimento() {
        double maiorRendimento = 0;
        String str = "";

        for (Carro c : listaCarros) {
            if (c instanceof Carro && c.calcularRendimentoCombustivel() > maiorRendimento) {
                maiorRendimento = c.calcularRendimentoCombustivel();
                str = c.toString();
            }
        }

        for (Carro c: listaCarros) {
            if (c instanceof Carro && c.calcularRendimentoCombustivel() == maiorRendimento) {
                str += c.toString() + "\n";
            }
        }
        return str;
    }

    public String verificarTurboMenorRendimento() {
        double menorRendimento = Double.MAX_VALUE;
        String str = "";

        for (Carro c : listaCarros) {
            if (c instanceof CarroTurbo && c.calcularRendimentoCombustivel() < menorRendimento) {
                menorRendimento = c.calcularRendimentoCombustivel();
                str = c.toString();
            }
        }

        for (Carro c: listaCarros) {
            if (c instanceof CarroTurbo && c.calcularRendimentoCombustivel() == menorRendimento) {
                str += c.toString() + "\n";
            }
        }
        return str + "Média de rendimento: " + menorRendimento + " km/litro";
    }

    public String verificarMediaRendimentoTurbo() {
        double somaRendimento = 0, mediaRendimento = 0;

        for (Carro c : listaCarros) {
            if (c instanceof CarroTurbo) {
                somaRendimento += c.calcularRendimentoCombustivel();
                mediaRendimento = somaRendimento / listaCarros.size();
            }
        }
        return "Média de rendimento dos carros turbo: " + mediaRendimento;
    }

    public String verificarProblemasMecanicos() {
        int contTeste = 0, contLista = 0;
        String str = "";

        for (Carro c : listaCarros) {
            for (Avaliacao a : c.getListaAvaliacoes()) {
                if (c.getListaAvaliacoes().equals("ruim") || c.getListaAvaliacoes().equals("razoavel")) {
                    contTeste++;
                }
            }
        }
                
        for (Carro c : listaCarros) {
            for (Avaliacao a : c.getListaAvaliacoes()) {
                if (c.getListaAvaliacoes().equals("ruim") || c.getListaAvaliacoes().equals("razoavel")) {
                    contLista++;
                    if (contTeste == contLista) {
                        str += c.toString() + "\n";
                    }
                }
            }
        }
        return "Carros com mais problemas mecânicos:  " + str;
    }

    public String printarResposta() {

        String str = "\n--------------- Carros normais ---------------\n";
        for (Carro c : listaCarros) {
            if (c instanceof Carro) {
               str += c.toString() + "\n";
            }
        }

        str += "\n--------------- Carros turbos ---------------\n";
        for (Carro c : listaCarros) {
            if (c instanceof CarroTurbo) {
                str += c.toString() + "\n";
            }
        }
        return str;
    }
}