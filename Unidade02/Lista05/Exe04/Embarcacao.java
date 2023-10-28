package Unidade02.Lista05.Exe04;
public abstract class Embarcacao {
    
    protected int registroCapitania, qtdPessoas;

    public Embarcacao(int registroCapitania, int qtdPessoas) {
        setRegistroCapitania(registroCapitania);
        setQtdPessoas(qtdPessoas);
    }

    public int getRegistroCapitania() {
        return registroCapitania;
    }

    public void setRegistroCapitania(int registroCapitania) throws IllegalArgumentException {
        if (registroCapitania < 0) {
            throw new IllegalArgumentException("Registro da capitania inválido");
        }
        this.registroCapitania = registroCapitania;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) throws IllegalArgumentException {
        if (qtdPessoas < 0) {
            throw new IllegalArgumentException("Quantidade de pessoas inválida");
        }
        this.qtdPessoas = qtdPessoas;
    }

    public abstract String mostrar();

    @Override
    public String toString() {
        return "Reg. Capitania: " + getRegistroCapitania() + "\nQtde Pessoas: " + getQtdPessoas();
    }
}