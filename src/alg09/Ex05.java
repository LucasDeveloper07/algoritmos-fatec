package alg09;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcao;
        double valor;
        double saldo = 0;

        do {
            System.out.println("======BANCO======");
            System.out.println("1 - Saldo");
            System.out.println("2 - Deposito");
            System.out.println("3 - Saque");

            System.out.print("\nEscolha a opcao desejada (Digite 0 para encerrar): ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo: R$%.2f\n", saldo);
                    break;
                case 2:
                    System.out.print("Informe a quantia para depositar: ");
                    valor = sc.nextDouble();
                    
                    saldo += valor;
                    System.out.printf("Saldo: R$%.2f\n", saldo);
                    break;
                case 3:
                    System.out.print("Informe a quantia que deseja sacar: ");
                    valor = sc.nextDouble();
                    
                    saldo -= valor;
                    System.out.printf("Saldo: R$%.2f\n", saldo);
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
