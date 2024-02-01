package tarefa1_15;

import java.util.Scanner;

public class Tarefa1_15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;

        System.out.println("Insira o numero de linhas para o triangulo desejado (entre 0 a 9)");
        a = in.nextInt();

        if (a >= 0 && a <= 9) {
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Numero de linhas excedido!!");
        }
    }
}
