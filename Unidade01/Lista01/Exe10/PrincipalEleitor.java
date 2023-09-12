//Desenvolver uma classe chamada Eleitor com os atributos: nome e idade. Implementar os métodos: Método Descrição 
//verificar(): Este método retoma uma String e não recebe parâmetro. Deve exibir na tela mensagens de acordo com as seguintes condições: 
//- caso a idade seja inferior a 16 anos, exibir na tela “Eleitor não pode votar” 
//- para idade superior ou igual a 16 anos e inferior ou igual a 65, exibir na tela “Eleitor deve votar” 
//- para idade superior a 65 anos, exibir a tela “Voto facultativo”. 
//imprimir(): Este método retorna uma String e deverá executar o método verificar() como último comando 
//Desenvolver uma classe Principal. Nesta classe, deve-se criar um objeto da classe Eleitor usando o comando: Eleitor umEleitor = new Eleitor() 
//e, para cada atributo da classe atribuir um valor. Executar o método imprimir() e analisar os valores exibidos na tela.
package Unidade01.Lista01.Exe10;
public class PrincipalEleitor {

    public static void main(String[] args) {
            
        //criando objetos do tipo Eleitor
        Eleitor umEleitor = new Eleitor("Maria Antonieta", 15);
        Eleitor outroEleitor = new Eleitor("Letícia", 18);
        Eleitor ultimoEleitor = new Eleitor("Pedro", 85);

        //chamando o método imprimir() para printar a resposta referente a cada eleitor cadastrado
        System.out.println(umEleitor.imprimir());
        System.out.println(outroEleitor.imprimir());
        System.out.println(ultimoEleitor.imprimir());
    }
}