package Unidade02.Lista04.Exe11;

public class Principal {
    
    public static void main(String[] args) {
                
        Palm palm = new Palm();
        Cds c1 = new Cds("Luan Santana", "CD A", 2010, palm);
        Cds c2 = new Cds("Ivete Sangalo", "CD B", 2020, palm);
        
        System.out.println(palm.toString());
    }
}
