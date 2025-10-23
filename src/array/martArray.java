package array;

import java.util.Scanner;

public class martArray {
    
    public static void main(String[] args) {

        /*
         * Gaffa Fadhlanul Rozaq
         * 255150401111015
         */
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = 0;

        
        String[] namaBarang = new String[n+1];
        int[] jumlahBarang = new int[n+1];
        int[] hargaBarang = new int[n+1];

        for (int i = 1; i <= n; i++) {

            System.out.print("Nama barang ke-" + i + ": ");
            namaBarang[i] = in.next();
            System.out.print("Jumlah barang ke-" + i + ": ");
            jumlahBarang[i] = in.nextInt();
            System.out.print("Harga barang satuan ke-" + i + ": ");
            hargaBarang[i] = in.nextInt();
        }

        System.out.println();
        System.out.println("===DAFTAR BARANG====");


        for (int i = 1; i <= n; i++) {
            System.out.println("Nama barang ke-" + i + ": " + namaBarang[i]);
            System.out.println("Jumlah barang ke-" + i + ": " + jumlahBarang[i]);
            System.out.println("Harga barang ke-" + i + ": " + hargaBarang[i]);
            total += jumlahBarang[i] * hargaBarang[i];
        }

        in.close();

        System.out.println("Total harga bayar: " + total);

    }


}
