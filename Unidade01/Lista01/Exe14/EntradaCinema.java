package Unidade01.Lista01.Exe14;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
public class EntradaCinema {
    
    //definindo os atributos 
    private LocalDate dataFilme;
    private LocalTime horarioEntrada;
    private int sala;
    private double valor;

    //encapsulando os métodos acessores e modificadores dos atributos (get e set)
    public EntradaCinema(LocalDate dataFilme, LocalTime horarioEntrada, int sala, double valor) {
        setDataFilme(dataFilme);
        setHorarioEntrada(horarioEntrada);
        setSala(sala);
        setValor(valor);
    }

    //getters e setters
    public LocalDate getDataFilme() {
        return dataFilme;
    }
    public void setDataFilme(LocalDate dataFilme) {
        this.dataFilme = dataFilme;
    }
    public LocalTime getHorarioEntrada() {
        return horarioEntrada;
    }
    public void setHorarioEntrada(LocalTime horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }
    public int getSala() {
        return sala;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    //método para calcular o desconto por idade
    public double CalculaDesconto(LocalDate dataNascimento) {

        Period periodo = Period.between(dataNascimento, dataFilme);
        periodo.getYears();

        if (periodo.getYears() < 12){
            valor *= 0.5;
        }
        return valor;
    }

    //método para calcular o desconto estudantil
    public double CalculaDesconto(LocalDate dataNascimento, int carteiraEstudo) {
        Period periodo = Period.between(dataNascimento, dataFilme);
        int idade = periodo.getYears();

        if (idade >= 12 && idade <= 15) {
            return valor *= 0.6;
        } else if (idade >= 16 && idade <= 20) {
            return valor *= 0.7;
        } else {
            return valor *= 0.8;
        }
    }

    //método para calcular o desconto por horário
    public double CalculaDescontoHorário(LocalTime horarioEntrada) {

        //horario.isBefore: método da API java.time utilizado com objetos LocalTime, LocalDate, LocalDateTime, entre outros. Esse método verifica
        //se um determinado instante (seja uma hora, data ou ambos) é anterior ao instante representado pelo objeto com o qual se está comparando.
        if (horarioEntrada.isBefore(LocalTime.of(16, 0))) {
            return valor *= 0.9;
        } else {
            return valor;
        }
    }

    //método para imprimir a resposta 
    public String toString() {

        return "        Data da sessão: " + getDataFilme() + "\n        Horário da sessão: " + getHorarioEntrada() + "\n        Sala: " + getSala() + "\n        Valor do ingresso: " + valor;
    }
}