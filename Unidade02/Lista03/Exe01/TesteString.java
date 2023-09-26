/*Crie uma classe chamada TesteString e dentro da mesma faça o seguinte: 
a) Dentro do main, crie 10 variáveis do tipo String com nomes de times de futebol; 
b) Armazene estas strings em um ArrayList; 
c) Remova o elemento que está na SEXTA (6) posição do ArrayList; 
d) Utilize o método get() para obter cada um dos elementos do ArrayList, imprimindo-os na tela.*/
package Unidade02.Lista03.Exe01;
import java.util.ArrayList;
public class TesteString {
    
    public static void main(String[] args) {

        String time1 = "Vasco";
        String time2 = "Fluminense";
        String time3 = "Botafogo";
        String time4 = "Corintians";
        String time5 = "Palmeiras";
        String time6 = "Avai";
        String time7 = "Brusque";
        String time8 = "Coritiba";
        String time9 = "Vasco";
        String time10 = "Atletico Mineiro";


        ArrayList<String> times = new ArrayList<>();

        times.add(time1);
        times.add(time2);
        times.add(time3);
        times.add(time4);
        times.add(time5);
        times.add(time6);
        times.add(time7);
        times.add(time8);
        times.add(time9);
        times.add(time10);

        times.remove(6);

        for (int i = 0; i < times.size(); i++) {
            System.out.println(times.get(i));

        }
    }
}