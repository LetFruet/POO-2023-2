package Unidade02.Lista05.Exe05;
public class Avaliacao {
    
    protected int qtdPagantes;
    protected String opiniaoGeral;

    public Avaliacao(int qtdPagantes, String opiniaoGeral) {
        setQtdPagantes(qtdPagantes);
        setOpiniaoGeral(opiniaoGeral);
    }

    public int getQtdPagantes() {
        return qtdPagantes;
    }

    public void setQtdPagantes(int qtdPagantes) throws IllegalArgumentException {
        if (qtdPagantes < 0) {
            throw new IllegalArgumentException("Quantidade de pagantes inválida");
        }
        this.qtdPagantes = qtdPagantes;
    }

    public String getOpiniaoGeral() {
        return opiniaoGeral;
    }

    public void setOpiniaoGeral(String opiniaoGeral) throws IllegalArgumentException {
        if (opiniaoGeral == null || opiniaoGeral.isEmpty() || opiniaoGeral.isBlank()) {
            throw new IllegalArgumentException("Opinião geral inválida");
        }
        this.opiniaoGeral = opiniaoGeral;
    }

    @Override
    public String toString() {
        return "\nQuantidade de pagantes: " + getQtdPagantes() + "\nOpinião geral: " + getOpiniaoGeral();
    }
}