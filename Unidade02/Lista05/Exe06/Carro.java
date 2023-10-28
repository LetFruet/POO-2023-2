package Unidade02.Lista05.Exe06;
import java.util.ArrayList;
import java.util.List;
public class Carro {

    private String placa;
    private int ano, tipoCombustível; //(1  –  álcool  e  2  –  gasolina)
    private double potênciaMotor;
    private List<Avaliacao> listaAvaliacoes = new ArrayList<Avaliacao>();

    public Carro(String placa, int ano, int tipoCombustível, double potênciaMotor) {
        setPlaca(placa);
        setAno(ano);
        setTipoCombustível(tipoCombustível);
        setPotênciaMotor(potênciaMotor);
    }
      
    public void adicionarAvaliacao(Avaliacao umaAvaliacao) {
        listaAvaliacoes.add(umaAvaliacao);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa)throws IllegalArgumentException {
        if (placa == null || placa.isEmpty() || placa.isBlank()) {
            throw new IllegalArgumentException("Placa inválida");
        }
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) throws IllegalArgumentException {
        if (ano < 0) {
            throw new IllegalArgumentException("Ano inválido");
        }
        this.ano = ano;
    }

    public int getTipoCombustível() {
        return tipoCombustível;
    }

    public void setTipoCombustível(int tipoCombustível) throws IllegalArgumentException {
        if (tipoCombustível != 1 && tipoCombustível != 2) {
            throw new IllegalArgumentException("Tipo de combustível inválido");
        }
        this.tipoCombustível = tipoCombustível;
    }

    public double getPotênciaMotor() {
        return potênciaMotor;
    }

    public void setPotênciaMotor(double potênciaMotor) throws IllegalArgumentException {
        if (potênciaMotor < 0) {
            throw new IllegalArgumentException("Potência do motor inválida");
        }
        this.potênciaMotor = potênciaMotor;
    }

        public List<Avaliacao> getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    public void getListaAvaliacoes(List<Avaliacao> listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }

    public double calcularRendimentoCombustivel() {

        double rendimento = 0;
        if (getTipoCombustível() == 1) {
            rendimento = 10 / (getPotênciaMotor() * 0.7);
        } else {
            rendimento = 12 / (getPotênciaMotor() * 0.6);
        }
        return rendimento;
    }

    @Override
    public String toString() {
        String str = "Placa: " + getPlaca() + "\nAno: " + getAno() + "\nPotência do motor: " + getPotênciaMotor() + "\nTipo de combustível: ";

        if (getTipoCombustível() == 1) {
            str +="álcool";
        } else {
            str += "gasolina";
        }
        return str;
    }
}