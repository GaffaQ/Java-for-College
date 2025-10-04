package array;

import java.util.Scanner;

public class hitungDuaArrya {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        in.close();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arrHasil = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arrHasil[i] = arr1[i] + arr2[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrHasil[i] + " ");
        }
        
        
    }
}
