package Unidade02.Aula04.Turma;
public class TesteTurma {

    public TesteTurma(){
        Turma t = new Turma();

        t.adicionar(new Pessoa("Ana", 123));
        t.adicionar(new Pessoa("Pedro", 234));
        t.adicionar(new Pessoa("Pedro", 345));
        t.adicionar(new Pessoa("Maria", 678));
        t.adicionar(new Pessoa("Antonio", 987));

        System.out.println(t.toString());
        System.out.println("REMOVENDO:");
        System.out.println(t.excluir(111));
        System.out.println(t.excluir(678));
        System.out.println(t.toString());

        System.out.println("ALTERANDO:");
        System.out.println(t.atualizar(345, "Pedro Henrique"));
        System.out.println(t.toString());

        System.out.println("BUSCANDO:");
        System.out.println(t.buscar(987).toString());
        System.out.println(t.buscar(11)); // nao existe

    }
    public static void main(String[] args) {
        new TesteTurma();
    }
}
