package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise013 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora de intervalo");
        } else if (numero <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (numero <= 50) {
            System.out.println("Intervalo (25,50]");
        } else {
            System.out.println("Intervalo (75,100]");
        }

        sc.close();

    }

}
