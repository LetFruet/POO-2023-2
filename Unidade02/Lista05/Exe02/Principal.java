package Unidade02.Lista05.Exe02;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) throws ParseException {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe o nome do professor: ");
        String nome = kb.next();
        System.out.println("Informe sua área de atuação: ");
        String area = kb.next();

        Professor p1 = new Professor(nome, area);

        System.out.println("Informe: \nN - artigo normal \nI - artigo importante \nE - exibir resultados");
        char tipo = kb.next().toUpperCase().charAt(0);

        while(tipo == 'N' || tipo == 'I') {
            int fatorImpacto = 0;
            
            System.out.println("Informe o título: ");
            String titulo= kb.next();
            System.out.println("Informe o periódico: ");
            String periodico = kb.next();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
            System.out.println("Data da publicação: ");
            Date dataPublicacao = sdf.parse(kb.next());
            System.out.println("Qualis: ");
            char qualis = kb.next().charAt(0);

            if (tipo == 'I') {
                System.out.println("Informe o fator de impacto: ");
                fatorImpacto = kb.nextInt();
            }

            if (tipo == 'N') {
                Artigo A = new Artigo(titulo, periodico, dataPublicacao, qualis);
                p1.adicionarArtigo(A);

            } else if (tipo == 'I') {
                ArtigoImportante AI = new ArtigoImportante(titulo, periodico, dataPublicacao, qualis, fatorImpacto);
                p1.adicionarArtigo(AI);
            }

            System.out.println("Informe: \nN - artigo normal \nI - artigo importante \nE - exibir resultados");
            tipo = kb.next().toUpperCase().charAt(0);
        }

        if (tipo == 'E') {
            System.out.println(p1.mostrarEstatistica());
        }

        if (tipo != 'I' && tipo != 'N' && tipo != 'E') {
            System.out.println("Escolha inválida, por favor, informe: \nN - artigo normal \nI - artigo importante \nE - exibir resultados");
            tipo = kb.next().toUpperCase().charAt(0);
        }

        kb.close();
    }
}