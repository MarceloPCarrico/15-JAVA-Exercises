package tarefa1_5;

import java.util.Scanner;

public class Tarefa1_5 {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário para inserir um número inteiro
        System.out.println("Insira um numero inteiro:");
        int num = scanner.nextInt();
        int soma = 0;
        // Calcula a soma dos dígitos do número
        while (num != 0) {
            soma += num % 10;
            num /= 10;
        }
        // Imprime a soma dos dígitos
        System.out.println("Soma dos digitos: " + soma);
    }
}


