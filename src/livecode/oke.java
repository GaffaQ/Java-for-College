package livecode;

import java.util.Scanner;

public class oke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long zz = sc.nextLong();

        if (zz > 0 && (zz & (zz - 1)) == 0) {
            System.out.println("ya");
        } else {
            System.out.println("tidak");
        }
    }
}
