/**
 * @author Letícia Fruet
 */

package Unidade02.Lista01.Exe04;
import java.util.HashMap;
import java.util.Scanner;
public class DicionarioDeIP {

    public static void main(String[] args) {
		new DicionarioDeIP();
	}

	public DicionarioDeIP() {

		HashMap<String, Site> mapaDeSites = new HashMap<String, Site>();
		Scanner kb = new Scanner(System.in);

		System.out.print("Digite o endereço do site: ");
		String nome = kb.next();
		while (!nome.equalsIgnoreCase("Fim")) {
			try {
				System.out.print("Digite o IP do site: ");
				String ip = kb.next();
				System.out.print("Digite o status (true/false): ");
				boolean status = kb.nextBoolean();

				Site s = new Site(nome, ip, status);
				if (inserirSite(s, mapaDeSites)) {
					System.out.println("Site inserido");
				} else {
					System.out.println("Já existe site com este nome");
				}

			} catch (Exception e) {
				System.out.println("Erro:" + e.getMessage());
			}

			System.out.print("Digite o endereço do site: ");
			nome = kb.next();
		}

		System.out.println("SITES...");
		System.out.println(imprimirSite(mapaDeSites));

		System.out.println("PESQUISA SITES...");
		System.out.print("Digite o endereço do site: ");
		nome = kb.next();
		while (!nome.equalsIgnoreCase("Fim")) {
			System.out.println(acessarSite(nome, mapaDeSites));

			System.out.print("Digite o endereço do site: ");
			nome = kb.next();
		}

	}

	private String imprimirSite(HashMap<String, Site> sites) {
		String dados = "";

		for (Site s : sites.values()) {
			dados += s.toString() + "\n";
		}

		return dados;
	}

	private String acessarSite(String nome, HashMap<String, Site> sites) {
		if (sites.get(nome).getStatus()) {
			return "Site: " + nome + "\nIP: " + sites.get(nome).getEnderecoIP();
		}
		return "Site bloqueado";
	}

	private boolean inserirSite(Site site, HashMap sites) {
		if (sites.containsKey(site.getNomeSite())) {
			return false;
		}
		sites.put(site.getNomeSite(), site);
		    return true;
	}
}
