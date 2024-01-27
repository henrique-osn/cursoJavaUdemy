package exercises;

import java.util.Scanner;

public class Exercise020 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 1; i <= x; i++) {
            int n = sc.nextInt();

            if (n >= 10 && n <= 20 ) {
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.printf("%d in%n", in);
        System.out.printf("%d out%n", out);

        sc.close();

    }

}
