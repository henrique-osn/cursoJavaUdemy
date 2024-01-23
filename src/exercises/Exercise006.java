package exercises;

import java.util.Locale;
import java.util.Scanner;
public class Exercise006 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int quantity1 = sc.nextInt();
        double value1 = sc.nextDouble();

        code = sc.nextInt();
        int quantity2 = sc.nextInt();
        double value2 = sc.nextDouble();

        double total = value1 * quantity1 + value2 * quantity2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();

    }

}
