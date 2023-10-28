package Unidade02.Lista05.Exe05;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class Principal {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe:\nQ - Qualquer evento \nS - Show Musical \nE - Exibir dados");
        char escolha = kb.next().toUpperCase().charAt(0);

        while (escolha != 'Q' && escolha != 'S' && escolha != 'E') {
            System.out.println("Opção inválida, por favor, informe:\nQ - Qualquer evento \nS - Show Musical \nE - Exibir dados");
            escolha = kb.next().toUpperCase().charAt(0);
        }

        while (escolha == 'Q' || escolha == 'S') {
            String artista = "", musica = "";

            System.out.println("Título: ");
            String titulo = kb.next(); 
            System.out.println("Valor do ingresso: ");
            double ingresso = kb.nextDouble();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Data do evento (dd/MM/yyyy): ");
            String data = kb.next();
            LocalDate dataformatter = LocalDate.parse(data, formatter); // Convertendo a entrada em LocalDate
            
            System.out.println("Quantidade de pagantes: ");
            int pagantes = kb.nextInt();
            System.out.println("Escreva uma avaliação sobre o evento: ");
            String opiniaoGeral = kb.next();
            
            if (escolha == 'Q') {
                System.out.println("Informe:\nQ - Qualquer evento \nS - Show Musical \nE - Exibir dados");
                escolha = kb.next().toUpperCase().charAt(0);

                Evento umEvento = new Evento(titulo, ingresso, dataformatter);
                Avaliacao umaAvaliacao = new Avaliacao(pagantes, opiniaoGeral);
                umEvento.adicionarAvaliacao(umaAvaliacao);

            } else if (escolha == 'S') {
                System.out.println("Artista: ");
                artista = kb.next();
                System.out.println("Estilo musical: ");
                musica = kb.next();

                System.out.println("Informe:\nQ - Qualquer evento \nS - Show Musical \nE - Exibir dados");
                escolha = kb.next().toUpperCase().charAt(0);

                ShowMusical umShowMusical = new ShowMusical(titulo, ingresso, dataformatter, artista, musica);
                Avaliacao umaAvaliacao = new Avaliacao(pagantes, opiniaoGeral);
                umShowMusical.adicionarAvaliacao(umaAvaliacao);
            }
        }
        
        if (escolha == 'E') {
            System.out.println(" ----- Lista de eventos ----- ");
            for (Evento e : Evento.listaEventos) {
                System.out.println(e.mostrar() + "\n------------------\n");
            }
            for (ShowMusical s : ShowMusical.listaShows) {
                System.out.println(s.mostrar() + "\n------------------\n");
            }
        }
        kb.close();
    }
}