package livecode;

import java.util.Scanner;

public class pemdas2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean flag = false;
        long i = 1;

        while (i <= n) {
            if (n == 1) {
                System.out.println("ya");
                return;
            }
            i *= 2;
            if (i == n) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("ya");
        } else {
            System.out.println("tidak");
        }


    }

}
