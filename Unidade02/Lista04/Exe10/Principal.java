package Unidade02.Lista04.Exe10;
public class Principal {
    
    public static void main(String[] args) {
        
        Aeroporto aeroporto1 = new Aeroporto("SSA", "Salvador", false);
        Aeroporto aeroporto2 = new Aeroporto("BSB", "Brasília", true);
        
        Aviao aviao1 = new Aviao("AB1234", "Boeing", "Boeing Co.", 180, 150);
        Aviao aviao2 = new Aviao("CD5678", "Airbus", "Airbus S.A.S.", 220, 200);
        
        aeroporto1.adicionarAviao(aviao1);
        aeroporto2.adicionarAviao(aviao2);
        
        aeroporto1.adicionarPartida(aeroporto2);
        
        System.out.println(aeroporto2.toString());
    }
}
//erro