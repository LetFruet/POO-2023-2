package Unidade02.Lista05.Exe01;

public class AlunoPos extends Aluno {
    
    private int pontosPoscomp;

    public AlunoPos(String nome, String curso, int pontosPoscomp) {
        super(nome, curso);
        setPontosPoscomp(pontosPoscomp);
    }

    public int getPontosPoscomp() {
        return pontosPoscomp;
    }

    public void setPontosPoscomp(int pontosPoscomp) throws IllegalArgumentException {
        if(pontosPoscomp < 0){
            throw new IllegalArgumentException("Pontos inválidos");
        }
        this.pontosPoscomp = pontosPoscomp;
    }

    @Override
    public String exibirDados(){
        return super.toString() + "\nPontos: " + this.getPontosPoscomp();
    }
}