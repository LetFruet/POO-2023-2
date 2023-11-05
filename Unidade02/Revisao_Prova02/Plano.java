package Unidade02.Revisao_Prova02;
public class Plano {
    
    private String nome;
    private int ano, qtdDependentes;

    public Plano(String nome, int ano, int qtdDependentes) {
        setNome(nome);
        setAno(ano);
        setQtdDependentes(qtdDependentes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
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

    public int getQtdDependentes() {
        return qtdDependentes;
    }

    public void setQtdDependentes(int qtdDependentes) throws IllegalArgumentException {
        if (qtdDependentes < 1) {
            throw new IllegalArgumentException("Quantidade de dependentes inválido");
        }
        this.qtdDependentes = qtdDependentes;
    }

    @Override
    public String toString() {
        return "Nome do plano: " + getNome() + "\nAno de aquisição: " + getAno() + "\nQuantidade de dependentes: " + getQtdDependentes();
    }
}