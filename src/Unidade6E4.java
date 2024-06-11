import java.util.Locale;
import java.util.Scanner;

public class Unidade6E4 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número N. Depois leia N pares de números e mostre
        a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
        mostrar a mensagem "divisao impossivel".
        */
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int valor;

        System.out.print("Informe um valor inteiro: ");
        valor = sc.nextInt();

        var resultados = new String[valor];

        for (int i = 0; i < valor; i++) {
            var aux1 = sc.nextDouble();
            var aux2 = sc.nextDouble();

            if (aux2 == 0) {
                resultados[i] = "divisao impossivel";
            } else {
                resultados[i] = String.valueOf((aux1 / aux2));
            }
        }

        for (int i = 0; i < valor; i++) {
            System.out.println(resultados[i]);
        }

        sc.close();
    }
}
