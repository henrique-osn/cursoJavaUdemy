package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise005 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int hour = sc.nextInt();
        double hourCost = sc.nextDouble();

        double salary = hour * hourCost;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f %n", salary);

        sc.close();

    }

}
