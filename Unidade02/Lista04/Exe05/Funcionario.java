//João Vinícius Rosá e Letícia Fruet
package Unidade02.Lista04.Exe05;
public class Funcionario {
    
    private int matricula; 
    private String nome;
    private int departamento;
    private float salario;
    private String funcao;

    public Funcionario(int matricula, String nome, int departamento, float salario, String funcao) {
        setMatricula(matricula);
        setNome(nome);
        setDepartamento(departamento);
        setSalario(salario);
        setFuncao(funcao);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) throws IllegalArgumentException {
        if (matricula < 0) {
            throw new IllegalArgumentException("Número da matrícula inválido");
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do funcionário inválido");
        }
        this.nome = nome;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) throws IllegalArgumentException {
        if (departamento < 0) {
            throw new IllegalArgumentException("Departamento inválido");
        }
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) throws IllegalArgumentException {
        if (salario < 0) {
            throw new IllegalArgumentException("Salário inválido");
        }
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) throws IllegalArgumentException {
        if (funcao == null || funcao.trim().isEmpty()) {
            throw new IllegalArgumentException("Função inválida");
        }
        this.funcao = funcao;
    } 
}