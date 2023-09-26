package Unidade02.Lista01.Exe02;
public class Computador {

    private int numeroSerial;
    private int capaciadeHD;
    private int memoria;

    public Computador(int numeroSerial, int capaciadeHD, int memoria) {
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

    public int getCapaciadeHD() {
        return capaciadeHD;
    }

    public void setCapaciadeHD(int capaciadeHD) {
        this.capaciadeHD = capaciadeHD;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    } 

    public String toString() {
        return "\nNúmero serial: " + this.getNumeroSerial() +
               " | Capacidade do HD: " + this.getCapaciadeHD() + " | Quantidade de memória: " + this.getMemoria();
    }
}
