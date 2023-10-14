package Unidade02.Lista04.Exe11;
import java.util.ArrayList;
import java.util.List;
public class Palm {
        
    private List<Cds> listaCds = new ArrayList<>();

    public void adicionarCd(Cds novoCd) {
        listaCds.add(novoCd);
    }

    @Override
    public String toString() {
        
        return "Lista de cds: \n" + listaCds;
    }
}
