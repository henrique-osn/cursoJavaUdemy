package exercises;

import java.util.Scanner;

public class Exercise010 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }

        sc.close();
    }

}
