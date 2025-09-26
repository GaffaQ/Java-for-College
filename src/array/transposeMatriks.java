package array;
import java.util.Scanner;

public class transposeMatriks {
    public static void main(String[] args) {

        /*
         * yang baca ini doain gw lulus BCC pls, aamiin
         */
        
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int matriksA[][] = new int[n][n];
        int matriksB[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksA[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksB[j][i] = matriksA[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriksB[i][j] + " ");
            }
            System.out.println();

        }



    }

}
