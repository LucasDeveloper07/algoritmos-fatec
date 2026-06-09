package Alg06;

import java.util.Scanner;

public class ex03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double salario, bonus;
        int tempoEmpresa;

        System.out.println("Digite o seu salário bruto: ");
        salario = sc.nextDouble();

        System.out.println("Digite a quantos anos você trabalha na empresa: ");
        tempoEmpresa = sc.nextInt();

        if (tempoEmpresa >= 5) {
            bonus = (salario * 0.20);
        } 
        else {
            bonus = (salario * 0.10);
        }

        System.out.printf("Parabéns! Você recebeu um bônus de R$%.2f", bonus);

        sc.close();
    }
}
