package alg09;

import java.util.Scanner;

public class Ex09 {
    
    public static void adivinhe(Scanner sc) {

        int num1, num2;
        int tent = 1;

        System.out.print("Digite um numero: ");
        num1 = sc.nextInt();

        System.out.println("=====ADIVINHE=====");

        do {
            System.out.print("Digite um numero para adivinhar o numero interior: ");
            num2 = sc.nextInt();

            if (num2 > num1) {
                System.out.println("O numero é menor!");
                tent++;
            } else if (num2 < num1) {
                System.out.println("O numero é maior!");
                tent++;
            } else {
                System.out.println("Voce acertou!");
                System.out.println("Total de tentativas: " + tent);
            }
        } while (num2 != num1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            adivinhe(sc);

            System.out.print("\nDeseja continuar (1-Sim/2-Nao)? ");
            opcao = sc.nextInt();
        } while (opcao != 2);

        sc.close();
    }
}
