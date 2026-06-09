package alg11;

import java.util.Scanner;

public class Ex02 {

    public static void triangulo(Scanner sc) {

        int[][] triang = new int[10][3];
        int contIso = 0;
        int contEqui = 0;
        int contEsc = 0;

        for (int i = 0; i < triang.length; i++) {
            System.out.println("Triangulo " + (i + 1) + ":");
            System.out.print("Digite A: ");
            triang[i][0] = sc.nextInt();

            System.out.print("Digite B: ");
            triang[i][1] = sc.nextInt();

            System.out.print("Digite C: ");
            triang[i][2] = sc.nextInt();

            if (triang[i][0] == triang[i][1] && triang[i][0] == triang[i][2] ) {
                contEqui++;
            } else if (triang[i][0] == triang[i][1] || triang[i][0] == triang[i][2] || triang[i][1] == triang[i][2]) {
                contIso++;
            } else {
                contEsc++;
            }

            System.out.println();
        }

        System.out.printf("Triangulos Equilateoros: %d%%\n", (contEqui * 10));
        System.out.printf("Triangulos Isoceles: %d%%\n", (contIso * 10));
        System.out.printf("Triangulos Escalenos: %d%%\n", (contEsc * 10));

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        triangulo(sc);

        sc.close();
    }
}
