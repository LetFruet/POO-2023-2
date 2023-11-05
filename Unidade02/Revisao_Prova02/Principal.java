package Unidade02.Revisao_Prova02;
import java.time.LocalDate;
public class Principal {

    public static void main(String[] args) {

        Ouro o1 = new Ouro("Unimed", 1998, 6);
        Ouro o2 = new Ouro("Interblu", 2022, 4);
        Ouro o3 = new Ouro("Unimed", 2000, 1);

        Prata p1 = new Prata("Unimed", 1987, 2);
        Prata p2 = new Prata("Interblu", 2012, 8);
        Prata p3 = new Prata("Interblu", 2001, 1);

        Paciente pac1 = new Paciente("Ana", o1);
        Paciente pac2 = new Paciente("Jorge", o2);
        Paciente pac3 = new Paciente("Guilherme", o3);
        Paciente pac4 = new Paciente("Laura", p1);
        Paciente pac5 = new Paciente("Dora", p2);

        Medico m1 = new Medico("Luca", "ABC123", "Gastroenterologia");
        Medico m2 = new Medico("Paulo", "DEF456", "Cardiologista");
        Medico m3 = new Medico("Paulo", "GHI789", "Neurologista");

        Consulta c1 = new Consulta("123", LocalDate.of(2023, 11, 11), pac1, m1);
        Consulta c2 = new Consulta("456", LocalDate.of(2023, 11, 19), pac1, m2);
        Consulta c3 = new Consulta("789", LocalDate.of(2023, 11, 07), pac2, m3);
        Consulta c4 = new Consulta("012", LocalDate.of(2023, 11, 30), pac3, m1);
        Consulta c5 = new Consulta("345", LocalDate.of(2023, 11, 25), pac4, m3);
        Consulta c6 = new Consulta("678", LocalDate.of(2023, 11, 25), pac5, m1);

        System.out.println(consultaMenorValor());
        System.out.println();
        System.out.println(consultaPorPaciente(pac1));
        System.out.println();
        System.out.println(pacientePorPlano());
        System.out.println();
        System.out.println(verificarGatro());
    }

    public static String consultaMenorValor() {
        double menorValor = Double.MAX_VALUE;
        String str = "";

        for (Consulta c : Consulta.listaConsultas) {
            double desconto = c.calcularDesconto();
            if (desconto < menorValor) {
                menorValor = desconto;
                str = c.toString();
            }
        }
        return "\nConsulta com o menor valor: \n" + str;
    }

    public static String consultaPorPaciente(Paciente umPaciente) {

        String str = "";
        int cont = 0;

        for (Consulta c : Consulta.listaConsultas) {
            if (c.getUmPaciente() == umPaciente) {
                str += "- " + c.toString() + "\n";
                cont++;
            }
        }
        return "\n\n----- Consultas pelo paciente informado: " + cont + "\n" + str;
    }

    public static String pacientePorPlano() {
        String strOuro = "", strPrata = "", result = "";
        int contOuro = 0, contPrata = 0;

        for (Paciente p : Paciente.listaPacientes) {
            if (p.getUmPlano() instanceof Ouro) {
                strOuro += p.toString() + "\n";
                contOuro++;
            } else if (p.getUmPlano() instanceof Prata) {
                strPrata += p.toString() + "\n";
                contPrata++;
            }
        }
        
        if (contOuro > 0) {
            result += "\n----- Plano Ouro -----\n" + strOuro + "Quantidade de pacientes que possuem o plano Ouro: " + contOuro;
        }
        
        if (contPrata > 0) {
            result += "\n\n----- Plano Prata -----\n" + strPrata + "Quantidade de pacientes que possuem o plano Prata: " + contPrata;
        }
    
        if (result.isEmpty()) {
            result = "Nenhum paciente com plano Ouro ou Prata encontrado.";
        }

        return result;
    }
    
    public static String verificarGatro() {

        String str = "\n\n----- Consultas de Gastroenterologia -----\n";
        boolean encontrouConsulta = false;

        for (Consulta c : Consulta.listaConsultas) {
            if (c.getUmPaciente().getUmPlano() instanceof Ouro
                    && c.getUmMedico().getEspecialidade().toLowerCase().equals("gastroenterologia")) {
                str += c.toString() + "\n";
                encontrouConsulta = true;
            }
        }

        if (!encontrouConsulta) {
            str = "Nenhuma consulta encontrada";
        }
        return str;
    }
}
