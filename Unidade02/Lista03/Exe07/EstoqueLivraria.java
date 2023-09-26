package Unidade02.Lista03.Exe07;
import java.util.HashMap;
public class EstoqueLivraria {

	private double saldoEstoque;
	private HashMap<String, Livro> estoque;

	public EstoqueLivraria(double saldoEstoque) {
		setSaldoEstoque(saldoEstoque);
		estoque = new HashMap<String, Livro>();
	}

	public void setSaldoEstoque(double saldoEstoque) throws IllegalArgumentException {
		if (saldoEstoque < 0) {
			throw new IllegalArgumentException();
		}
		this.saldoEstoque = saldoEstoque;
	}

	public HashMap<String, Livro> getEstoque() {
		return estoque;
	}

	public double getSaldoEstoque() {
		return saldoEstoque;
	}

	public boolean compraDeLivros(Livro livro) {
		if (saldoEstoque >= livro.getpCompra()) {
			if (estoque.containsKey(livro.getIsbn())) {
				Livro livroExistente = estoque.get(livro.getIsbn());
				livroExistente.setEstoque(livroExistente.getEstoque() + 1);
//				estoque.get(livro.getIsbn()).setEstoque(estoque.get(livro.getIsbn()).getEstoque() + 1);
			} else {
				livro.setEstoque(1);
				estoque.put(livro.getIsbn(), livro);
			}

			this.saldoEstoque -= livro.getpCompra();
			return true;
		}
		return false;
	}

	public boolean vendaDeLivro(String isbnLivro) {
		if (estoque.containsKey(isbnLivro) && estoque.get(isbnLivro).getEstoque() > 0) {
			Livro livroExistente = estoque.get(isbnLivro);
			livroExistente.setEstoque(livroExistente.getEstoque() - 1);
			this.saldoEstoque += livroExistente.getpVenda();
			return true;
		}
		return false;
	}
	
	public String imprimeEstoque() {
		String info = "";
		
		for (Livro l: estoque.values()) {
			info += l.toString() +"\n";
		}
		return info;
	}
	
}
