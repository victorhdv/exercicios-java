import java.util.Locale;
import java.util.Scanner;

public class Unidade2E5 {
    public static void main(String[] args) {
        /*
       Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
       o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
       Calcule e mostre o valor a ser pago
        */
        int codigo1, quantPeca1, quantPeca2, codigo2;
        double valor1, valor2, soma;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o código da peça 1: ");
        codigo1 = sc.nextInt();
        System.out.print("Informe o número de peças 1: ");
        quantPeca1 = sc.nextInt();
        System.out.print("Informe o valor unitário de cada peça 1: ");
        valor1 = sc.nextDouble();
        System.out.print("Informe o código da peça 2: ");
        codigo2 = sc.nextInt();
        System.out.print("Informe o número de peças 2: ");
        quantPeca2 = sc.nextInt();
        System.out.print("Informe o valor unitário de cada peça 2: ");
        valor2 = sc.nextDouble();

        soma = (quantPeca1*valor1)+(quantPeca2*valor2);

        System.out.printf("VALOR A PAGAR = %.2f ", soma);
        sc.close();
    }
}