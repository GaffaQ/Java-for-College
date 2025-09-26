package others;

import java.util.Scanner;

public class Modul3Soal1 {
    
    /*
     * 
     *          A
     *         A A
     *        A   A
     *       A A A A
     *      A       A
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int k = n-1; k > i; k--) {
                System.out.print("$");
                System.out.print(" ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
