package Unidade02.Lista03.Exe04;
public class Site {

    private String nomeSite;
    private String enderecoIP;
    private boolean status;

    public Site(String nomeSite, String enderecoIP, boolean status) {
        setNomeSite(nomeSite);
        setEnderecoIP(enderecoIP);
        setStatus(status);
    }

    public String getNomeSite() {
        return nomeSite;
    }

    public void setNomeSite(String nomeSite) throws IllegalArgumentException {
        if (nomeSite == null || nomeSite.trim().equals(" ")) {
            throw new IllegalArgumentException();
        }
        this.nomeSite = nomeSite;
    }

    public String getEnderecoIP() {
        return enderecoIP;
    }

    public void setEnderecoIP(String enderecoIP) throws IllegalArgumentException {
        if (enderecoIP == null || enderecoIP.trim().equals(" ")) {
            throw new IllegalArgumentException();
        }        this.enderecoIP = enderecoIP;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
  
    public String toString() {

        String imprimir = "";
        if (!nomeSite.trim().isEmpty()) {
        imprimir += "Site: " + getNomeSite() + "\nIP: " + getEnderecoIP() +"\nAcesso: ";
        }

        if (getStatus()) {
            imprimir += "permitido";
        } else {
            imprimir += "bloqueado";
        }

        return imprimir;
    }
}

