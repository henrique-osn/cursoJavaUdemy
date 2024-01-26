package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise014 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double eixoX = sc.nextDouble();
        double eixoY = sc.nextDouble();

        if (eixoX == 0 && eixoY == 0) {
            System.out.println("Origem");
        } else if (eixoX == 0) {
            System.out.println("Eixo X");
        } else if (eixoY == 0) {
            System.out.println("Eixo Y");
        } else if (eixoX > 0 && eixoY > 0) {
            System.out.println("Q1");
        } else if (eixoX < 0 && eixoY > 0) {
            System.out.println("Q2");
        } else if (eixoX < 0 && eixoY < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        sc.close();

    }

}
