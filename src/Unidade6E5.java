import java.util.Locale;
import java.util.Scanner;

public class Unidade6E5 {
    public static void main(String[] args) {
        /*
        Ler um valor N. Calcular e escrever seu respectivo fatorial.
        Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        Lembrando que, por definição, fatorial de 0 é 1.
        */
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int valor;

        System.out.print("Informe um valor: ");
        valor = sc.nextInt();
        var fatorial = valor;

        for (int i = valor-1; i > 0; i--) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
