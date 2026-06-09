package alg09;

import java.util.Scanner;

public class Ex07 {
    
    public static void rainha() {

        double graos = 0;
        double casa = 1;

        for (int i = 0; i < 64; i++) {
            graos += casa;
            casa *= 2;
        }

        System.out.printf("Quantidade de graos: %.2fKg\n", graos / 100000);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            rainha();

            System.out.print("Deseja continuar (1-Sim/2-Nao)? ");
            opcao = sc.nextInt();
        } while (opcao != 2);

        sc.close();
    }
}
