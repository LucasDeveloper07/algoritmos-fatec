package alg08;

import java.util.Scanner;
 
public class Ex01 {
   
    static Scanner sc = new Scanner(System.in);
 
    public static void calc() {
 
        int num;
        int contNum = 0;
        int numMaior = 0;
        int numMenor = 0;
        double soma = 0;
        double media;
 
        do {
            System.out.print("Digite um numero (Digite 0 quando quiser encerrar o loop): ");
            num = sc.nextInt();
 
            if (contNum == 0) {
                numMaior = num;
                numMenor = num;
            } else if (num > numMaior && num != 0) {
                numMaior = num;
            } else if (num < numMenor && num != 0) {
                numMenor = num;
            }

            soma += num;
 
            if (num != 0) {
                contNum++;
            }
        } while (num != 0);
 
        media = soma / contNum;
       
        System.out.println("Numero maior: " + numMaior);
        System.out.println("Numero menor: " + numMenor);
        System.out.printf("Media: %.2f\n", media);
 
    }
    public static void main(String[] args) {
 
        int continua;
 
        do {
            calc();
            System.out.println("Deseja continuar? 1-Sim/2-Nao");
            continua = sc.nextInt();
        } while (continua != 2);
 
        sc.close();
    }
}