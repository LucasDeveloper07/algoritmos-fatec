package alg09;

import java.util.Scanner;

public class Ex04 {
   
   public static void multiplos(Scanner sc) {

      int num;
      int multiplo3 = 0;
      int multiplo5 = 0;
      int i = 0;

      do {
         System.out.print("Digite um numero inteiro: ");
         num = sc.nextInt();

         if (num % 3 == 0) {
            multiplo3++;
         }
         if (num % 5 == 0) {
            multiplo5++;
         }

         i++;
      } while (i < 10);

      System.out.println("\nQuantidade de multiplos de 3: " + multiplo3);
      System.out.println("Quantidade de multiplos de 5: " + multiplo5);
   }

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      int opcao;

      do {
         multiplos(sc);

         System.out.print("\nDeseja continuar (1-Sim/2-Nao)? ");
         opcao = sc.nextInt();
      } while (opcao != 2);

      sc.close();
   }
}
