package Unidade02.Revisao_Prova02;
public class Prata extends Plano {

    public Prata(String nome, int ano, int qtdDependentes) {
        super(nome, ano, qtdDependentes);
    }
    
    //sobrescrevendo as informações de Plano para o tipo do plano (Prata)
    @Override
    public String toString() {
        return "----- Plano prata: -----\n" + super.toString();
    }
}
