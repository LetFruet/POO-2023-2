package Unidade02.Revisao_Prova02;
import java.util.ArrayList;
import java.util.List;
public class Paciente extends Pessoa {

    private Plano umPlano; 
    public static List<Paciente> listaPacientes = new ArrayList<Paciente>();

    public Paciente(String nome, Plano umPlano) {
        super(nome);
        setUmPlano(umPlano);
        listaPacientes.add(this); 
    }

    public Plano getUmPlano() {
        return umPlano;
    }

    public void setUmPlano(Plano umPlano) {
        this.umPlano = umPlano;
    }

    public static List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public static void setListaPacientes(List<Paciente> listaPacientes) {
        Paciente.listaPacientes = listaPacientes;
    }

    @Override
    public String toString() {
        return "Paciente: " + getNome() + "\nPlano: " + umPlano.toString();
    }
}