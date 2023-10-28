public abstract class Atleta {
    
    protected String nome; //protected: classe, package e subclasse
    protected double peso;
    protected int idade;

    public Atleta(String nome, double peso, int idade) { //protected: classe, package, subclasse e mundo
        setNome(nome);
        setPeso(peso);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract String definirCategoria();

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nPeso: " + getPeso();
    }
}