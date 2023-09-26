package Unidade02.Lista01.Exe06;
import java.util.ArrayList;
public class Pessoa {
   
    private String nome; 
    private ArrayList<Endereco> enderecos;

    public Pessoa(String nome) {
        setNome(nome);
        enderecos = new ArrayList<Endereco>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void addEndereco(Endereco endereco) throws IllegalArgumentException {
        if (endereco == null) {
            throw new IllegalArgumentException();
        }
        this.enderecos.add(endereco);
    }
    
    public String imprimirEnderecos() {

        String dados = "Nome: " + getNome() + "\nEndereços: ";
        /*for (Endereco e: enderecos) {
            dados += e.toString() + "\n";
        }*/
        for (int i = 0; i < enderecos.size(); i++) {
            dados += "\n" + enderecos.get(i).toString();
        }
        return dados;
    }
}
