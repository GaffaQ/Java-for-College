package array;

import java.util.Scanner;

public class perkalianMatriks {

    public static void main(String[] args) {

        /*
         * yang baca ini doain gw lulus BCC pls, aamiin
         */
        
        Scanner in = new Scanner(System.in);

        int barisA,kolomA,barisB,kolomB;
        barisA = in.nextInt(); 
        kolomA = in.nextInt();

        barisB = in.nextInt(); 
        kolomB = in.nextInt();

        int[][] matriksA = new int[barisA][kolomA];
        int[][] matriksB = new int[barisB][kolomB];

        if (kolomA != barisB) {
            System.out.println("Matriks tidak dapat dikalikan");
            return;
        }

        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                matriksA[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                matriksB[i][j] = in.nextInt();
            }
        }

        int[][] matriksC = new int[barisA][kolomB];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                for (int k = 0; k < kolomA; k++) {
                    matriksC[i][j] += matriksA[i][k]*matriksB[k][j]; 
                }
            }
        }

        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print(matriksC[i][j] + " ");
            }
            System.out.println();
        }
    }



}
