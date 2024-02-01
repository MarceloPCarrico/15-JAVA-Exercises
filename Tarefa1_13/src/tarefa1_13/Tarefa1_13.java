
package tarefa1_13;

import java.util.Scanner;

public class Tarefa1_13 {

 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Insira um numero:");
        num = in.nextInt();
        
        for (int i = 1 ; i <= num ; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
        
    }
    
}
