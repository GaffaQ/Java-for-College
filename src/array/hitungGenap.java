package array;

import java.util.Scanner;

public class hitungGenap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans=0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] % 2 == 0) {
                ans++;
            }
        }

        System.out.println(ans);

        
    }
}
