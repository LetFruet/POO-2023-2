// LETÍCIA FRUET

package Prova02;
public class Estudante extends Passageiro {

    private int registroAcademico;

    public Estudante(String nome, int registroAcademico) {
        super(nome);
        setRegistroAcademico(registroAcademico);
    }

    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) throws IllegalArgumentException {
        if (registroAcademico < 0) {
            throw new IllegalArgumentException("Registro acadêmico inválido");
        }
        this.registroAcademico = registroAcademico;
    }
    
    public double tarifaEstudante() {
        return getTarifa() * 0.5;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValor da tarifa com desconto para estudante R$ " + tarifaEstudante() + 
               "\nRegistro acadêmico: " + getRegistroAcademico();
    }
}