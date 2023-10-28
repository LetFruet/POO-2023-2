package Unidade02.Lista05.Exe04;
import java.util.ArrayList;
import java.util.List;
public class Navio extends Embarcacao {
    
    protected String nome;
    private List<BoteSalvaVidas> listaBotes = new ArrayList<BoteSalvaVidas>();

    public Navio(int registroCapitania, int qtdPessoas, String nome) {
        super(registroCapitania, qtdPessoas);
        setNome(nome);
    }

    public void adicionarBotes(BoteSalvaVidas umBote) {
        listaBotes.add(umBote);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    //for para percorrer a lista e organizar a saída
    private String printarLista() {
        String str = "";
        for (BoteSalvaVidas b : listaBotes) {
            str += "\n" + b.mostrar() + "\n";
        }
        return str;
    }

    @Override
    public String mostrar() {
        return super.toString() + "\nNome: " + getNome() + "\n\nLista de botes do navio: \n" + printarLista();
    }


}