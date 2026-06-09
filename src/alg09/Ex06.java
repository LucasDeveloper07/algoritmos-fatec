package alg09;

import java.util.Scanner;

public class Ex06 {
    
    public static void sequenciaPar(Scanner sc) {

        int num;
        int contPar = 0;
        int numPar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero inteiro: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                contPar++;
                if (contPar > numPar) {
                    numPar = contPar;
                }
            } else {
                contPar = 0;
            }
        }

        System.out.println("Você digitou uma sequência com " + numPar + " numeros pares.");
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            sequenciaPar(sc);

            System.out.print("Deseja continuar (1-Sim/2-Nao)? ");
            opcao = sc.nextInt();
        } while (opcao != 2);


        sc.close();
    }
}
