package tarefa1_8;

import java.util.Scanner;

public class Tarefa1_8 {

    public static void main(String[] args) {
        
Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor do primeiro numero:");
        int a = in.nextInt();

        System.out.println("Insira o valor do segundo numero:");
        int b = in.nextInt();

        System.out.println("Insira o valor do terceiro numero:");
        int c = in.nextInt();

        if (a > b && a > c) {
            System.out.println("O maior numero e: " + a);
        } else if (b > a && b > c) {
            System.out.println("O maior numero e: " + b);
        } else if (c > a && c > b) {
            System.out.println("O maior numero e: " + c);
        } else {
            System.out.println("Ha numeros iguais inseridos.");

            
            if (a == b && b == c) {
                System.out.println("Todos os numeros sao iguais.");
            } else if (a == b) {
                System.out.println("O primeiro e o segundo numero sao iguais.");
            } else if (a == c) {
                System.out.println("O primeiro e o terceiro numero sao iguais.");
            } else {
                System.out.println("O segundo e o terceiro numero sao iguais.");
            }
        }

        // Fechar o scanner para evitar vazamento de recursos
        in.close();
    }
}