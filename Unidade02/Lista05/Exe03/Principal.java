import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
       
        List<Atleta> listaAtletas = new ArrayList<Atleta>();

        listaAtletas.add(new Jogador("Gustavo", 60, 14));
        listaAtletas.add(new Jogador("João", 78, 17));
        listaAtletas.add(new Jogador("Allan", 90, 21));
        listaAtletas.add(new Jogador("Pedro", 53, 12));
        listaAtletas.add(new Jogador("Matheus", 59, 15));
        listaAtletas.add(new Jogador("Bernardo", 67, 19));
        listaAtletas.add(new Jogador("Henrique", 83, 22));     

        for (Atleta a : listaAtletas) {
            System.out.println(a.toString()); //polimorfismo, pois chama cada atleta na sua devida classe
        }
    }
}
