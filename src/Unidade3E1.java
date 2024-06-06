import java.util.Scanner;

public class Unidade3E1 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
         */
        Scanner sc = new Scanner(System.in);

        int numero;
        String resultado;

        System.out.print("Informe um número: ");
        numero = sc.nextInt();
        if (numero >= 0) resultado = "NAO NEGATIVO";
        else resultado = "NEGATIVO";

        System.out.println(resultado);
        sc.close();
    }
}
