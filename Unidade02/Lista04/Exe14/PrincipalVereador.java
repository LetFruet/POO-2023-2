package Unidade02.Lista04.Exe14;

public class PrincipalVereador {
    
    public static void main(String[] args) {
        
        Vereador p1 = new Vereador("Letícia", "PL", 123, 10,9);
        Vereador p2 = new Vereador("Paula", "Novo", 345,  23,17);
        Vereador p3 = new Vereador("Heitor", "PL", 123, 6,5);
        Vereador p4 = new Vereador("Guilherme", "Novo", 345, 36,21);
        Vereador p5 = new Vereador("Ana", "PL", 123, 15,3);

        System.out.println("O desempenho do candidato " + p1.getNome() + " é de: " + p1.calcularDesempenho());
        System.out.println(p2.calcularProjetosAprovados());

        for (Vereador p : Vereador.listaParlamentares) {
            System.out.println(p.toString());
        }
    }
}

