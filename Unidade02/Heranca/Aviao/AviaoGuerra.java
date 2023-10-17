package Unidade02.Heranca.Aviao;

public class AviaoGuerra extends Aviao { //extensão da classe Aviao
    
    public AviaoGuerra(String cor) {
        super(cor); //passa a informação para a classe superior (pai)
        System.out.println("Construtor da classe AviaoGuerra " + cor);
    }
}
