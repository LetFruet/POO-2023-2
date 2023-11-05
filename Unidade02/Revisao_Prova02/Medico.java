package Unidade02.Revisao_Prova02;
public class Medico extends Pessoa {

    private String crm, especialidade;

    public Medico(String nome, String crm, String especialidade) {
        super(nome);
        setCrm(crm);
        setEspecialidade(especialidade);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws IllegalArgumentException {
        if (crm == null || crm.isEmpty() || crm.isBlank()) {
            throw new IllegalArgumentException("CRM inválido");
        }
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) throws IllegalArgumentException {
        if (especialidade == null || especialidade.isEmpty() || especialidade.isBlank()) {
            throw new IllegalArgumentException("Especialidade inválida");
        }
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Médico: " + getNome() + "\nCRM: " + getCrm() + "\nEspecialidade: " + getEspecialidade();
    }
}