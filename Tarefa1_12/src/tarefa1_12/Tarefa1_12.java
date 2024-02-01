package tarefa1_12;

import java.util.Scanner;

public class Tarefa1_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num;
        System.out.println("Insira um numero inteiro ate 10 digitos: ");
        num = in.nextLong();
        String numStr = Long.toString(num); 

        if (num >= 0 && num <= 9999999999L) {
            int digito = numStr.length(); 
            System.out.println("O numero possui " + digito + " digitos.");
        } else {
            System.out.println("Numero invalido. Certifique-se de que o numero tem menos de 10 digitos.");
        } 
        in.close();
    }
}
