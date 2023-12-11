/**
 * @author Letícia Fruet
 */

package Prova03.Parte02.Questao01;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Atleta implements Serializable {
    
    private String nome;
    private String cpf;
    private String altura;
    private String peso;
    private Endereco umEndereco;
    public static List<Atleta> listaAtletas = new ArrayList<Atleta>();

    public Atleta(String nome, String cpf, String altura, String peso, Endereco umEndereco) {
        setNome(nome);
        setCpf(cpf);
        setAltura(altura);
        setPeso(peso);
        setUmEndereco(umEndereco);
        listaAtletas.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public Endereco getUmEndereco() {
        return umEndereco;
    }

    public void setUmEndereco(Endereco umEndereco) {
        this.umEndereco = umEndereco;
    }
    
    public static List<Atleta> getListaAtletas() {
        return listaAtletas;
    }

    public static void setListaAtletas(List<Atleta> listaAtletas) {
        Atleta.listaAtletas = listaAtletas;
    }

    @Override
    public String toString() {
        return "Nome do atleta: " + getNome() + "   \nCPF: " + getCpf() + "   \nAltura: " + getAltura() + "   \nPeso: " + getPeso() + getUmEndereco();
    }
}
