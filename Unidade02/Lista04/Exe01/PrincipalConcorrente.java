package Unidade02.Lista04.Exe01;

public class PrincipalConcorrente {
 
    public static void main(String[] args) {
        
        Concorrente umConcorrente = new Concorrente("Letícia", "Dev", 105,
                                                    "47 984618065", "Rua Benjamin Fruet, 153");

        Prova umaProva = new Prova(umConcorrente, 9.7);

        System.out.println(umaProva.imprimir());
    }
}
