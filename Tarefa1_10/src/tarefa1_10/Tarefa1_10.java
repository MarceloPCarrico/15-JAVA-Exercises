package tarefa1_10;

import java.util.Scanner;

public class Tarefa1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário para inserir um número inteiro entre 1 e 12
        System.out.println("Que mes pretende conferir?");
        int escolha = scanner.nextInt();
        System.out.println("Que ano pretende conferir?");
        int ano = scanner.nextInt();

        String mes = "";  
        int dmes = 0;     

        
        switch (escolha) {
            case 1:
                mes = "Janeiro";
                dmes = 31;
                break;
            case 2:
                mes = "Fevereiro";
                if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                    dmes = 29;  
                } else {
                    dmes = 28;  
                }
                break;
            case 3:
                mes = "Março";
                dmes = 31;
                break;
            case 4:
                mes = "Abril";
                dmes = 30;
                break;
            case 5:
                mes = "Maio";
                dmes = 31;
                break;
            case 6:
                mes = "Junho";
                dmes = 30;
                break;
            case 7:
                mes = "Julho";
                dmes = 31;
                break;
            case 8:
                mes = "Agosto";
                dmes = 31;
                break;
            case 9:
                mes = "Setembro";
                dmes = 30;
                break;
            case 10:
                mes = "Outubro";
                dmes = 31;
                break;
            case 11:
                mes = "Novembro";
                dmes = 30;
                break;
            case 12:
                mes = "Dezembro";
                dmes = 31;
                break;
            default:
                System.out.println("Numero invalido. Por favor, insira um numero entre 1 e 12.");
                return;  
        }

        
        System.out.println("Mes: " + mes + " Ano: " + ano + " Dias no mes: " + dmes);
    }
}
