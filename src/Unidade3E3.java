import java.util.Scanner;

public class Unidade3E3 {
    public static void main(String[] args) {
        /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos"
        ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
        Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
        */
        Scanner sc = new Scanner(System.in);

        int valorA, valorB;
        String resultado;

        System.out.print("Informe o valor de A: ");
        valorA = sc.nextInt();
        System.out.print("Informe o valor de B: ");
        valorB = sc.nextInt();

        if (valorA % valorB == 0 || valorB % valorA == 0) {
            resultado = "Sao Multiplos";
        } else {
            resultado = "Nao sao Multiplos";
        }

        System.out.println(resultado);
        sc.close();
    }
}
