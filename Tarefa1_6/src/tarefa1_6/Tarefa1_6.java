package tarefa1_6;

import java.util.Scanner;

public class Tarefa1_6 {

    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);
              
        
        int x = 0,y = 0,z = 0;
        float media;
        System.out.println("Insira 3 valores inteiros:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        media = (float)( x + y + z )/3;
       System.out.println( media); 
       
    }
}

