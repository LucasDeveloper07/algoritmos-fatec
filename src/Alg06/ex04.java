package Alg06;

import java.util.Scanner;

public class ex04 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int velocidadeMax, velocidadeVeiculo;
        int excesso = 0;
        double multa;

        System.out.println("Digite a velocidade máxima da via: ");
        velocidadeMax = sc.nextInt();
        
        System.out.println("Digite a velocidade que o carro estava percorrendo: ");
        velocidadeVeiculo = sc.nextInt();

        if (velocidadeVeiculo > velocidadeMax) {
            excesso = velocidadeVeiculo - velocidadeMax;

            if (excesso <= 10) {
                multa = 50.0;
            }
            else if (excesso <= 30) {
                multa = 100.0;
            }
            else {
                multa = 200.0;
            }

            System.out.printf("Você ultrapassou o limite de velocidade!\nO valor da multa é de R$%.2f", multa);
        }
        else {
            System.out.println("O veículo está dentro do limite de velocidade!");
        }

        sc.close();
    }
}

