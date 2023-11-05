package Unidade02.Revisao_Prova02.Revisao02;

public class Bebida extends Produto{
    
    private boolean alcoolica;

    public Bebida(String nomeProduto, double valor, boolean alcoolica) {
        super(nomeProduto, valor);
        setAlcoolica(alcoolica);
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }
    public void setAlcoolica(boolean alcoolica) {
        this.alcoolica = alcoolica;
    }

    @Override 
    public String toString() {
        String str = super.toString() + ".   Alcóolica: ";

        if (isAlcoolica()) {
            str += "Sim";
        } else {
            str += "Não";
        }
        
        return str;
    }
    
}
