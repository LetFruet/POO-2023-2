public class Jogador extends Atleta {

    public Jogador(String nome, double peso, int idade) {
        super(nome, peso, idade);
    }

    @Override
    public String definirCategoria() {

        if (getIdade() <= 16) {
            return "Infantil";
        } else if (getIdade() <= 18) {
            return "Juvenil";
        } else {
            return "Adulto";
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCategoria: " + definirCategoria() + "\n";
    }
}
