package exercises;

import java.util.Scanner;

public class Exercise022 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            double a = sc.nextInt();
            double b = sc.nextInt();

            if (b == 0) {
                System.out.println("Divisão Impossível!");
            } else {
                double r = a / b;
                System.out.printf("%.1f%n", r);
            }
        }

        sc.close();

    }

}
