import java.util.Locale;
import java.util.Scanner;

public class Unidade3E7 {
    public static void main(String[] args) {
        /*
        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        Se o ponto estiver na origem, escreva a mensagem “Origem”.
        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
        situação.
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valorX, valorY;

        System.out.print("Informe o valor do eixo x: ");
        valorX = sc.nextDouble();
        System.out.print("Informe o valor do eixo y: ");
        valorY = sc.nextDouble();

        if (valorX > 0 && valorY > 0) {
            System.out.println("Q1");
        } else if (valorX < 0 && valorY > 0) {
            System.out.println("Q2");
        } else if (valorX > 0 && valorY < 0) {
            System.out.println("Q4");
        } else if (valorX < 0 && valorY < 0) {
            System.out.println("Q3");
        } else if (valorX == 0 && valorY != 0) {
            System.out.println("EIXO X");
        } else if (valorX != 0) {
            System.out.println("EIXO Y");
        } else {
            System.out.println("ORIGEM");
        }

        sc.close();
    }
}
