package Unidade02.Lista04.Exe04;
import java.util.HashMap;
public class Seminco {
    
    public static void main(String[] args) {

        //criando um HashMap para armazenar város artigos
        HashMap<String, Artigo> seminco = new HashMap<String, Artigo>();

        //criando um objeto do tipo Artigo
        Artigo umArtigo = new Artigo("A arte de programar", "Henrique");

        //criando um objeto do tipo Revisor e fazendo agregação
        umArtigo.adicionarAvaliacao(new Revisor("Aurélio", "O conteúdo não está correto", "Rejeitado")); 
        umArtigo.adicionarAvaliacao(new Revisor("Dalton", "Muito bom", "Aceito")); 

        //cvinculando o artigo ao HashMap
        seminco.put(umArtigo.getTitulo(), umArtigo);

        //verificando se um objeto com determinada chave se encontra no HashMap
        umArtigo = seminco.get("A arte de codificar");
        if (umArtigo != null) {
            //exibindo as informações do artigo e suas avaliações 
            System.out.println(umArtigo.imprimir());
        } else {
            System.out.println("Artigo não encontrado");
        }
    }
}
