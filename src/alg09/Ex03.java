package alg09;

import java.util.Scanner;

public class Ex03 {
   
   public static void media(Scanner sc) {

      int num;
      int i = 0;
      double media = 0;

      do {
         System.out.print("Digite um numero (Digite 0 para encerrar o loop): ");
         num = sc.nextInt();

         media += num;
         
         if (num != 0) {
            i++;
         }
      } while (num != 0);

      media = media / i;

      System.out.printf("Media dos numeros digitados: %.2f\n\n", media);
   }
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int opcao;

      do {
         media(sc);

         System.out.print("Deseja continuar? 1-Sim/2-Nao ");
         opcao = sc.nextInt();
      } while (opcao != 2);

      sc.close();
   }
}
