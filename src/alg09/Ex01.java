package alg09;

import java.util.Scanner;

public class Ex01 {

    public static void somaA(Scanner sc) {

        int i = 0;
        int a, b;
        int r;

        while (i < 20) {
            System.out.println("While");

            System.out.print("Digite o valor de A: ");
            a = sc.nextInt();
        
            System.out.print("Digite o valor de B: ");
            b = sc.nextInt();
        
            r = a + b;
            System.out.println("Resultado da soma: " + r + "\n");
            i++;
        }
    }
    
    public static void somaB(Scanner sc) {
        
        int i = 0;
        int a, b, r;
        
        do {
            System.out.println("Do while");

            System.out.print("Digite o valor de A: ");
            a = sc.nextInt();
        
            System.out.print("Digite o valor de B: ");
            b = sc.nextInt();
        
            r = a + b;
            System.out.println("Resultado da soma: " + r + "\n");
            i++;
        } while (i < 20);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            somaA(sc);
            somaB(sc);

            System.out.println("Deseja continuar? (1-Sim/2-Nao) ");
            opcao = sc.nextInt();
        } while (opcao != 2);

        sc.close();
    }
}
