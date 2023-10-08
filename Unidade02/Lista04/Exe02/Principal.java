package Unidade02.Lista04.Exe02;

public class Principal {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Letícia", "Fruet", 19);
        Pessoa p2 = new Pessoa("Eliani", "Fruet", 51);
        Pessoa p3 = new Pessoa("Mauro", "Fruet", 55);

        Familia f = new Familia();
        f.adicionarPessoas(p1);
        f.adicionarPessoas(p2);
        f.adicionarPessoas(p3);

        System.out.println(f.imprimirFamilia());

    }
}