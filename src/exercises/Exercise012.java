package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise012 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        byte codigo = sc.nextByte();

        double valor = 0;
        switch (codigo) {
            case 1:
                valor = 4.00;
                break;
            case 2:
                valor = 4.50;
                break;
            case 3:
                valor = 5.00;
                break;
            case 4:
                valor = 2.00;
                break;
            case 5:
                valor = 1.50;
                break;
        }

        int quantidade = sc.nextInt();

        double total = valor * quantidade;

        System.out.printf("Total: R$ %.2f", total);

        sc.close();

    }

}
