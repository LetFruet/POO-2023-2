package Trabalho02;
public class Superpoder {
    
    private String nome;
    private double categoria;

    public Superpoder(String nome, double categoria) {
        setNome(nome);
        setCategoria(categoria);
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

    public double getCategoria() {
        return categoria;
    }

    public void setCategoria(double categoria) throws IllegalArgumentException {
        if (categoria < 0) {
            throw new IllegalArgumentException("Categoria inválida");
        }
        this.categoria = categoria;
    }
}