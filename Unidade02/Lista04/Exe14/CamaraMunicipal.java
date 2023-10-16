/*A Câmara Municipal de Vereadores de Blumenau pretende realizar uma estatística sobre o desempenho dos seus parlamentares.
Para cada um dos 15 vereadores, ela possui o nome, partido, quantidade de projetos apresentados, quantidade de projetos aprovados. 
O desempenho é calculado da seguinte forma: 
(projetos aprovados / projetos apresentados) * índice de trabalho. 
Se não apresentou nenhum projeto, o desempenho é 0 (zero).

O índice de trabalho é definido pela seguinte tabela:
Projetos apresentados 		Índice de trabalho
01 – 05 			0,80
06 – 10 			1,00
11 – 17 			1,08
acima de 17 			1,22

Escreva um programa Java que leia os dados disponíveis pela Câmara e imprima o nome, partido e desempenho do vereador.
Imprima:
a) o total de projetos apresentados e de aprovados na câmara;
b) o nome, partido e desempenho do vereador com mais projetos aprovados;
c) o nome, partido e desempenho do vereador com menor desempenho;
d) o nome, partido e desempenho dos vereadores cujo desempenho seja maior que o desempenho médio de toda a câmara;*/
package Unidade02.Lista04.Exe14;
import java.util.ArrayList;
import java.util.List;
public class CamaraMunicipal {
   
    public List<Vereador> listaVereadores = new ArrayList<>();
    
    public void adicionarVereadores(Vereador umVereador) {
        listaVereadores.add(umVereador);
    }

    public String verificarMaisProjetosAprovados() {
        int maisProjetosAprovados = Integer.MIN_VALUE;
        String str = "";

        for (Vereador v : Vereador.listaVereadores) {
            if (v.getProjetosAprovados() > maisProjetosAprovados) {
                maisProjetosAprovados = v.getProjetosApresentados();
                str = " - Vereador com mais projetos aprovados: " + v.getNome() + "\t| Partido" + v.getNomePartido() + "\t Projetos aprovdos: " + v.getProjetosAprovados();;
            }
        }

        return  str; 
    } 

    public String verificarMenorDesempenho() {
        int menorDesempenho = Integer.MAX_VALUE;
        String str = "";

        for (Vereador v : Vereador.listaVereadores) {
            if (v.calcularDesempenho() < menorDesempenho) {
                menorDesempenho = v.getProjetosApresentados();
                str = " - Vereador com menor desempenho: " + v.getNome() + "\t| Partido" + v.getNomePartido() + "\t| Desempenho " + v.calcularDesempenho();
            }
        }

        return  str;
    } 

    public double calcularMediaDesepenho() {

        double somaDesempenho = 0;

        for (Vereador v : Vereador.listaVereadores) {
            somaDesempenho += v.calcularDesempenho();
        }
                
        return somaDesempenho / Vereador.listaVereadores.size();
    }

    public String verificarMediaPartido(String partido) {
        double somaDesempenho = 0, mediaPartido = 0;
        int cont = 0;
        String str = "";

        for (Vereador v : Vereador.listaVereadores) {
            if (v.getNomePartido().equals(partido)) {
                somaDesempenho += v.calcularDesempenho();
                cont++;
                str = " - Média do partido: " + v.getNomePartido();
            }
            mediaPartido = somaDesempenho / cont;
        }

        return str += " é " + mediaPartido;
    }   
        
    public String verificarAprovadosPorPartido(String partido) {
        int projAprovados = 0, projApresentados = 0;
        for (Vereador v : Vereador.listaVereadores) {
            if (v.getNomePartido().equals(partido)) {
                projApresentados += v.getProjetosApresentados();
                projAprovados += v.getProjetosAprovados();
            }
        }
        return " - O total de projetos apresentados pelo partido " + partido + " é " + projApresentados + " e aprovados " + projAprovados;
    }

    public List<Vereador> desempenhoAcimaMedia() {
        List<Vereador> acimaMedia = new ArrayList<>();
        double media = calcularMediaDesepenho();

        for (Vereador v : Vereador.listaVereadores) {
            if (v.calcularDesempenho() > media) {
                acimaMedia.add(v);
            }
        }   
        return acimaMedia;     
    }
}