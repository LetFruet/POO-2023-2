package Unidade02.Revisao_Prova02;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Consulta {
    
    private String codigo;
    private LocalDate data;
    private double valorConsulta;
    private Paciente umPaciente; 
    private Medico umMedico;
    public static List<Consulta> listaConsultas = new ArrayList<Consulta>();

    public Consulta(String codigo, LocalDate data, Paciente umPaciente, Medico umMedico) {
        setCodigo(codigo);
        setData(data);
        setValorConsulta(250.00);
        setUmPaciente(umPaciente);
        setUmMedico(umMedico);
        listaConsultas.add(this);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) throws IllegalArgumentException {
        if (codigo == null || codigo.isEmpty() || codigo.isBlank()) {
            throw new IllegalArgumentException("Código da consulta inválido");
        }
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) throws IllegalArgumentException {
        if (data == null) {
            throw new IllegalArgumentException("Data da consulta inválido");
        }
        this.data = data;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) throws IllegalArgumentException {
        if (valorConsulta < 0) {
            throw new IllegalArgumentException("Valor da consulta inválido");
        }
        this.valorConsulta = valorConsulta;
    }

    public Paciente getUmPaciente() {
        return umPaciente;
    }

    public void setUmPaciente(Paciente umPaciente) throws IllegalArgumentException {
        if (umPaciente == null) {
            throw new IllegalArgumentException("Paciente da consulta inválido");
        }
        this.umPaciente = umPaciente;
    }

    public Medico getUmMedico() {
        return umMedico;
    }

    public void setUmMedico(Medico umMedico) throws IllegalArgumentException {
        if (umMedico == null) {
            throw new IllegalArgumentException("Médico da consulta inválido");
        }
        this.umMedico = umMedico;
    }

    public double calcularDesconto() {

        double valorComDesconto = getValorConsulta();  
    
        if (getUmPaciente().getUmPlano() instanceof Prata) {
            if (getUmPaciente().getUmPlano().getAno() <= 2000) {
                valorComDesconto *= 0.7;  
            } else {
                valorComDesconto *= 0.8;  
            }
        }
    
        if (getUmPaciente().getUmPlano() instanceof Ouro) {
            if (getUmPaciente().getUmPlano().getQtdDependentes() > 2) {
                valorComDesconto *= 0.5;  
            } else {
                valorComDesconto *= 0.6;  
            }
        }
        return valorComDesconto;
    }

    @Override 
    public String toString() {
        return "Consulta de número: " + getCodigo() + "\nPaciente: " + getUmPaciente().getNome() + "\nMédico: " +
                getUmMedico().getNome() + "\nFeito no dia: " + getData() + "\nTeve o valor de R$: " + calcularDesconto();
    }
}