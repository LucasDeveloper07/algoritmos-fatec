package alg09;

import java.util.Scanner;

public class Ex02 {
   
   public static void repFor() {
      for (int i = 10; i > 0; i--) {
            System.out.println("Resultado = " + i);
        }
   }

   public static void repDoWhile() {

      int x = 10;

      do {
         System.out.println("Resultado = " + x);
         x--;
      } while (x > 0);
   }

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      int opcao;

      do {
         repFor();
         repDoWhile();

         System.out.print("Deseja continuar (1-Sim/2-Nao)? ");
         opcao = sc.nextInt();
      } while (opcao != 2);

      sc.close();
   }
}
