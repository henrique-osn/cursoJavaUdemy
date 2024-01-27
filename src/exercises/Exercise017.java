package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise017 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double eixoX = sc.nextDouble();
        double eixoY = sc.nextDouble();

        while (eixoX != 0 && eixoY != 0) {
            if (eixoX > 0 && eixoY > 0) {
                System.out.println("Q1");
            } else if (eixoX < 0 && eixoY > 0) {
                System.out.println("Q2");
            } else if (eixoX < 0 && eixoY < 0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q4");
            }

            eixoX = sc.nextDouble();
            eixoY = sc.nextDouble();
        }

        sc.close();

    }

}
