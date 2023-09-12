package Unidade01.Lista01.Exe11;
public class Lutador {
    
    //definindo e declarando os atributos (nome e peso)
    private String nome;
    private float peso;

    //métodos acessores e modificadores dos atributos (get e set)
    public Lutador(String nome, float peso) {
        setNome(nome);
        setPeso(peso);
    }

    //getters e setters
    //public para poder chamar em outro folder
    public void setNome(String nome) {
        this.nome = nome;
    }
    //só usa parâmetro quando recebe algo de fora 
    public String getNome() {
        return this.nome;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public Float getPeso() {
        return this.peso;
    }

    //método para verificar a categoris em que o lutador se encaixa
    public String verificarCategoria() {
    String categoria = " ";

        if (getPeso() <= 54) {
            categoria = "Pluma";
        } else if (getPeso() <= 60){
            categoria = "Leve";
        } else if (getPeso() <= 75){
            categoria = "Meio-Leve";
        } else {
            categoria = "Pesado";
        }

        return categoria;
    }

    //chamando o método verificarCategoria() para imprimir o nome da categiria do Lutador
    //se tudo que é necessário está no método, não usa-se parâmetro, senão, usa-se
    public String imprimir() {
        return "Nome do lutador: " + getNome() + "\nCompete na categoria: " + verificarCategoria();
    }

}