import java.util.Locale;
import java.util.Scanner;

public class Unidade2E6 {
    public static void main(String[] args) {
        /*
       Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
       Em seguida, calcule e mostre:
       a) a área do triângulo retângulo que tem A por base e C por altura.
       b) a área do círculo de raio C. (pi = 3.14159)
       c) a área do trapézio que tem A e B por bases e C por altura.
       d) a área do quadrado que tem lado B.
       e) a área do retângulo que tem lados A e B.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float valorA, valorB, valorC, areaTrinagulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        final float VALOR_PI = 3.14159f;

        System.out.print("Informe o valor de A: ");
        valorA = sc.nextFloat();
        System.out.print("Informe o valor de B: ");
        valorB = sc.nextFloat();
        System.out.print("Informe o valor de C: ");
        valorC = sc.nextFloat();

        areaTrinagulo = valorA * valorC / 2;
        areaCirculo = VALOR_PI * (valorC * valorC);
        areaTrapezio = ((valorA + valorB) / 2) * valorC;
        areaQuadrado = valorB * valorB;
        areaRetangulo = valorA * valorB;

        System.out.printf("TRIANGULO:  = %.3f \n", areaTrinagulo);
        System.out.printf("CIRCULO:  = %.3f \n", areaCirculo);
        System.out.printf("TRAPEZIO:  = %.3f \n", areaTrapezio);
        System.out.printf("QUADRADO:  = %.3f \n", areaQuadrado);
        System.out.printf("RETANGULO:  = %.3f \n", areaRetangulo);
        sc.close();
    }
}