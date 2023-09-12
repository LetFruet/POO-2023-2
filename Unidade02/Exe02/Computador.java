package Unidade02.Exe02;

public class Computador {

    private int numeroSerial;
    private double capaciadeHD;
    private double memoria;

    public Computador(int numeroSerial, double capaciadeHD, double memoria) {
        setNumeroSerial(numeroSerial);
        setCapaciadeHD(capaciadeHD);
        setMemoria(memoria);
    }

    public int getNumeroSerial() {
        return numeroSerial;
    }

    public void setNumeroSerial(int numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    public double getCapaciadeHD() {
        return capaciadeHD;
    }

    public void setCapaciadeHD(double capaciadeHD) {
        this.capaciadeHD = capaciadeHD;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    } 

    public String toString() {
        return "\nNúmero serial: " + this.getNumeroSerial() +
               " | Capacidade do HD: " + this.getCapaciadeHD() + " | Quantidade de memória: " + this.getMemoria();
    }
}
