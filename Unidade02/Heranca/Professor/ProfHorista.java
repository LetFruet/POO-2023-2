package Unidade02.Heranca.Professor;

public class ProfHorista extends Professor {

    private int totalHoras;
    private double salarioHora;
    
    public ProfHorista(String nome, String matricula, int idade, int totalHoras, double salarioHora) {
        super(nome, matricula, idade); //pegando os atributos da classe pai
        setTotalHoras(totalHoras);
        setSalarioHora(salarioHora);
    }
    public int getTotalHoras() {
        return totalHoras;
    }
    public void setTotalHoras(int totalHoras) throws IllegalArgumentException {
        if (totalHoras < 0) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        this.totalHoras = totalHoras;
    }
    public double getSalarioHora() {
        return salarioHora;
    }
    public void setSalarioHora(double salarioHora) throws IllegalArgumentException {
        if (salarioHora < 0) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        this.salarioHora = salarioHora;
    }   
    
    public double calcularSalario() {

        return getSalarioHora() * getTotalHoras();
    }

    @Override
    public String toString() {
        return super.toString() +  //chamando o toString() da classe pai para facilitar a manutenção do código
               "\nTotal de horas: " + getTotalHoras() + "\nSalário por hora: " + getSalarioHora() + //classe filha
               "\nSalário final: " + calcularSalario();                                             //método que calcula o salário final  
    }
}