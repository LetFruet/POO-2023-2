package Prova03Parte01.Parte01;

import java.time.LocalDate;

public class Audiencia {
    
    private LocalDate dataAudiencia;
    private String recomendacaoTribunal;
    private Tribunal umTribunal;

    public Audiencia(LocalDate dataAudiencia, String recomendacaoTribunal, Tribunal umTribunal) {
        setDataAudiencia(dataAudiencia);
        setRecomendacaoTribunal(recomendacaoTribunal);
        setUmTribunal(umTribunal);
    }

    public LocalDate getDataAudiencia() {
        return dataAudiencia;
    }

    public void setDataAudiencia(LocalDate dataAudiencia) throws IllegalArgumentException {
        if (dataAudiencia == null || dataAudiencia.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data da audiência inválida");
        }
        this.dataAudiencia = dataAudiencia;
    }

    public String getRecomendacaoTribunal() {
        return recomendacaoTribunal;
    }

    public void setRecomendacaoTribunal(String recomendacaoTribunal) throws IllegalArgumentException {
        if (recomendacaoTribunal == null || recomendacaoTribunal.trim().isEmpty()) {
            throw new IllegalArgumentException("Recomendação do tribunal inválida");
        }
        this.recomendacaoTribunal = recomendacaoTribunal;
    }

    public Tribunal getUmTribunal() {
        return umTribunal;
    }

    public void setUmTribunal(Tribunal umTribunal) throws IllegalArgumentException {
        if (umTribunal == null) {
            throw new IllegalArgumentException("Tribunal inválido");
        }
        this.umTribunal = umTribunal;
    }    
}