package array;

import java.util.Scanner;

public class cariMaxMin {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int max,min;
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        max = min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max = " + max + ", Min = " + min);

    }

}
