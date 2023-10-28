package Trabalho02;
public class Confronto {

    public static String executar(SuperHeroi superHeroi, Vilao vilao) {

        String str = "";
        
        if (superHeroi.getPoderTotal() > vilao.getPoderTotal()) {
            str = "O super herói " + superHeroi.getNome() + " venceu a batalha";
        } else {
            str = "O vilão " + vilao.getNome() + " venceu a batalha";
        }
        return str;
    }
}