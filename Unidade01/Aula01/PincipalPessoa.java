package Unidade01.Aula01;
public class PincipalPessoa {

    public static void main(String[] args) {
        // criando uma variável do tipo Pessoa
        Pessoa umaPessoa = null;
    
        // criando um objeto do tipo Pessoa
        // 'new' cria um objeto, nesse caso o objeto do tipo Pessoa, retornando um endereço de memória para umaPessoa
        umaPessoa = new Pessoa();

        // atribuindo um nome atrelado a variável umaPessoa
        umaPessoa.setNome("João");
        System.out.println(umaPessoa.getNome());

        umaPessoa.setIdade(-56);
        System.out.println(umaPessoa.getIdade());

    }
}