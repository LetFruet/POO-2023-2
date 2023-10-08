package Unidade02.Lista03.Exe06;
public class TestePessoa {
 
    public static void main(String[] args) {
        new TestePessoa();
    }
	
	public TestePessoa() {
        Pessoa p1 = new Pessoa("Leticia");
        Endereco e2 = new Endereco("Rua A");
        Endereco e1 = new Endereco("Rua B");

        p1.addEndereco(new Endereco("Rua C"));
    
        e1.setNumero(123);
        p1.addEndereco(e1);

        e2.setNumero(456);
        e2.setComplemento("Casa");
        p1.addEndereco(e2);
	
        System.out.println(p1.imprimirEnderecos());
	}
}