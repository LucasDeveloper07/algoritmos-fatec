package Alg06;

import java.util.Scanner;

public class ex01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double indicePoluicao;

        System.out.println("Informe o índice de poluição dos grupos de indústrias: ");
        indicePoluicao = sc.nextDouble();

        if (indicePoluicao >= 0.5) {
            System.out.println("Todas as indústrias devem suspender suas atividades!");
        }
        else if (indicePoluicao >= 0.4) {
            System.out.println("O 1° e o 2° grupo de indústrias devem suspender suas atividades!");
        }
        else if (indicePoluicao >= 0.3) {
            System.out.println("O 1° grupo de indústrias deve suspender suas atividades!");
        } else {
            System.out.println("O índice está conforme o aceitável!");
        }

        sc.close();
    }
}
