import java.util.Locale;
import java.util.Scanner;

public class Unidade5E8 {
    public static void main(String[] args) {
        /*
        Em um país imaginário denominado Lisarb, a moeda deste país é o Rombus, cujo símbolo é o R$.
        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb.
        Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda,
        segundo a tabela abaixo.
        Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00,
        pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.
        No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00,
        o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario, impostoTotal = 0, imposto8 = 0, imposto18 = 0, imposto28 = 0;

        System.out.print("Informe o salario: ");
        salario = sc.nextDouble();

        imposto8 = (salario - 2000) * 0.08;
        imposto18 = ((salario - 3000) * 0.18) + (1000 * 0.08);
        imposto28 = ((salario - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);

        if (salario > 0 && salario <= 2000) {
            impostoTotal = 0;
        } else if (salario > 2000 && salario <= 3000) {
            impostoTotal = imposto8;
        } else if (salario > 3000 && salario <= 4500) {
            impostoTotal = imposto18;
        } else if (salario > 4500) {
            impostoTotal = imposto28;
        }

        if (impostoTotal == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("Total: R$ %.2f", impostoTotal);

        }
        sc.close();
    }
}
