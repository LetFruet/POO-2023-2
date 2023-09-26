package Unidade02.Lista03.Exe06;
public class TestePessoa {
 
    public static void main(String[] args) {
        new TestePessoa();
    }
	
	public TestePessoa() {
        Pessoa p1 = new Pessoa("Leticia");

        p1.addEndereco(new Endereco("Rua Antônio da Veiga"));
        
        Endereco e1 = new Endereco("Rua Des. Pedro Silva");
        e1.setNumero(78);
        p1.addEndereco(e1);

        Endereco e2 = new Endereco("Rua Benjamin Fruet");
        e2.setNumero(153);
        e2.setComplemento("Casa");
        p1.addEndereco(e2);
	
        System.out.println(p1.imprimirEnderecos());
	}
}