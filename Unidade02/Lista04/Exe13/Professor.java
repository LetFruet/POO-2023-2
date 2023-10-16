package Unidade02.Lista04.Exe13;
import java.util.ArrayList;
import java.util.List;
public class Professor {
    
    private String nomeProfessor;
    private String telefone;
    private double valorAula;
    public List<Professor> listaProfessores = new ArrayList<>();

    public Professor(String nomeProfessor, String telefone, double valorAula) {
        setNomeProfessor(nomeProfessor);
        setTelefone(telefone);
        setValorAula(valorAula);
        listaProfessores.add(this);
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) throws IllegalArgumentException {
        if (nomeProfessor == null || nomeProfessor.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do professor inválido");
        }
        this.nomeProfessor = nomeProfessor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws IllegalArgumentException {
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone do professor inválido");
        }
        this.telefone = telefone;
    }

    public double getValorAula() {
        return valorAula;
    }

    public void setValorAula(double valorAula) throws IllegalArgumentException {
        if (valorAula < 0) {
            throw new IllegalArgumentException("Valor da aula inválida");
        }
        this.valorAula = valorAula;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }
   
    @Override
    public String toString() {

        return "Nome: " + getNomeProfessor() + "\nTelefone: " + getTelefone() + "\nValor da aula: R$ " + getValorAula();
    }
}
