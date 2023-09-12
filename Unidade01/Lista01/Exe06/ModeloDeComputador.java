package Unidade01.Lista01.Exe06;
public class ModeloDeComputador {

    //definindo os atributos 
    private double placaMae;
    private double processador;
    private double memoria;
    private double disco;
    private double monitor;

    //encapsulando os métodos acessores e modificadores dos atributos (get e set)
    public ModeloDeComputador(double placaMae, double processador, double memoria, double disco, double monitor) {
        setProcessador(processador);
        setMemoria(memoria);
        setDisco(disco);
        setMonitor(monitor);
    }
    
    //getters e setters
    public void setPlacaMae(double placaMae) {
        this.placaMae = placaMae;
    }
    public double getPlacaMae(){
        return this.placaMae;
    }
    public void setProcessador(double processador) {
        this.processador = processador;
    }
    public double getProcessador(){
        return this.processador;
    }
    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }
    public double getMemoria(){
        return this.memoria;
    }
    public void setDisco(double disco) {
        this.disco = disco;
    }
    public double getDisco(){
        return this.disco;
    }    
    public void setMonitor(double monitor) {
        this.monitor = monitor;
    }
    public double getMonitor(){
        return this.memoria;
    }

    //realizando o caálculo do valor final do computador escolhido
    public double calcularValor(){
        
        double valorFinal = placaMae + processador + memoria + disco + monitor;

        return valorFinal;
    }

    //chamando o método calcularValor() para imprimir a resposta 
    public double imprimir() {
        return calcularValor();
    }
}