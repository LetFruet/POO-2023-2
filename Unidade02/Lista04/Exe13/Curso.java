/*Curso de aperfeiçoamento: A empresa iPhoto oferece diversos cursos de aperfeiçoamento profissional. O dono precisa controlar, 
inicialmente: os cursos oferecidos, a data de inicio e término, o horário de início e término, o nome e o telefone celular do professor 
e o valor da sua hora/aula. Para cada curso, deve-se controlar: a carga horária, o conteúdo programático e o valor do curso. */
package Unidade02.Lista04.Exe13;
import java.util.ArrayList;
import java.util.List;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
public class Curso {

    private String nomeCurso;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private LocalTime horarioInicio;
    private LocalTime horarioTermino;
    private double valorCurso;
    private List<Professor> listaProfessor = new ArrayList<>();
    private List<ConteudoProgramatico> listaConteudos = new ArrayList<>();
    public static List<Curso> listaCursos = new ArrayList<>();

    public Curso(String nomeCurso, LocalDate dataInicio, LocalDate dataTermino, LocalTime horarioInicio, LocalTime horarioTermino, double valorCurso) {
        setNomeCurso(nomeCurso);
        setDataInicio(dataInicio);
        setDataTermino(dataTermino);
        setHorarioInicio(horarioInicio);
        setHorarioTermino(horarioTermino);
        setValorCurso(valorCurso);
        listaCursos.add(this);
    }

    public void adicionarConteudo(ConteudoProgramatico novoConteudo) {
        listaConteudos.add(novoConteudo);
    }

    public void adicionarProfessor(Professor novoProfessor) {
        listaProfessor.add(novoProfessor);
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) throws IllegalArgumentException {
        if (nomeCurso == null || nomeCurso.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do curso inválido");
        }
        this.nomeCurso = nomeCurso;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public LocalTime getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(LocalTime horarioTermino) {
        this.horarioTermino = horarioTermino;
    }

    public double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(double valorCurso) throws IllegalArgumentException {
        if (valorCurso < 0) {
            throw new IllegalArgumentException("Valor do curso inválido");
        }
        this.valorCurso = valorCurso;
    }

    public static List<Curso> getListaCursos() {
        return listaCursos;
    }

    public static void setListaCursos(List<Curso> listaCursos) {
        Curso.listaCursos = listaCursos;
    }

    //verificando a carga horária do curso
    public String calcularCargaHoraria() {
        Duration horas = Duration.between(getHorarioInicio(), getHorarioTermino());
        Period dias = Period.between(getDataInicio(), getDataTermino());
    
        // Calculando o total de dias considerando anos, meses e dias
        int totalDias = dias.getDays() + dias.getMonths() * 30 + dias.getYears() * 365;
    
        double cargaHoraria = horas.toHours() * totalDias;
    
        return "Carga horária do curso: " + cargaHoraria + " horas";
    }
    

   @Override
    public String toString() {
        String str = "Curso: " + getNomeCurso() + "\nData início / término: " + getDataInicio() + " / " + getDataTermino() + 
            "\nHorário início / término: " + getHorarioInicio() + " / " + getHorarioTermino() + "\nValor do curso: R$ " + 
            getValorCurso() + "\n\nConteúdo programático: \n";
            
        for (ConteudoProgramatico c : listaConteudos) {
            str += c.toString() + "\n";
        }

        str += "\nProfessor: ";
        for (Professor p : listaProfessor) {
            str += p.toString() + "\n";
        }

        return str;
    }
}