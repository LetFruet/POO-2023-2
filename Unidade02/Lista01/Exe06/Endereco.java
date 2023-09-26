package Unidade02.Lista01.Exe06;
public class Endereco {
    
    private String logradouro; //quando o atributo é público, não consigo fazer a validação
    private String complemento;
    private int numero;

    //construtor com parâmetros serve para poder colocar os argumentos
    //o Endereco recebe as informações obrigatórias
    public Endereco(String logradouro) { 
        setLogradouro(logradouro);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) throws IllegalArgumentException {
        if (logradouro.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) throws IllegalArgumentException {
		if (complemento == null || complemento.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws IllegalArgumentException {
        if (numero <= 0) {
            throw new IllegalArgumentException();
        }
        this.numero = numero;
    }

    @Override
    public String toString() {
        String dados = "Logradouro: " + getLogradouro();

        if (getNumero() != 0) {
            dados += ", número: " + getNumero();
        }
		if (getComplemento() != null && !getComplemento().trim().isEmpty()) {
            dados += ", " + getComplemento();
        }

        return dados;
    }
}