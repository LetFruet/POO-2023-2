/*Um avião é representado pelo seu prefixo, pelo nome do seu modelo, pelo nome do seu fabricante, pela quantidade de assentos e pela 
quantidade de assentos ocupados. 
Escreva uma classe que represente um avião e desenvolva um método que informe qual o prefixo da aeronave. 
Um aeroporto é representado pelo seu código e seu nome (ex.: SSA: Salvador, BSB: Brasília. etc), por um status que informa se ele é um 
aeroporto internacional ou não, uma lista de outros aeroportos para os quais partam vôos diretos à partir dele e uma lista de outros 
aeroportos de onde venham vôos para ele. Além disto possui uma lista de aviões que estão atualmente no pátio. Escreva uma classe que 
contemple os atributos apresentados e mais os seguintes membros: 

a) Um construtor que inicialize o código do aeroporto e seu nome 
b) Métodos que verifiquem e alterem a situação relativa ao fato do aeroporto ser internacional ou não. 
c) Um método que verifique e informe se um aeroporto é igual a ele: − public boolean equals (Aeroporto aeroposto) 
Obs.: Dois aeroportos são iguais se o seu código for coincidente. 
d) Um método que receba um prefixo de avião como parâmetro e informe se a aeronave está pousada nele 
e) Um método que receba um outro aeroporto como parâmetro e verifique se existe alguma forma de se chegar nele. Para isto, o aeroporto 
deve verificar se ele possui vôo partindo para o aeroporto desejado, e caso não saia, se existe alguma forma de chegar nele à partir 
dos aeroportos de onde sai − public boolean possuiRota(Aeroporto aeroporto) 
Obs.: A quantidade máxima de aeronaves que um aeroporto pode ter em terra é igual a 100 e a quantidade 
máxima de outros aeroportos com os quais o aeroporto pode ter linhas saindo e chegando é 100. */
package Unidade02.Lista04.Exe10;
import java.util.ArrayList;
import java.util.List;

public class Aviao {
    
    private String nomeModelo;
    private String nomeFabricante;
    private int qtdAssentos;
    private int qtdAssentosOcupados;
    public static List<Aviao> listaAvioes = new ArrayList<>();

    public Aviao(String nomeModelo, String nomeFabricante, int qtdAssentos, int qtdAssentosOcupados) {
        setNomeModelo(nomeModelo);
        setNomeFabricante(nomeFabricante);
        setQtdAssentos(qtdAssentos);
        setQtdAssentosOcupados(qtdAssentosOcupados);
        listaAvioes.add(this);
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) throws IllegalArgumentException {
        if (nomeModelo == null || nomeModelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do modelo do avião inválido");
        }
        this.nomeModelo = nomeModelo;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) throws IllegalArgumentException {
        if (nomeFabricante == null || nomeFabricante.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do fabricante do avião inválido");
        }
        this.nomeFabricante = nomeFabricante;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) throws IllegalArgumentException {
        if (qtdAssentos < 0) {
            throw new IllegalArgumentException("Quantidade de assentos do avião inválido");
        }
        this.qtdAssentos = qtdAssentos;
    }

    public int getQtdAssentosOcupados() {
        return qtdAssentosOcupados;
    }

    public void setQtdAssentosOcupados(int qtdAssentosOcupados) throws IllegalArgumentException {
        if (qtdAssentosOcupados < getQtdAssentos()) {
            throw new IllegalArgumentException("Quantidade de assentos ocupados do avião inválido");
        }
        this.qtdAssentosOcupados = qtdAssentosOcupados;
    }
    
    public String verificarPrefixo() {

        
    }
}
