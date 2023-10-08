/*Imagine que você foi convidado para realizar uma avaliação de conhecimentos em POO para trabalhar em uma grande empresa Nacional. 
Este teste era decisivo para sua possível contratação. Quando você chegou ao local de realização da prova você viu que existiam vários 
concorrentes, contudo, quando você leu a avaliação lembrou de tudo que aprendeu na FURB sobre POO. A prova não era muito complicada 
e tinha a seguinte questão: 
a) O que você tem em mãos é uma representação do tipo prova. Cada prova é composta por alguns atributos, dentre eles: 
o concorrente e o valor na nota. Cada entidade do tipo concorrente tem os seguintes atributos: nome do concorrente, 
área de especialização, número de inscrição, telefone para contato e endereço. 
Crie um programa que leia os dados de 5 provas apresentando os dados de cada concorrente e sua respectiva nota. 
Apresentando na tela na seqüência que foi lida.  */
package Unidade02.Lista04.Exe01;
public class Concorrente {
    
    private String nome; 
    private String areaDeEspecializacao;
    private int inscricao; 
    private String telefone;
    private String endereco;

    public Concorrente(String nome, String areaDeEspecializacao, int inscricao, String telefone, String endereco) {
        setNome(nome);
        setAreaDeEspecializacao(areaDeEspecializacao);
        setInscricao(inscricao);
        setTelefone(telefone);
        setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    //trim().isEmpty(): verifica se uma string, após ter seus espaços em branco removidos, está vazia.
    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }

    public String getAreaDeEspecializacao() {
        return areaDeEspecializacao;
    }

    public void setAreaDeEspecializacao(String areaDeEspecializacao) {
        this.areaDeEspecializacao = areaDeEspecializacao;
    }

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) throws IllegalArgumentException {
        if (inscricao <= 0) {
            throw new IllegalArgumentException();
        }
        this.inscricao = inscricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws IllegalArgumentException {
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws IllegalArgumentException {
        if (endereco == null || endereco.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }        
        this.endereco = endereco;
    } 

    
}
