package alg09;

public class Ex08 {
    
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " -> Multiplo de 3 e 5!");
            } else {
                System.out.println(i);
            }
        }
    }
}