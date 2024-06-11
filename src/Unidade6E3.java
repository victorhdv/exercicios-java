import java.util.Locale;
import java.util.Scanner;

public class Unidade6E3 {
    public static void main(String[] args) {
        /*
        Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
        Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
        Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o
        primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
        */
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int valor;

        System.out.print("Informe um valor inteiro: ");
        valor = sc.nextInt();

        var medias = new double[valor];

        for (int i = 0; i < valor; i++) {
            var aux1 = sc.nextDouble();
            var aux2 = sc.nextDouble();
            var aux3 = sc.nextDouble();

            medias[i] = ((aux1 * 2) + (aux2 * 3) + (aux3 * 5)) / 10;
        }

        for (int i = 0; i < valor; i++) {
            System.out.printf("%.1f", medias[i]);
        }

        sc.close();
    }
}
