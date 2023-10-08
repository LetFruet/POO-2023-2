package Unidade02.Lista04.Exe02;
import java.util.ArrayList;
import java.util.List;
public class Familia {

    private List<Pessoa> listaPessoas = new ArrayList<>();

    public String verificarMaisVelho() {
        int maisVelho = Integer.MIN_VALUE;
        String nomeMaisVelho = "";

        for (Pessoa p : listaPessoas) {
            if (p.getIdade() > maisVelho) {
                maisVelho = p.getIdade();
                nomeMaisVelho = p.getNome() + " " + p.getSobrenome();
            }
        }
        return nomeMaisVelho;
    }

    public void adicionarPessoas(Pessoa umaPessoa){
        listaPessoas.add(umaPessoa);
    }

    public String imprimirFamilia() {

        String str = "";
        for (Pessoa p : listaPessoas) {
            str += p.toString() + "\n";
        }
        return str;
    }
}
