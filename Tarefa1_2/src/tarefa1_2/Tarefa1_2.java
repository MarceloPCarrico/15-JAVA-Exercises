package tarefa1_2;

import java.util.Scanner;

public class Tarefa1_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b, y, resultado;

        System.out.println("Qual operacao deseja realizar?");
        System.out.println(" 1- Soma \n 2- Subtracao \n 3- Divisao \n 4- Multiplicacao \n 5-Resto \n 6- SAIR");

        
        y = in.nextInt(); 

        switch (y) {
            case 1:
                System.out.println("Insira o 1o valor:");
                a = in.nextInt();
                System.out.println("Insira o 2o valor:");
                b = in.nextInt();
                resultado = a + b ;
                System.out.println("Resultado da Soma: " + resultado);
                break;
            case 2:
                System.out.println("Insira o 1o valor:");
                a = in.nextInt();
                System.out.println("Insira o 2o valor:");
                b = in.nextInt();
                resultado = a - b ;
                System.out.println("Resultado da subtracao: " + resultado);                
                break;
            case 3:
                System.out.println("Insira o 1o valor:");
                a = in.nextInt();
                System.out.println("Insira o 2o valor:");
                b = in.nextInt();                
                if (b != 0) {                         
                        System.out.println("Resultado da divisao: " + String.format("%.2f", (float) a / b));
                    } else {
                        System.out.println("Não e possivel dividir por zero.");
                       }               
                break;
            case 4:
                System.out.println("Insira o 1o valor:");
                a = in.nextInt();
                System.out.println("Insira o 2o valor:");
                b = in.nextInt();
                resultado = a * b ;
                System.out.println("Resultado da multiplicacao: " + resultado);                
                break;
            case 5:               
                System.out.println("Insira o 1o valor:");
                a = in.nextInt();
                System.out.println("Insira o 2o valor:");
                b = in.nextInt();
                resultado = a % b ;
                System.out.println("Resto entre os valores: " + resultado);                
                break;
            case 6:            
                              
                break;
                
            default:
                System.out.println("Opcao invalida.");
        }
        
        
        in.close();
    }
}
