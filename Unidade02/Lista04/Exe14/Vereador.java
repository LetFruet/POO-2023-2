/*A Câmara Municipal de Vereadores de Mordor pretende realizar uma estatística sobre o desempenho dos seus parlamentares durante a última 
legislatura. Para cada um dos 9 vereadores, ela possui o nome, partido (número e nome), quantidade de projetos apresentados, quantidade de 
projetos aprovados. O desempenho é calculado da seguinte forma: (projetos aprovados / projetos apresentados) * índice de trabalho. 
Se não apresentou nenhum projeto, o desempenho é 0(zero). O índice de trabalho é definido pela seguinte tabela: 
Projetos apresentados Índice de trabalho 
01-05 0,80 
06-10 1,00 
11-17 1,08 
Acima de 17 1,22 
Escreva um programa que leia os dados disponíveis pela Câmara e imprima o nome, partido e desempenho do vereador. Ao Final, imprima: 
a) O total de projetos apresentados e de aprovados na câmara 
b) O nome, partido e desempenho do vereador com mais projetos aprovados 
c) O nome, partido e desempenho do vereador com menor desempenho 
d) O nome, partido e desempenho dos vereadores cujo desempenho seja maior que o desempenho médio de toda câmara 
e) A média de desempenho por partido político 
f) O total de projetos apresentados e de aprovados por partido político*/
package Unidade02.Lista04.Exe14;
import java.util.ArrayList;
import java.util.List;
public class Vereador {
    
    private String nomeVereador, nomePartido;
    private int numeroPartido, projetosApresentados, projetosAprovados;
    public static List<Vereador> listaParlamentares = new ArrayList<>();

    public Vereador(String nomeVereador, String nomePartido, int numeroPartido, int projetosApresentados, int projetosAprovados) {
        setNomeVereador(nomeVereador);
        setNomePartido(nomePartido);
        setProjetosApresentados(projetosApresentados);
        setProjetosAprovados(projetosAprovados);
        listaParlamentares.add(this);
    }

    public String getNome() {
        return nomeVereador;
    }

    public void setNomeVereador(String nomeVereador) throws IllegalArgumentException {
        if (nomeVereador == null || nomeVereador.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do parlamentar inválido");
        }
        this.nomeVereador = nomeVereador;
    }

    public String getNomePartido() {
        return nomePartido;
    }

    public void setNomePartido(String nomePartido) throws IllegalArgumentException {
        if (nomePartido == null || nomePartido.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do partido inválido");
        }
        this.nomePartido = nomePartido;
    }

    public int getNumeroPartido() {
        return numeroPartido;
    }

    public void setNumeroPartido(int numeroPartido) throws IllegalArgumentException {
        if (numeroPartido < 0) {
            throw new IllegalArgumentException("Número do partido inválido");
        }
        this.numeroPartido = numeroPartido;
    }

    public int getProjetosApresentados() {
        return projetosApresentados;
    }

    public void setProjetosApresentados(int projetosApresentados) throws IllegalArgumentException {
        if (projetosApresentados < 0) {
            throw new IllegalArgumentException("Número de projetos apresentados inválido");
        }
        this.projetosApresentados = projetosApresentados;
    }

    public int getProjetosAprovados() {
        return projetosAprovados;
    }

    public void setProjetosAprovados(int projetosAprovados)  throws IllegalArgumentException {
        if (projetosAprovados < 0) {
            throw new IllegalArgumentException("Número de projetos aprovados inválido");
        }
        this.projetosAprovados = projetosAprovados;
    }

    public double calcularDesempenho() { //verificar desempenho

        double indiceDeTrabalho = 0;

        if(getProjetosApresentados() == 0) {
            return 0;  
        }
        
        if (getProjetosApresentados() >= 1 && getProjetosApresentados() <= 5) {
            indiceDeTrabalho = 0.8;
        } else if (getProjetosApresentados() >=6 && getProjetosApresentados() <= 10) {
            indiceDeTrabalho = 1;
        } else if (getProjetosApresentados() >= 11 && getProjetosApresentados() <= 17) {
            indiceDeTrabalho = 1.08;
        } else {
            indiceDeTrabalho = 1.22;
        }
        

        //forçando uma das variáveis a ser um double para obter um resultado decimal, caso getProjetosAprovados() 
        //for menor que getProjetosApresentados() para que a divisão não resulte em zero
        return ((double)getProjetosAprovados() / getProjetosApresentados()) * indiceDeTrabalho;
    }
    
    public String calcularProjetosAprovados() {
        int somaProjetos = 0;
        somaProjetos += getProjetosApresentados() + getProjetosAprovados();

        return "Total de projetos apresentados e aprovados na câmara pelo vereador " + getNome() + " é " + somaProjetos;
    }

    @Override
    public String toString() {

        return " - Vereador: " + getNome() + "\t|  Nome do partido: " + getNomePartido() + "  \t|  Número do partido: " + 
                getNumeroPartido() + "  \t|  Desemprenho: " + calcularDesempenho();
    }
}
