package Unidade02.Heranca.Professor;

public class ProfDE extends Professor {

    private double salario;

    public ProfDE(String nome, String matricula, int idade, double salario) {
        super(nome, matricula, idade); //pegando os atributos da classe pai
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws IllegalArgumentException {
        if (salario < 0) {
            throw new IllegalArgumentException("Salário inválido");
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() +             //classe pai
               "\nSalário: " + getSalario();  //classe filha
    }
}