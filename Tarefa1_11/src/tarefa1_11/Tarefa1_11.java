
package tarefa1_11;

import java.util.Scanner;


public class Tarefa1_11 {

 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c =0;
        System.out.println("Insira o tamanho dos lados para um triangulo:");
        System.out.println("Tamanho do lado A:");
        a = in.nextInt();
        System.out.println("Tamanho do lado B:");
        b = in.nextInt();
        System.out.println("Tamanho do lado C:");
        c = in.nextInt();
        
        if (a+b < c || a+c < b || b+c<a ){
            System.out.println("Nao e possivel formar um triangulo");
        
        }else if (a == b && b==c){
            System.out.println("Triangulo equilatero");
        
        }else if (a  == b || a == c || b == c){
            System.out.println("Triangulo isosceles");        
        }else{
            System.out.println("Triangulo escaleno"); 
        }
        
    }
    
}
