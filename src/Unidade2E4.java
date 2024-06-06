import java.util.Locale;
import java.util.Scanner;

public class Unidade2E4 {
    public static void main(String[] args) {
        /*
       Fazer um programa que leia o número de um funcionário,
       seu número de horas trabalhadas, o valor que recebe por hora
       e calcula o salário desse funcionário.
       A seguir, mostre o número e o salário do funcionário,
       com duas casas decimais.
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o numero do funcionario: ");
        int numero = sc.nextInt();
        System.out.print("Informe o numero do horas trabalhadas: ");
        int horas = sc.nextInt();
        System.out.print("Informe o valor que recebe por hora: ");
        double valorHora = sc.nextDouble();

        var salario = (horas * valorHora);
        System.out.println("NUMBER = "+ numero);
        System.out.printf("SALARY = %.2f", salario);
        sc.close();
    }
}