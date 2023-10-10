/*Um despachante necessita de um sistema para calcular/consultar os valores do licenciamento a serem pagos pelos seus clientes. 
Para calcular o valor do licenciamento o sistema necessita basicamente da placa do veículo. Dentre as informações dos veículos 
também se encontram as do seu proprietário (nome, endereço e CPF). Além, das multas recebidas (local, tipo, valor e status). 
A base de calculo do licenciamento é diferente entre veículos de carga e veículos de Passeio. 
a) Veículos de Carga: a alíquota de IPVA é de 6% do seu valor de mercado. Para aqueles cuja capacidade de carga seja superior 
a 1 (uma) tonelada, a alíquota será de 9% do seu valor de mercado 
b) Veículos de Passeio: o valor do IPVA é de 4% do seu valor de mercado. Para aqueles movidos a álcool o valor do IPVA é de 
3% do seu valor de mercado. 
O valor do licenciamento é determinado pela soma do valor do IPVA (obedecendo ao calculo e categorização acima) e o valor total das 
multas que possuem status “Em aberto”. O sistema deverá permitir que o despachante consulte as informações do veículo, proprietário 
e multas a partir da placa do veículo. Ao final de cada consulta, deve-se mostrar o valor do licenciamento. */
package Unidade02.Lista04.Exe09;
import java.util.ArrayList;
import java.util.List;
public class Proprietario {
    
    private String nomeProprietario;
    private String cpfProprietario;
    private List<Endereco> listaEndereco;
    private List<Veiculo> listaVeiculo;

    public Proprietario(String nomeProprietario, String cpfProprietario) {
        setNomeProprietario(nomeProprietario);
        setCpfProprietario(cpfProprietario);
        this.listaEndereco = new ArrayList<>(); //o proprietário terá vários endereços e vários veículos
        this.listaVeiculo = new ArrayList<>(); //chama a partir do objeto proprietário
    }

    public String getnomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) throws IllegalArgumentException {
        if (nomeProprietario == null || nomeProprietario.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do proprietário inválido");
        }
        this.nomeProprietario = nomeProprietario;
    }

    public String getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) throws IllegalArgumentException {
        if (cpfProprietario == null || cpfProprietario.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF do proprietário");
        }
        this.cpfProprietario = cpfProprietario;
    }

    public List<Endereco> getEndereco() {
        return listaEndereco;
    }

    public void addEndereco(Endereco endereco) throws IllegalArgumentException {
        if (endereco == null) {
            throw new IllegalArgumentException();
        }
        listaEndereco.add(endereco);
    }

    public List<Veiculo> getVeiculo() {
        return listaVeiculo;
    }

    public void addVeiculo(Veiculo veiculo) throws IllegalArgumentException {
        if (veiculo == null) {
            throw new IllegalArgumentException();
        }
        listaVeiculo.add(veiculo);
    }

    @Override
    public String toString() {
        String str = "Proprietário: " + getnomeProprietario();
        
        str += "\n\n---- Endereço ----\n";
        for (Endereco e : listaEndereco) {
            str += e.toString() + "\n";
        }

        str += "\n---- Veículo ----\n";
        for (Veiculo v : listaVeiculo) {
            str += v.toString();
        }
        return str;
    }
}