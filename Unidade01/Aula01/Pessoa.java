package Unidade01.Aula01;
public class Pessoa{
    
    // definindo os atributos (características)
    private String nome;
    int idade;

    // set: cadastra a característica
    // deve sempre colocar o this
    public void setNome(String nome) {
        this.nome = nome;
    }

    // get: mostra na tela a característica
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if (idade >= 0) {
            this.idade = idade;
        }
        
    }

    public int getIdade(){
        return this.idade;
    }
    
}