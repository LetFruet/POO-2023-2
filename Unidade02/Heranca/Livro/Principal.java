package Unidade02.Heranca.Livro;

public class Principal {
 
    public static void main(String[] args) {

        //instanciando um objeto sem utilizar construtor nas demais classes
        Livro umLivro = new Livro();
        umLivro.setNome("A origem");
        umLivro.setEditora("Arqueiro");
        umLivro.setISBN("123456");

        Revista umaRevista = new Revista();
        umaRevista.setNome("Times");
        umaRevista.setEditora("Times");
        umaRevista.setPeriodicidade("Semanal");

        System.out.println(umLivro.toString());
        System.out.println("-----------");
        System.out.println(umaRevista.toString());
    }
}
