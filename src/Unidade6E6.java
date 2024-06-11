import java.util.Locale;
import java.util.Scanner;

public class Unidade6E6 {
    public static void main(String[] args) {
        /*
        Ler um número inteiro N e calcular todos os seus divisores.
        */
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.print("Informe um valor: ");
        valor = sc.nextInt();

        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
