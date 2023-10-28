package Unidade02.Lista05.Exe01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        List<Aluno> listaAlunos = new ArrayList<>();

        System.out.print("Informe: \n1- Graduação \n2- Pós-graduação \n3- Verificar cadastro ");
        int cadastro = kb.nextInt();
        System.out.println("Informe o nome do aluno: ");
        String nome = kb.next();
        System.out.println("Informe o nome do curso: ");
        String curso = kb.next();

        while (cadastro != 1 && cadastro != 2 && cadastro != 3){
            System.out.println("Escolha inválida, por favor, informe: \n1- Graduação \n2- Pós-graduação \n3- Verificar cadastro ");
            cadastro = kb.nextInt();
            System.out.println("Informe o nome do aluno: ");
            nome = kb.next();
            System.out.println("Informe o nome do curso: ");
            curso = kb.next();
        }

        while(cadastro == 1 || cadastro == 2 || cadastro == 3){
            if (cadastro == 1) {
                System.out.println("Informe o semestre: ");
                int semestre = kb.nextInt();

                AlunoGraduacao ag = new AlunoGraduacao(nome, curso, semestre);
                listaAlunos.add(ag);

                System.out.println("Informe: \n1- Graduação \n2- Pós-graduação \n3- Verificar cadastro ");
                cadastro = kb.nextInt();
                System.out.println("Informe o nome do aluno: ");
                nome = kb.next();
                System.out.println("Informe o nome do curso: ");
                curso = kb.next();

            } else if (cadastro == 2) {
                System.out.println("Informe os pontos: ");
                int pontos = kb.nextInt();

                AlunoPos ap = new AlunoPos(nome, curso, pontos);
                listaAlunos.add(ap);

                System.out.println("Informe: \n1- Graduação \n2- Pós-graduação \n3- Verificar cadastro ");
                cadastro = kb.nextInt();
                System.out.println("Informe o nome do aluno: ");
                nome = kb.next();
                System.out.println("Informe o nome do curso: ");
                curso = kb.next();

            } else if (cadastro == 3) {
                for (Aluno a: listaAlunos) {
                    if (a instanceof AlunoGraduacao) {
                        AlunoGraduacao AlunoG = (AlunoGraduacao)a; 
                        System.out.println(AlunoG.exibirDados());
                    }

                    if (a instanceof AlunoPos) {
                        System.out.println(((AlunoPos)a).exibirDados());
                    }
                }
                break;
            }
        }
        kb.close();
    }
}