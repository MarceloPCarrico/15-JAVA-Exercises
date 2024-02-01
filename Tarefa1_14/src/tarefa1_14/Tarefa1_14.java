
package tarefa1_14;

import java.util.Scanner;


public class Tarefa1_14 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 3;
        
        while (tentativas > 0) {
            System.out.println("Insira a palavra-chave:");
            int senha = scanner.nextInt();
            
            switch (senha) {
                case 1234:
                    System.out.println("Bem-vindo!");
                    tentativas = 0;
                    break;
                default:
                    --tentativas;
                    if (tentativas > 0) {
                        System.out.println("Palavra-chave incorreta. Voce tem " + tentativas + " tentativas restantes.");
                    } else {
                        System.out.println("Palavra-chave incorreta. Voce não tem mais tentativas.");
                    }
                    break;
            }
        }
    }
}