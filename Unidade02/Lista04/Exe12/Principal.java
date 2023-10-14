package Unidade02.Lista04.Exe12;

public class Principal {

    public static void main(String[] args) {

        Cantores c1 = new Cantores("Capital Inicial");
        Cantores c2 = new Cantores("Engenheiros do Hawaii");
        Cantores c3 = new Cantores("Pitty");

        Musicas m1 = new Musicas("À sua maneira", 4.27);
        Musicas m2 = new Musicas("Infinita Highway", 4.18);
        Musicas m3 = new Musicas("Na sua estante", 3.42);

        CdsB cd1 = new CdsB("CD Coletânea", 2023, true, false);
        cd1.addCantor(c1);
        cd1.addCantor(c2);
        cd1.addMusica(m1);
        cd1.addMusica(m2);

        CdsB cd2 = new CdsB("Cd Pitty", 2000, false, false);
        cd2.addCantor(c3);
        cd2.addMusica(m3);

        for ( CdsB cd : CdsB.listaCds) {
            System.out.println(cd.toString());
        }
    }
}
