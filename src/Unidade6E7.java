import java.util.Scanner;

public class Unidade6E7 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro positivo N.
        O programa deve então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
        mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
        */

        Scanner sc = new Scanner(System.in);
        int valor, quadrado = 0, cubo = 0;

        System.out.print("Informe um valor: ");
        valor = sc.nextInt();

        for (int i = 1; i <= valor; i++) {
            quadrado = i * i;
            cubo = quadrado * i;
            System.out.println(i + " " + quadrado + " " + cubo);
        }

        sc.close();
    }
}
