package Unidade01.Lista01.Exe10;
public class Eleitor {
    
    //definindo e declarando os atributos (nome e idade)
    private String nome;
    private int idade;

    //encapsulando os métodos acessores e modificadores dos atributos (get e set)
    public Eleitor(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    //getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }

    //verificando se o eleitor está apto ou não para votar
    public String verificar() {
        if (idade < 16) {
            return "Eleitor não pode votar";
            } else if (idade >= 16 && idade <= 65) {
                return"Eleitor deve votar";
            }
            return"Voto facultativo";
    }

    //chamando o método verificar() para printar a resposta 
    public String imprimir() {
        return verificar();
    }

}