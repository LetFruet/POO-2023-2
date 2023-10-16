package Unidade02.Lista04.Exe13;
import java.time.LocalTime;
import java.time.LocalDate;
public class Principal {
    
    public static void main(String[] args) {
        
        Curso c1 = new Curso("JAVA", LocalDate.of(2022,01,01), LocalDate.of(2023,01,01), LocalTime.of(8,00,00), LocalTime.of(12,00,00), 5000.00);
        Professor p1 = new Professor("Luiz Silva", "(47) 9 9999-9999", 200.00);
        ConteudoProgramatico IP = new ConteudoProgramatico("IP", "Introdução a programação");
        ConteudoProgramatico POO = new ConteudoProgramatico("POO", "Programação Orientada a objetos");

        c1.adicionarConteudo(IP);
        c1.adicionarConteudo(POO);
        c1.adicionarProfessor(p1);

        System.out.println(c1);

        System.out.println(c1.calcularCargaHoraria());

    }
}
