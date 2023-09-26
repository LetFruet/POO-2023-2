package Unidade02.Lista01.Exe07;
public class TesteLivraria {
	
    public static void main(String[] args) {
		new TesteLivraria();

	}

	public TesteLivraria() {
		EstoqueLivraria estoqueLivraria = new EstoqueLivraria(20);
		
		Livro l1 = new Livro("Título A", "Autor A", "ISBN A", 10, 15);
		Livro l2 = new Livro("Título B", "Autor B", "ISBN B", 10, 15);
		Livro l3 = new Livro("Título C", "Autor C", "ISBN C", 10, 15);
		Livro l4 = new Livro("Título D", "Autor D", "ISBN D", 10, 15);
		
		System.out.println(estoqueLivraria.compraDeLivros(l1));
		System.out.println(estoqueLivraria.compraDeLivros(l2));
		System.out.println(estoqueLivraria.compraDeLivros(l3));
		System.out.println(estoqueLivraria.vendaDeLivro("A"));
		System.out.println(estoqueLivraria.compraDeLivros(l3));
		System.out.println(estoqueLivraria.imprimeEstoque());
    }

	

}
