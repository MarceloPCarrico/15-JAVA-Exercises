package tarefa1_4;

import java.util.Scanner;

public class Tarefa1_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        double raio = in.nextDouble();

        // Calcula a área do círculo 
        double area = 3.14 * raio * raio;

        // Calcular o perímetro  do círculo
        double perimetro = 2 * 3.14 * raio;

        // Imprimir os resultados
        System.out.println("Area do circulo: " + area);
        System.out.println("Perimetro do circulo: " + perimetro);

        // Fechar o scanner para evitar vazamento de recursos
        in.close();
    }
}
