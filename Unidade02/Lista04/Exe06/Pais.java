/*Escreva uma classe que represente um “País”. Um país tem como atributos o seu nome e a sua dimensão em Km2 
e uma lista de países com os quais ele faz fronteira. Represente a classe e forneça os seus membros a seguir: 
a) Um método que permita verificar se dois países são iguais. Dois países são iguais se tiverem o mesmo nome
e a mesma capital. A assinatura deste método deve ser: − public boolean equals(Pais outro) 
b) Um método que informe se um outro país é seu limítrofe (faz fronteira) 
c) Um método que receba um outro país como parâmetro e retorne uma lista de vizinhos comuns aos dois países. 
Obs.: Considere que um país tem no máximo 40 outros países com os quais faz fronteira.  */
package Unidade02.Lista04.Exe06;
import java.util.ArrayList;
import java.util.List;
public class Pais {
    
    private String nome, capital;
    private double area;
    public static List<Pais> listaFronteiras = new ArrayList<>();
    public static List<Pais> listaPaises = new ArrayList<>();


    public Pais(String nome, String capital, double area) {
        setNome(nome);
        setCapital(capital);
        setArea(area);
        listaPaises.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do país inválido");
        }
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) throws IllegalArgumentException {
        if (capital == null || capital.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da capital inválida");
        }
        this.capital = capital;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) throws IllegalArgumentException {
        if (area < 0) {
            throw new IllegalArgumentException("Dimensão do país inválida");
        }
        this.area = area;
    }  

    public void adicionarFronteiras(Pais pais) {

        if(!listaFronteiras.contains(pais) && !this.equals(pais)) { //verificando se o país ainda não existe na lista
            listaFronteiras.add(pais);
        }
    }
    
    public boolean equals(Pais outroPais) {
        
        boolean retorno = false;
        for (Pais p : Pais.listaFronteiras) {
            if (p.getNome().equals(outroPais.getNome()) && p.getCapital().equals(outroPais.getCapital())) {
                retorno = true;
            }
        }
        return retorno;
    }

    public boolean limitrofe(Pais outroPais) {

        boolean retorno = false;
        if (Pais.listaFronteiras.contains(outroPais)) {
            retorno = true;
        }
        return retorno;
    }

    public List<Pais> listaVizinhos(Pais outroPais) {

        List<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais p : Pais.listaFronteiras) {
            if (Pais.listaFronteiras.contains(p) && Pais.listaFronteiras.contains(outroPais)) {
                vizinhosComuns.add(p);
            }
        }
        return vizinhosComuns;
    }

    @Override
    public String toString() {
    
        return " País: " + getNome() + "\t | Capital: " + getCapital() + " \t | Dimensão: " + getArea();
        
    }
}