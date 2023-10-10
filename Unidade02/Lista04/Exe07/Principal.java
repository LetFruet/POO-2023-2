package Unidade02.Lista04.Exe07;

public class Principal {
    
public static void main(String[] args) {
        
        Paises p1 = new Paises("Brasil", 215.000);
        Paises p2 = new Paises("Argentina", 170.000);
        Paises p3 = new Paises("Paraguai", 90.000);
        Paises p4 = new Paises("Uruguai", 185.000);

        Continente c1 = new Continente("América");
        c1.adicionar(p1);
        c1.adicionar(p2);
        c1.adicionar(p3);
        c1.adicionar(p4);

        Paises p5 = new Paises("França", 215.000);
        Paises p6 = new Paises("Itália", 170.000);
        Paises p7 = new Paises("Inglaterra", 90.000);
        Paises p8 = new Paises("Espanha", 185.000);

        Continente c2 = new Continente("Europa");
        c2.adicionar(p5);
        c2.adicionar(p6);
        c2.adicionar(p7);
        c2.adicionar(p8);

        for (Paises p : Paises.listaPaises) {
            System.out.println(p.toString());  
        }   

        System.out.println("----------");
        
        for (Continente c : Continente.listaContinentes) {
            System.out.println(c.toString());  
        }       
    } 
}