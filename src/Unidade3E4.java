import java.util.Scanner;

public class Unidade3E4 {
    public static void main(String[] args) {
        /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
        sabendo que o mesmo pode começar em um dia e terminar em outro,
        tendo uma duração mínima de 1 hora e máxima de 24 horas.
        */
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.print("Informe o valor da hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Informe o valor da hora final: ");
        horaFinal = sc.nextInt();

        if (horaFinal < horaInicial) {
            duracao = horaFinal + 24 - horaInicial;
        } else {
            duracao = horaFinal - horaInicial;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        sc.close();
    }
}
