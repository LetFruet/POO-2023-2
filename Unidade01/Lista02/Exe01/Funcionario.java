package Exe01;
import java.text.DecimalFormat;
public class Funcionario {
    DecimalFormat df_2 = new DecimalFormat("0.00");
    
    //definindo os atributos 
    private String nome;
    private double salario;

    //encapsulamento dos métodos acessores e modificadores dos atributos 
    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //método para calcular o valor do imposto de renda de acordo com o salário do funcionário
    public double calcularIrpf() {
        double imposto = 0;
        
        if (salario <= 1903.98) {
            imposto = 0.0; 
        } else if (salario <= 2826.65) {
            imposto = (salario - 1903.98) * 0.075;
        } else if (salario <= 3751.05) {
            imposto = ((salario - 2826.65) * 0.15) + ((2826.65 - 1903.98) * 0.075);
        } else if (salario <= 4664.68) {
            imposto = ((salario - 3751.05) * 0.225) + ((3751.05 - 2826.65) * 0.15) + ((2826.65 - 1903.98) * 0.075);
        } else {
            imposto = ((salario - 4664.68) * 0.275) + ((4664.68 - 3751.05) * 0.225) + ((3751.05 - 2826.65) * 0.15) + ((2826.65 - 1903.98) * 0.075);
        }

        return imposto;
    }
            
    //método que retona o print com nome, salário inicial, imposto e salário líquido
    public String imprimir() {
        double imposto = calcularIrpf();

        return "Funcionário: " + getNome() + "\nSalário Inicial: R$ " + df_2.format(getSalario()) + "\nImposto de Renda: R$ " + df_2.format(imposto) + "\nSalário Líquido: R$ " + df_2.format(salario - imposto);
    }
}
