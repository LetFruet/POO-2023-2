//Modifique a classe Retangulo para que esta contenha um método calculaIntersecção, que recebe como argumento uma outra instância 
//da própria classe Retangulo e calcule um retângulo que é a intersecção do retângulo encapsulado passado como argumento, retornando uma nova 
//instância da classe Retangulo correspondente à intersecção. Dicas: Os pontos do retângulo-intersecção podem ser calculados com regras simples, 
//implementadas através de ifs encadeados. Nem sempre existe intersecção entre dois retângulos. Caso não exista intersecção, o método retorna null.
package Unidade01.Lista01.Exe09;
public class PrincipalRetanguloModificado {
    public static void main(String[] args) {

        //definindo os pontos p1 e p2
        RetanguloModificado p1 = new RetanguloModificado(1, 1, 10, 10);
        RetanguloModificado p2 = new RetanguloModificado(0, 0, 8, 8);

        //chamando o método para calcular a intersecção
        RetanguloModificado possuiIntersecao = p1.calcularInterseccao(p2);

        // Verifica se há interseção e imprimindo o resultado
        //caso o retorno não seja vazio, o print mostra qual parte dos retângulos está intersectada
        if (possuiIntersecao != null) {
            System.out.println("A interseção entre os retângulos é: (" + p1.calcularInterseccao(p2).getX1() + ", " + p1.calcularInterseccao(p2).getY1() + 
                               ") e (" + p1.calcularInterseccao(p2).getX2() + ", " + p1.calcularInterseccao(p2).getY2() + ")");
        } else {
            System.out.println("Não há interseção entre os retângulos.");
        }
    }
}
