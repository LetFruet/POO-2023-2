package Unidade02.Lista04.Exe03;
import java.util.HashMap;
public class DicionarioDeIP {

    private HashMap<String, Site> listaSites = new HashMap<>();  // Inicializando o HashMap

    public static void main(String[] args) {
		
		//criando uma variável dicionário para armazenar os sites
        DicionarioDeIP dicionario = new DicionarioDeIP();
        
        //inserindo sites na variável dicionário
        dicionario.inserirSite(new Site("Furb", "123ABC", true));
        dicionario.inserirSite(new Site("Amazon", "456DEF", false));
        dicionario.inserirSite(new Site("Havan", "789GHI", false));

        //exibindo todos os sites existentes no dicionário
        dicionario.mostrarSites();

        //printando o site escolhido
		System.out.println("---------------");
        System.out.println(dicionario.acessarSite("Furb"));
        System.out.println(dicionario.acessarSite("Amazon"));
    }

    //inserindo um site no dicionário
    public void inserirSite(Site site) {

        // Adicionando site no HashMap (nome do site como chave)
        listaSites.put(site.getNomeSite(), site);
    }

    //acessando as informações de um determinado site pelo seu nome
    public String acessarSite(String nomeSite) {

        //buscando o nome
        Site site = listaSites.get(nomeSite);

        if (site.getStatus()) {
			return site.toString();
		} else {
            return "Site " + site.getNomeSite() + " bloqueado";
        }
    }

    //chamando todos os sites armazenados no HashMap
    public void mostrarSites() {

        for (Site s : listaSites.values()) {
            System.out.println(s.toString());
        }
    }
}