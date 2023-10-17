package Unidade02.Heranca.Professor;
import java.util.ArrayList;
import java.util.List;
public class Principal {
    
    public static void main(String[] args) {

        Professor umProfessor = new Professor("Douglas", "1234", 35);
        ProfDE umProfDE = new ProfDE("Aurélio", "5678", 50, 15000);
        ProfHorista umProfHorista = new ProfHorista("Henrique", "9012", 22, 160, 25);

        System.out.println(umProfessor); //o programa subentende que deve chamar o método toString
        System.out.println("----------");
        System.out.println(umProfDE);
        System.out.println("----------");
        System.out.println(umProfHorista);
        System.out.println("----------");

        List<Professor> listaProfessores = new ArrayList<>();

        listaProfessores.add(umProfessor);
        listaProfessores.add(umProfDE);
        listaProfessores.add(umProfHorista);

        for (Professor umProf : listaProfessores) {
            if (umProf instanceof ProfDE) { //verificando se umProf é do tipo profDE
                ProfDE ProfessorDE = (ProfDE)umProf; //convertendo o objeto professorDE para o tipo profDE
                System.out.println(ProfessorDE.getSalario()); //chamando o método get salário do dado professorDE
                System.out.println("----------");
            }
            if (umProf instanceof ProfHorista) { //verificando se umProf é do tipo profHorista
                ProfHorista ProfessorHorista = (ProfHorista)umProf; //convertendo o objeto professorDE para o tipo profHorista
                System.out.println(ProfessorHorista.calcularSalario()); //chamando o método get salário do dado profHorista
                System.out.println("----------");
            }
        }
    }
}