package Unidade02.Aula03;
public class Aula03 {

	private String nome;
	private int idade;
	
	public Aula03(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	public void setNome(String nome) throws IllegalArgumentException {
		if(nome.trim().isEmpty()) { // nome.equals(" ")
			throw new IllegalArgumentException();
		}
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) throws IllegalArgumentException {
		if (idade < 0) {
			throw new IllegalArgumentException();
		}
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String toString() {
		return this.getNome() + ", " + this.getIdade() + " anos.";
	}
}
