package exercises;

import java.util.Scanner;
public class Exercise003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double area, raio, pi = 3.14159;

        raio = sc.nextDouble();

        area = pi * raio * raio;

        System.out.printf("A = %.4f %n", area);

        sc.close();

    }

}
