package tarefa1_7;

import java.util.Scanner;

public class Tarefa1_7 {

    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);
         
       int a,b,c ;
       System.out.println("Insira o valor de a:");
       a = in.nextInt();
       System.out.println("Insira o valor de b:");
       b = in.nextInt();
       c = a;
       a = b;
       b = c;
      
       System.out.println("A = " + a + " B = " + b);       
       
        
   
       
    }
}

