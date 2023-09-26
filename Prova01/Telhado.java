//Letícia Fruet
package Prova01;

public class Telhado {
    
    private double comprimentoTelhado;
    private double alturaTelhado;
    private double sobreposicao;
    double areaTotal, necessidadeConducao; 

    Telhado(double comprimentoTelhado, double alturaTelhado, double sobreposicao) {
        setComprimentoTelhado(comprimentoTelhado);
        setAlturaTelhado(alturaTelhado);
        setSobreposicao(sobreposicao);
    }

    public double getComprimentoTelhado() {
        return comprimentoTelhado;
    }

    public void setComprimentoTelhado(double comprimentoTelhado) {
        this.comprimentoTelhado = comprimentoTelhado;
    }

    public double getAlturaTelhado() {
        return alturaTelhado;
    }

    public void setAlturaTelhado(double alturaTelhado) {
        this.alturaTelhado = alturaTelhado;
    }

    public double getSobreposicao() {
        return sobreposicao;
    }

    public void setSobreposicao(double sobreposicao) {
        this.sobreposicao = sobreposicao;
    }

    //calculando a árear total de cada telhado
    public double areaTotal() {
                
        areaTotal = getAlturaTelhado() * getComprimentoTelhado();

        return areaTotal;
    }

    //verificando se há sobreposição
    public double sobreposicao() {

        areaTotal = areaTotal();

        if (sobreposicao > 0) {
            areaTotal -= sobreposicao;
        } 

        return areaTotal;
    }

    //verificando a maior área
    public String maiorArea(Telhado vetor[]) {

        areaTotal = sobreposicao();
        double maiorArea = Integer.MIN_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (areaTotal > maiorArea)
                maiorArea = areaTotal;
        }

        return "O telhado com maior área é: " + maiorArea;
    }
        
    //verificando a necessidade de condução
    public double necessidadeConducao(Telhado vetor[]) {

        areaTotal = sobreposicao();
        for (int i = 0; i < vetor.length; i++) {
            necessidadeConducao = (areaTotal * 0.067) / vetor.length; //0,067 litros por segundo por metro quadrado
        }

        return necessidadeConducao;
    }

    //verificando a quantidade de condutores necessários
    public String quantidadeCondutores(Telhado vetor[]) {
        necessidadeConducao = necessidadeConducao(vetor);
        double resultado = 0;

        if (necessidadeConducao <= 7.1) {
            resultado = 1;
        } else {
            resultado = necessidadeConducao / 7.1;
        }
        return "A quantidade de condutores necessários para que a água da chuva tenha vazão é: " + resultado;
    }
}