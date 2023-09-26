package Unidade02.Lista03.Exe05;
public class Pessoa {
    
    private String nome;
    private String cpf;
    private double rendaAnual;

    public Pessoa(String nome, String cpf, double rendaAnual) {
        setNome(nome);
        setCpf(cpf);
        setRendaAnual(rendaAnual);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws IllegalArgumentException {
        if (cpf.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.cpf = cpf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public double calcularImposto() {

        double imposto = 0;

        if (rendaAnual <= 4000) {
            imposto = rendaAnual * 0;
        } else if (rendaAnual >= 4001 && rendaAnual <= 9000) {
            imposto = rendaAnual * 0.058;
        } else if (rendaAnual >= 9001 && rendaAnual <= 25000) {
            imposto = rendaAnual * 0.15;
        } else if (rendaAnual >= 25001 && rendaAnual <= 35000) {
            imposto = rendaAnual * 0.275;
        } else if(rendaAnual >= 35001) {
            imposto = rendaAnual * 0.3;
        }

        return imposto;
    }
}