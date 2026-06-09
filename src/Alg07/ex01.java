package Alg07;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcao;
        double a, b, resultado;

        System.out.println("======CALCULADORA======");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        System.out.print("\nEscolha a opcao desejada: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Informe o valor de A: ");
                a = sc.nextDouble();
                System.out.print("Informe o valor de B: ");
                b = sc.nextDouble();
                
                resultado = a + b;
                System.out.printf("\nO resultado de %.2f + %.2f = %.2f", a, b, resultado);
                break;
            case 2:
                System.out.print("Informe o valor de A: ");
                a = sc.nextDouble();
                System.out.print("Informe o valor de B: ");
                b = sc.nextDouble();
                
                resultado = a - b;
                System.out.printf("\nO resultado de %.2f - %.2f = %.2f", a, b, resultado);
                break;
            case 3:
                System.out.print("Informe o valor de A: ");
                a = sc.nextDouble();
                System.out.print("Informe o valor de B: ");
                b = sc.nextDouble();
                
                resultado = a * b;
                System.out.printf("\nO resultado de %.2f x %.2f = %.2f", a, b, resultado);
                break;
            case 4: 
                System.out.print("Informe o valor de A: ");
                a = sc.nextDouble();
                System.out.print("Informe o valor de B: ");
                b = sc.nextDouble();

                if (b == 0) {
                    System.out.println("\nErro de divisao por zero! Informe um valor válido");
                } else {
                    resultado = a / b;
                    System.out.printf("\nO resultado de %.2f / %.2f = %.2f", a, b, resultado);
                }
                break;
            default:
                System.out.println("\nInforme um numero de operacao valido!");
                break;
        }

        sc.close();
    }
}
