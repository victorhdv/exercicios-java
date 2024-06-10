import java.util.Scanner;

public class Unidade4E2 {
    public static void main(String[] args) {
        /*
       Faça um programa para ler o valor do raio de um círculo,
       e depois mostrar o valor da área deste círculo com quatro
       casas decimais conforme exemplos.
       Fórmula da área: area = π * raio^2
       Considere o valor de π = 3.14159
        */

        System.out.print("Informe o raio do círculo: ");
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        final double VALOR_PI = 3.14159;
        var areaCirculo = VALOR_PI * (raio * raio);
        System.out.printf("A = %.4f", areaCirculo);
        sc.close();

    }
}