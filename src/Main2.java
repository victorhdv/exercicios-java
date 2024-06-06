import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar
        na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.

        Exemplos: Entrada:
        10
        30
        Saída:
        SOMA = 40
         */
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       var Soma = a + b;
       System.out.println("Soma = " + Soma);
        sc.close();

    }
}