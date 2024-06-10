import java.util.Scanner;

public class Unidade5E5 {
    public static void main(String[] args) {
        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item
        e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
        */
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double conta = 0;
        double valor1 = 4.00;
        double valor2 = 4.50;
        double valor3 = 5.00;
        double valor4 = 2.00;
        double valor5 = 1.50;

        System.out.print("Informe o código do item: ");
        codigo = sc.nextInt();
        System.out.print("Informe a quantidade do item: ");
        quantidade = sc.nextInt();

        conta = switch (codigo) {
            case 1 -> (quantidade * valor1);
            case 2 -> (quantidade * valor2);
            case 3 -> (quantidade * valor3);
            case 4 -> (quantidade * valor4);
            case 5 -> (quantidade * valor5);
            default -> conta;
        };

        System.out.printf("Total: R$ %.2f", conta);
        sc.close();
    }
}
