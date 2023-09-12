package Unidade01.Lista01.Exe05;
public class DiaDaSemana {

    //definindo os atributos 
    private int ano;
    private int mes;
    private int dia;

    //encapsulando os métodos acessores e modificadores dos atributos (get e set)
    public DiaDaSemana(int ano, int mes, int dia) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }
    
    //getters e setters
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getMes(){
        return this.mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getDia(){
        return this.dia;
    }

    //método que verifica o dia da semana
    public String verificar(){
        
        int valor = ano + dia + 3 * (mes - 1) - 1;

        //condição para calcular o dia 
        if (mes < 3) {
            ano = ano - 1;
        } else {
            valor = valor - (int) (0.4 * mes + 2.3);
        }

        valor = valor + (int) (ano/4) - (int) (0.75 * (1 + ano / 100));
        valor = valor % 7;

        //condição para escrever o dia correto
        if (valor == 0) {
            return "domingo";
        } else if (valor == 1) {
            return "segunda-feira";
        } else if (valor == 2) {
            return "terça-feira";
        } else if (valor == 3) {
            return "quarta-feira";
        } else if (valor == 4) {
            return "quinta-feira";
        } else if (valor == 5) {
            return "sexta-feira";
        } else {
            return "sábado";
        }
    }

    //chamando o método verificar() para imprimir a resposta 
    public String imprimir() {
        return verificar();
    }
}