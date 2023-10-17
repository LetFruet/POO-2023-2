package Unidade02.Heranca.Professor;

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
    }
}