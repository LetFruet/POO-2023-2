//Crie uma classe Lutador que contenha os seguintes atributos: Nome e Peso. A classe deve também possuir métodos para modificar e acessar cada 
//um dos atributos, construtores, um método para definir a categoria do lutador e um método imprimir() que fornece o nome do lutador e a descrição 
//de sua categoria, conforme tabela abaixo: Lutador 
//Faixa de Peso || Categoria 
//até 54kg || Pluma 
//acima de 54, até 60 || Leve 
//acima de 60, até 75 || Meio-leve 
//acima de 75 || Pesado 
//Crie um programa principal para testar a classe Lutador. 
package Unidade01.Lista01.Exe11;
public class PrincipalLutador {

    public static void main(String[] args) {
       
        // ----- instanciando (criar uma instância concreta, um objecto de determinada classe) um objeto do tipo Lutador
        // ----- populando o objeto um Lutador (informações de nome e peso)
        //umLutador.setNome("João");
        //umLutador.setPeso(75.3f); 

        // > OU <
              
        //criando um objeto do tipo Lutador
        Lutador umLutador = new Lutador("João",75.3f);// f para converter p float 

        //-----------------------------------------------

        // ----- get para imprimir 
        //System.out.println(umLutador.getNome());
        //System.out.println(umLutador.verificarCategoria()); OU

        // > OU <

        //chamando o método imprimir() para printar a categiria referente a cada lutador cadastrado
        System.out.println(umLutador.imprimir());
 
    }
}