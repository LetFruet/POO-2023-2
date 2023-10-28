package Unidade02.Lista05.Exe06;
public class CarroTurbo extends Carro {

    public CarroTurbo(String placa, int ano, int tipoCombustível, double potênciaMotor) {
        super(placa, ano, tipoCombustível, potênciaMotor);
    }

    public double calcularRendimentoCombustivel() {

        double rendimento = 0;
        if (getTipoCombustível() == 1) {
            rendimento = 10 / ((getPotênciaMotor() * 1.3) * 0.7);
        } else {
            rendimento = 12 / ((getPotênciaMotor() * 1.3) * 0.6);
        }
        return rendimento;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}