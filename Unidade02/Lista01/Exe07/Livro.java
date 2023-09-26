package Unidade02.Lista01.Exe07;
public class Livro {

	private String titulo;
	private String autor;
	private String isbn;
	private int estoque;
	private double pCompra;
	private double pVenda;

	public Livro(String titulo, String autor, String isbn,  double pCompra, double pVenda) {
		setTitulo(titulo);
		setAutor(autor);
		setIsbn(isbn);
		setEstoque(0);
		setpCompra(pCompra);
		setpVenda(pVenda);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) throws IllegalArgumentException {
		if (autor == null || autor.trim().isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) throws IllegalArgumentException{
		if (isbn == null || isbn.trim().isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.isbn = isbn;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) throws IllegalArgumentException {
		if (estoque < 0) {
			throw new IllegalArgumentException();
		}
		this.estoque = estoque;
	}

	public double getpCompra() {
		return pCompra;
	}

	public void setpCompra(double pCompra) throws IllegalArgumentException{
		if (pCompra <= 0) {
			throw new IllegalArgumentException();
		}
		this.pCompra = pCompra;
	}

	public double getpVenda() {
		return pVenda;
	}

	public void setpVenda(double pVenda) throws IllegalArgumentException{
		if (pVenda <= 0) {
			throw new IllegalArgumentException();
		}
		
		this.pVenda = pVenda;
	}
	
	public String toString() {
		return "\nTítulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nISBN: " + getIsbn() + "\nQuantidade em estoque: " +
				getEstoque() + "\nPreço de compra: R$" + getpCompra() + "\nPreço de venda: R$" + getpVenda();
	}

}
