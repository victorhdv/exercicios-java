import java.util.Locale;
import java.util.Scanner;

public class Unidade6E1 {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha,
        inclusive o X, se for o caso.
        */
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.print("Informe o valor inteiro entre 1 e 1000: ");
        valor = sc.nextInt();

       for (int i = 1; i <= valor; i++) {
           if (i % 2 != 0) {
               System.out.println(i);
           }
       }
        sc.close();
    }
}
