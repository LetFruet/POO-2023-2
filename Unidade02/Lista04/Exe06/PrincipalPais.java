package Unidade02.Lista04.Exe06;

public class PrincipalPais {
    
    public static void main(String[] args) {
        
        Pais brasil = new Pais("Brasil", "Brasília", 216.000);
        Pais italia = new Pais("Itália", "Roma", 150.000);
        Pais franca = new Pais("França", "Paris", 129.000);
        Pais paraguai = new Pais("Paraguai", "Asunción", 278.000);
        Pais uruguai = new Pais("Uruguai", "Montevidéu", 176.000);
        Pais chile = new Pais("Chile", "Santiago", 75.000);
        
        brasil.adicionarFronteiras(paraguai);
        brasil.adicionarFronteiras(uruguai);
        paraguai.adicionarFronteiras(chile);
        paraguai.adicionarFronteiras(uruguai);
        italia.adicionarFronteiras(franca);

        System.out.println("Brasil é igual à Paraguai? " + brasil.equals(paraguai));
        System.out.println();
        System.out.println("Brasil faz fronteira com a Paraguai? " + brasil.limitrofe(paraguai));
        System.out.println();
        System.out.println("Vizinhos em comum entre Brasil e Paraguai: " + "\n" + brasil.listaVizinhos(paraguai));
        System.out.println();

        for (Pais p : Pais.listaPaises) {
            System.out.println(p.toString());
        }
    }
}