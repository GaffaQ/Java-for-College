package array;

import java.util.Scanner;

public class hitungRataRata {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int total,n;
        n = in.nextInt();
        int[] arr = new int[n];

        //input isi array
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        } 

        //hitung rata rata
        total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }

        System.out.println("rata rata: " + total/n);

        in.close();
    }
    
}
