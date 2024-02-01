package tarefa1_9;
import java.util.Scanner;
 

public class Tarefa1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário para inserir um número inteiro entre 1 e 7
        System.out.println("Insira um numero inteiro entre 1 e 7:");
        int dia = scanner.nextInt();
        // Imprime o nome do dia da semana correspondente ao número inserido
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terca-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sabado");
            default -> System.out.println("Numero invalido. Por favor, insira um numero entre 1 e 7.");
        }
    }
}