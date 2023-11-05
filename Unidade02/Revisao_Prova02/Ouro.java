package Unidade02.Revisao_Prova02;
public class Ouro extends Plano {

    public Ouro(String nome, int ano, int qtdDependentes) {
        super(nome, ano, qtdDependentes);
    }
    
    //sobrescrevendo as informações de Plano para o tipo do plano (Ouro)
    @Override
    public String toString() {
        return "----- Plano ouro: -----\n" + super.toString();
    }
}
