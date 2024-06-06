import java.util.Scanner;

public class Unidade3E2 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
         */
        Scanner sc = new Scanner(System.in);

        int numero;
        String resultado;

        System.out.print("Informe um número: ");
        numero = sc.nextInt();
        if (numero % 2 != 0) resultado = "IMPAR";
        else resultado = "PAR";

        System.out.println(resultado);
        sc.close();
    }
}
