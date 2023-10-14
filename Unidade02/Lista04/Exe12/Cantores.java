package Unidade02.Lista04.Exe12;
import java.util.ArrayList;
import java.util.List;
public class Cantores {
    
    private String cantor;
    public static List<Cantores> listaCantores = new ArrayList<>();

    public Cantores(String cantor) {
        setCantor(cantor);
        listaCantores.add(this);
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) throws IllegalArgumentException {
        if (cantor == null || cantor.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do cantor inválido");
        }
        this.cantor = cantor;
    }

    public static List<Cantores> getListaCantores() {
        return listaCantores;
    }

    public static void setListaCantores(List<Cantores> listaCantores) {
        Cantores.listaCantores = listaCantores;
    }

    @Override
    public String toString() {
        return getCantor();
    }
}
