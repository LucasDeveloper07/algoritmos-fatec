package alg11;

import java.util.Scanner;

public class Ex01 {

    public static void temperatura(Scanner sc) {

        double[][] temp = new double[10][3];
        int opcao;

        for (int i = 0; i < temp.length; i++) {
            System.out.print("Digite a temperatura maxima do dia " + (i + 1) + ": ");
            temp[i][0] = sc.nextInt();
            
            System.out.print("Digite a temperatura minima do dia " + (i + 1) + ": ");
            temp[i][1] = sc.nextInt();

            temp[i][2] = (temp[i][0] + temp[i][1]) / 2;
        }

        do {
            System.out.println("\n======MENU======");
            System.out.println("1 - Temperatura minima de todos os dias");
            System.out.println("2 - Temperatura maxima de todos os dias");
            System.out.println("3 - Maior variaçao de todos os dias");
            System.out.println("4 - Sair do programa");

            System.out.print("Escolha a opçao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nTemperatura minima:");
                    
                    for (int i = 0; i < temp.length; i++) {
                        System.out.println("Dia " + (i + 1) + ": " + temp[i][1]);
                    }
                    break;
                case 2:
                    System.out.println("\nTemperatura maxima:");
                    
                    for (int i = 0; i < temp.length; i++) {
                        System.out.println("Dia " + (i + 1) + ": " + temp[i][0]);
                    }
                    break;
                case 3:
                    System.out.println("\nMaior variaçao:");

                    for (int i = 0; i < temp.length; i++) {
                        System.out.println("Dia " + (i + 1) + ": " + (temp[i][0] - temp[i][1]));
                    }
                    break;
                case 4:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opçao invalida!");
                    break;
            }
        } while (opcao != 4);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        temperatura(sc);

        sc.close();
    }
}
