package Unidade02.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalAula03 {
	
	private ArrayList <Aula03> listaNomes;
	
	public PrincipalAula03() {
		listaNomes = new ArrayList<Aula03>(); // ArrayList listaNomes = new ArrayList<String>(); 
		popular();
		imprimir();
	}
	
	private void imprimir() {
//		for (int i = 0; i < listaNomes.size(); i++) { //lenght para vetor | size para array
//		System.out.println(listaNomes.get(i).toString());
		
		for (Aula03 teste: listaNomes) { //teste recebe os elementos de forma automática
			System.out.println(teste.toString());
		}
	}
	
	private void popular() {
		Scanner kb = new Scanner(System.in);

		System.out.print("Digite um nome ou \"fim\" para sair: ");
		String nome = kb.next();
		
		while (!nome.equalsIgnoreCase("fim")) { // equalsIgnoreCase = verifica tanto maiúscula quanto minúscula
			
			System.out.print("Informe a idade: ");
			int idade = kb.nextInt();
			
			Aula03 teste = new Aula03(nome, idade);
			
			//add no arrayList
			listaNomes.add(teste); //depurar: 2 cliques na linha + debug
			
			System.out.print("Digite um nome ou \"fim\" para sair: ");
			nome = kb.next();			
		}
		kb.close();
	}

	public static void main(String[] args) {
		new PrincipalAula03();
	}
}