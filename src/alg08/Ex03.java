package alg08;

import java.util.Scanner;

public class Ex03 {
    public static void Tabuada(Scanner sc) {

        int numTab;

        System.out.print("Digite um numero inteiro que deseja calcular a tabuada: ");
        numTab = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numTab, i, (numTab * i));
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            Tabuada(sc);

            System.out.println("\nDeseja continuar? 1-Sim/2-Nao");
            opcao = sc.nextInt();
        } while (opcao != 2);

        sc.close();
    }
}
