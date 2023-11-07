// LETÍCIA FRUET

package Prova02;
public class Principal {
    
    public static void main(String[] args) {
     
        Passageiro umPassageiro = new Passageiro("Ana");

        Estudante umEstudante = new Estudante("Lucas", 123456);

        Aposentado umAposentado = new Aposentado("Maria", "123.456.789-00");

        Motorista umMotorista = new Motorista("Guilherme", "ABC123");
        Motorista outroMotorista = new Motorista("Alan", "BCD234");

        Municipal onibusMunicipal = new Municipal("123 ABC", umMotorista, 40);
        onibusMunicipal.adicionarPassageiro(umEstudante);
        onibusMunicipal.adicionarPassageiro(umPassageiro);

        Intermunicipal onibusIntermunicipal = new Intermunicipal("456 DEF", outroMotorista);
        onibusIntermunicipal.adicionarPassageiro(umAposentado);

        System.out.println(passageirosTransportados("Guilherme", "123 ABC"));
        System.out.println(valorArrecadado("123 ABC"));
        System.out.println(verificarAposentados());
        System.out.println(onibusMunicipal.municipalMenorLotacao());
        System.out.println(onibusIntermunicipal.intermunicipalMenorLotacao());
    }

    public static String passageirosTransportados(String nomeMotorista, String cnh) {

        String str = "Lista de passageiros transportados por " + nomeMotorista + "\n";

        for (Onibus o : Onibus.listaOnibus) {
            if (o.getMotorista().getNome().equals(nomeMotorista) && o.getMotorista().getCnh().equals(cnh)) {
                for (Passageiro p : Passageiro.listaPassageiro) {
                    str += p.toString() + "\n";
                }
            } else {
                str += "Nenhum passageiro encontrado\n";
            }
        }
        return str;
    }

    public static String valorArrecadado(String placa) {

        double somaValor = 0;

        for (Onibus o : Onibus.listaOnibus) {
            if (o.getPlaca().equals(placa)) {
                for (Passageiro p : Passageiro.listaPassageiro) {
                    somaValor += p.getTarifa();
                }
            }
        }
        return "Valor total arrecadado pelo ônibus de placa " + placa + ": R$ " + somaValor + "\n";
    }

    public static String verificarAposentados() {

        return "Total de aposentados transportados: " + Aposentado.listaAposentados.size() + "\n";
    }
}