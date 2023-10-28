package Unidade02.Lista05.Exe04;
public class BoteSalvaVidas extends Embarcacao {
    
    protected boolean inflavel;

    public BoteSalvaVidas(int registroCapitania, int qtdPessoas, boolean inflavel) {
        super(registroCapitania, qtdPessoas);
        setInflavel(inflavel);
    }

    public boolean isInflavel() {
        return inflavel;
    }

    public void setInflavel(boolean inflavel) {
        this.inflavel = inflavel;
    }

    @Override
    public String mostrar() {
        String str= super.toString() + "\nInflável: ";

        if (isInflavel()) {
            str += "Sim";
        } else {
            str += "Não";
        }
        return str;
    }
}