package Unidade02.Lista04.Exe04;
public class Revisor {
    
    private String nome; 
    private String conteudo;
    private String parecer;

    //usa-se set para o tratamento do encapsulamento
    public Revisor(String nome, String conteudo, String parecer) {
        setNome(nome);
        setConteudo(conteudo);
        setParecer(parecer);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) throws IllegalArgumentException {
        if (conteudo == null || conteudo.trim().isEmpty()) {
            throw new IllegalArgumentException("Conteúdo inválido");
        }
        this.conteudo = conteudo;
    }

    public String getParecer() {
        return parecer;
    }

    public void setParecer(String parecer) throws IllegalArgumentException {
        if (parecer == null || parecer.trim().isEmpty()) {
            throw new IllegalArgumentException("Parecer inválido");
        }
        this.parecer = parecer;
    }

    @Override
    public String toString() {
        return "\nConteúdo revisão: " + getConteudo() + "\nParecer: " + getParecer();
    }

    
}
