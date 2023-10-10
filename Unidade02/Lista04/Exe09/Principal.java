package Unidade02.Lista04.Exe09;

import java.util.HashMap;

public class Principal {
   
    public static void main(String[] args) {
        
        Proprietario p1 = new Proprietario("Leticia", "123");
        Endereco e1 = new Endereco("Rua A", "Casa", 123);
        Veiculo v1 = new Veiculo("123ABC", 39650.00, 'p', false, 2);
        Multas m1 = new Multas("SC", "Grave", 250.00, true);

        p1.addEndereco(e1);
        p1.addVeiculo(v1);
        v1.addMultas(m1);
        
        System.out.println(p1);
        System.out.println("- Valor do IPVA: R$" + v1.calcularLicenciamento());
        System.out.println("- Valor do Licenciamento: R$" + v1.calcularLicenciamento());

        //HashMap para armazenar vários proprietarios
        HashMap<String, Veiculo> despachante = new HashMap<String, Veiculo>();
        //inserindo objetos no HashMap
        despachante.put(v1.getPlacaVeiculo(), v1);
        //consultando o licenciamento de um dado veículo (apenas consultando, não acessando)
        try {
            System.out.println();
            System.out.println("---- Verificando a placa ----");
            System.out.println(despachante.get("123ABC"));
        } catch (Exception e) {
            System.out.println("Veículo não encontrado");
        }

    }
}
