// LETÍCIA FRUET

package Trabalho02;
import javax.swing.JOptionPane;
public class Jogo {
 
    public static void main(String[] args) {

        //instanciando objetos de SuperHeroi
        SuperHeroi chapolin = new SuperHeroi("Chapolin Colorado", "Chaves");
        SuperHeroi homemAranha = new SuperHeroi("Homem-aranha", "Peter Park");
        SuperHeroi superHomen = new SuperHeroi("Super-Homem", "Clark Kent");
        SuperHeroi capitaoAmerica = new SuperHeroi("Capitão América", "Steven Rogers ");
        SuperHeroi flash = new SuperHeroi("Flash", "Barry Allen");
        SuperHeroi lanternaVerde = new SuperHeroi("Lanterna-verde", "Hal Jordan");
        SuperHeroi homemDeFerro = new SuperHeroi("Homem de ferro", "Tony Stark");

        //instanciando objetos de Vilao
        Vilao duendeVerde = new Vilao("Duende Verde", "Norman Osbourne", 0);
        Vilao lexLuthor = new Vilao("Lex Luthor", "Lex Luthor", 0);
        Vilao bizarro = new Vilao("Bizarro", "Bizarro", 0);
        Vilao octopus = new Vilao("Octopus", "Otto Octavius", 0);

        //instanciando objetos de Superpoder e atribuindo os superpoderes aos devidos super heróis
        Superpoder ch1 = new Superpoder("Anteninhas de vinil", 4);
        Superpoder ch2 = new Superpoder("Marreta Biônica ", 5);
        Superpoder ch3 = new Superpoder("Corneta paralisadora ", 5);
        Superpoder ch4 = new Superpoder("Pastilhas encolhedoras ", 4);
        chapolin.adicionarSuperpoder(ch1);
        chapolin.adicionarSuperpoder(ch2);
        chapolin.adicionarSuperpoder(ch3);
        chapolin.adicionarSuperpoder(ch4);

        Superpoder ha1 = new Superpoder("Soltar teia ", 3);
        Superpoder ha2 = new Superpoder("Andar em paredes ", 2);
        homemAranha.adicionarSuperpoder(ha1);
        homemAranha.adicionarSuperpoder(ha2);

        Superpoder s1 = new Superpoder("Voar", 3);
        Superpoder s2 = new Superpoder("Força", 5);
        Superpoder s3 = new Superpoder("Visão de raio X ", 4);
        Superpoder s4 = new Superpoder("Sopro congelante ", 4);
        superHomen.adicionarSuperpoder(s1);
        superHomen.adicionarSuperpoder(s2);
        superHomen.adicionarSuperpoder(s3);
        superHomen.adicionarSuperpoder(s4);

        Superpoder ca1 = new Superpoder("Super soldado", 3);
        Superpoder ca2 = new Superpoder("Escudo", 3);
        capitaoAmerica.adicionarSuperpoder(ca1);
        capitaoAmerica.adicionarSuperpoder(ca2);

        Superpoder f1 = new Superpoder("Velocidade", 5);
        flash.adicionarSuperpoder(f1);

        Superpoder lv1 = new Superpoder("Anel mágico", 5);
        lanternaVerde.adicionarSuperpoder(lv1);

        Superpoder hf1 = new Superpoder("Armadura", 4);
        Superpoder hf2 = new Superpoder("Dispositivos eletrônicos", 2);
        homemDeFerro.adicionarSuperpoder(hf1);
        homemDeFerro.adicionarSuperpoder(hf2);

        //instanciando objetos de Superpoder e atribuindo os superpoderes aos devidos vilões
        Superpoder d1 = new Superpoder("Força", 5);
        duendeVerde.adicionarSuperpoder(d1);

        Superpoder ll1 = new Superpoder("Mente aguçada", 5);
        lexLuthor.adicionarSuperpoder(ll1);

        Superpoder b1 = new Superpoder("Voar", 3);
        Superpoder b2 = new Superpoder("Força",5);
        Superpoder b3 = new Superpoder("Visão de Raio X", 4);
        Superpoder b4 = new Superpoder("Sopro congelante", 4);
        bizarro.adicionarSuperpoder(b1);
        bizarro.adicionarSuperpoder(b2);
        bizarro.adicionarSuperpoder(b3);
        bizarro.adicionarSuperpoder(b4);

        Superpoder o1 = new Superpoder("Tentáculos indestrutíveis", 5);
        Superpoder o2 = new Superpoder("Velocidade", 1);
        octopus.adicionarSuperpoder(o1);
        octopus.adicionarSuperpoder(o2);

        //---------------------------------------------------------------------------------------
                
        String listaDeHerois = "Para iniciar, escolha um super herói:\n";
        int i = 1;
        for (SuperHeroi h : SuperHeroi.listaHerois) {
            listaDeHerois += "\n" + i++ + "- " + h.toString() + "\n";
        }
        String numeroSuperHeroi = JOptionPane.showInputDialog(listaDeHerois); //showInputDialog para entradas
       
        while (!numeroSuperHeroi.equals("1") && !numeroSuperHeroi.equals("2") && !numeroSuperHeroi.equals("3") &&
               !numeroSuperHeroi.equals("4") && !numeroSuperHeroi.equals("5") && !numeroSuperHeroi.equals("6") &&
               !numeroSuperHeroi.equals("7")) {
        
            listaDeHerois = "Escolha inválida, por favor escolha um Super Herói: ";
            i = 1;
            for (SuperHeroi h : SuperHeroi.listaHerois) {
                listaDeHerois += "\n" + i++ + "- " + h.toString();
            }
            numeroSuperHeroi = JOptionPane.showInputDialog(listaDeHerois);
        }

        String listaViloes = "Agora, escolha um vilão:\n";
        i = 1;
        for (Vilao v : Vilao.listaViloes) {
            listaViloes += "\n" + i++ + "- " + v.toString() + "\n"; 
        }
        String numeroVilao = JOptionPane.showInputDialog(listaViloes);

        while (!numeroVilao.equals("1") && !numeroVilao.equals("2") && 
               !numeroVilao.equals("3") && !numeroVilao.equals("4")) {

            listaViloes = "Escolha inválida, por favor, escolha um vilão:\n";
            i = 1;
            for (Vilao v : Vilao.listaViloes) {
                listaViloes += "\n" + i++ + "- " + v.toString();
            }
            numeroVilao = JOptionPane.showInputDialog(listaViloes);
        }

        SuperHeroi superHeroiEscolhido = null;
        Vilao vilaoEscolhido = null;

        if (numeroSuperHeroi.equals("1")) {
            superHeroiEscolhido = chapolin;
        } else if (numeroSuperHeroi.equals("2")) {
            superHeroiEscolhido = homemAranha;
        } else if (numeroSuperHeroi.equals("3")) {
            superHeroiEscolhido = superHomen;
        } else if (numeroSuperHeroi.equals("4")) {
            superHeroiEscolhido = capitaoAmerica;
        } else if (numeroSuperHeroi.equals("5")) {
            superHeroiEscolhido = flash;
        } else if (numeroSuperHeroi.equals("6")) {
            superHeroiEscolhido = lanternaVerde;
        } else if (numeroSuperHeroi.equals("7")) {
            superHeroiEscolhido = homemDeFerro;
        } 

        if (numeroVilao.equals("1")) {
            vilaoEscolhido = duendeVerde;
        } else if (numeroVilao.equals("2")) {
            vilaoEscolhido = lexLuthor;
        } else if (numeroVilao.equals("3")) {
            vilaoEscolhido = bizarro;
        } else if (numeroVilao.equals("4")) {
            vilaoEscolhido = octopus;
        } 
        JOptionPane.showMessageDialog(null, Confronto.executar(superHeroiEscolhido, vilaoEscolhido)); //showMessageDialog para saídas
    }
}