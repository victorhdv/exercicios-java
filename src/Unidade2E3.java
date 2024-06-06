import java.util.Scanner;

public class Unidade2E3 {
    public static void main(String[] args) {
        /*
       Fazer um programa para ler quatro valores inteiros A, B, C e D.
       A seguir, calcule e mostre a diferença do produto de A e B
       pelo produto de C e D segundo a fórmula:
       DIFERENCA = (A * B - C * D).
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor de A: ");
        int valorA = sc.nextInt();
        System.out.print("Informe o valor de B: ");
        int valorB = sc.nextInt();
        System.out.print("Informe o valor de C: ");
        int valorC = sc.nextInt();
        System.out.print("Informe o valor de D: ");
        int valorD = sc.nextInt();
        var diferenca = ((valorA * valorB)-(valorC * valorD));
        System.out.println("Diferenca = "+ diferenca);
        sc.close();

    }
}