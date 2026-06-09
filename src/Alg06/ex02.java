package Alg06;

import java.util.Scanner;

public class ex02 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade do nadador: ");
        idade = sc.nextInt();

        if (idade <= 4) {
            System.out.println("O nadador ainda não possui a idade necessária para iniciar as atividades de natação");
        }
        else if (idade <= 7) {
            System.out.println("Infantil A");
        }
        else if (idade <= 11) {
            System.out.println("Infantil B");
        }
        else if (idade <= 13) {
            System.out.println("Juvenil A");
        }
        else if (idade <= 17) {
            System.out.println("Juvenil B");
        } 
        else {
            System.out.println("Adulto");
        }

        sc.close();
    }
}
