package Unidade01.Lista01.Exe03;
public class AnoBissexto {

    //definindo os atributos 
    private int ano;

    //getters e setters
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }

    //verificando se o ano é ou não bissexto
    public int verificar(){
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    //chamando o método verificar() para imprimir a resposta 
    public int imprimir() {
        return verificar();
    }
}