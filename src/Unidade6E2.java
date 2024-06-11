import java.util.ArrayList;
import java.util.Scanner;

public class Unidade6E2 {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        */
        Scanner sc = new Scanner(System.in);
        int valor, in = 0, out = 0;

        System.out.print("Informe o valor inteiro entre 1 e 1000: ");
        valor = sc.nextInt();

        for (int i = 1; i <= valor; i++) {
            int aux = sc.nextInt();
            if (aux >= 10 && aux < 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");


        sc.close();
    }
}
