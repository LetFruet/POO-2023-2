package Unidade02.Lista05.Exe04;
public class Principal {
    
    public static void main(String[] args) {
        
        Navio n1 = new Navio(768, 1490, "Redenção XIII");
        
        BoteSalvaVidas b1 = new BoteSalvaVidas(5452, 498, false);
        BoteSalvaVidas b2 = new BoteSalvaVidas(2346, 328, true);
        BoteSalvaVidas b3 = new BoteSalvaVidas(438, 157, true);

        n1.adicionarBotes(b1);
        n1.adicionarBotes(b2);
        n1.adicionarBotes(b3);

        System.out.println(n1.mostrar());
    }
}
