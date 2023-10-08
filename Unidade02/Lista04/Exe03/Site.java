/*O objetivo desta questão é implementar um controle de acesso a sites. Para isto crie duas classes: Site e DicionarioDeIP. 

Na classe Site faça o seguinte: 
a) Crie três atributos privados: nome do site (String), endereço IP do site (String), status do site (acesso livre ou bloqueado) (boolean) 
b) Sobrescreva o método toString() da classe Object para gerar uma String com os três atributos da classe. 

Na classe DicionarioDeIP faça o seguinte: 
a) Crie vários objetos da classe Site (Nome, endereço IP e status de acesso) 
b) Crie um objeto tipo HashMap que armazenará objetos do tipo Site, onde a chave corresponde ao nome do site 
c) Dentro do main (DicionarioDeIP) crie um método chamado inserirSite que recebe como parâmetro um objeto da 
classe Site e o objeto HashMap. Dentro deste método insira o par [Nome do site] – [Site] no HashMap 
d) Dentro do main (DicionarioDeIP) crie um método chamado acessarSite que recebe como parâmetro uma String com 
o [Nome do site] e o objeto HashMap. Se o status do site estiver definido como acesso livre, retorne o objeto Site, 
mostrando as informações [nome e endereço IP do site] ao usuário. Agora se o status do site estiver definido como 
bloqueado, retorne uma mensagem de erro, informando ao usuário sobre a indisponibilidade de uso do site (site bloqueado) 
e) Dentro do main (DicionarioDeIP) faça um método que imprima na tela o Nome, endereço IP e status do site armazenadas no HashMap.  */
package Unidade02.Lista04.Exe03;
public class Site {

    private String nomeSite, enderecoIP;
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
            throw new IllegalArgumentException("Nome do site inválido");
        }
        this.nomeSite = nomeSite;
    }

    public String getEnderecoIP() {
        return enderecoIP;
    }

    public void setEnderecoIP(String enderecoIP) throws IllegalArgumentException {
        if (enderecoIP == null || enderecoIP.trim().equals(" ")) {
            throw new IllegalArgumentException("Endereço de IP inválido");
        }        this.enderecoIP = enderecoIP;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
  
    @Override
    public String toString() {

        String imprimir = "Site: " + getNomeSite() + "\tIP: " + getEnderecoIP() + "\tAcesso: ";

        if (getStatus()) {
            imprimir += "permitido";
        } else {
            imprimir += "bloqueado";
        }

        return imprimir;
    }
}

