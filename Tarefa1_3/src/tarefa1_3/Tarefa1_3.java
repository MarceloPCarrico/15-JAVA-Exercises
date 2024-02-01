
package tarefa1_3;

import java.util.Scanner;

public class Tarefa1_3 {

   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Qual a tabuada que quer calcular?");
        int x ;
        x = in.nextInt();
        
        for (int i = 1; i <= 10; i++){
            System.out.println( x + " X " + i + " = " + (x * i));
        }
        
    }
    
}
