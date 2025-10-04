package others;

import java.util.Random;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Masukkan jumlah barang yang akan dibeli: ");
        int n = sc.nextInt();

        String[] namaBarang = new String[n];
        int[] hargaBarang = new int[n];
        int[] jumlahBarang = new int[n];
        int[] totalBarang = new int[n];
        int subtotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nama barang " + i+1 + ": ");
            namaBarang[i] = sc.next();
            System.out.print("Jumlah barang " + i+1 + ": ");
            jumlahBarang[i] = sc.nextInt();
            System.out.print("Harga barang " + i+1 + ": ");
            hargaBarang[i] = sc.nextInt();
            totalBarang[i] += jumlahBarang[i] * hargaBarang[i];
            subtotal += totalBarang[i];
        }

        System.out.print("Nama Kasir: ");
        String kasir = sc.nextLine();


        double diskonRate = 0.0;
        if (subtotal >= 500000) {
            diskonRate = 0.20;
        } else if (subtotal >= 100000) {
            diskonRate = 0.10;
        } else if (subtotal >= 50000) {
            diskonRate = 0.05;
        }
        int diskon = (int) (subtotal * diskonRate);
        int total = subtotal - diskon;

        System.out.print("Jumlah Bayar: ");
        int bayar = sc.nextInt();
        int kembali = bayar - total;

        int receiptNumber = 100000 + rand.nextInt(900000);
        String orderID = "FM" + (100 + rand.nextInt(900));
        Date now = new Date();
        String tanggal = new SimpleDateFormat("dd MMMM yyyy").format(now);
        String waktu   = new SimpleDateFormat("HH.mm").format(now);

        System.out.println("====================================");
        System.out.println("        GAFFA FADHLANUL ROZAQ");
        System.out.println("          255150401111015");
        System.out.println();
        System.out.printf("%-30s %5s%n", tanggal, waktu);
        System.out.printf("Receipt Number : %19d%n", receiptNumber);
        System.out.printf("Order ID       : %19s%n", orderID);
        System.out.printf("Collected by   : %19s%n", kasir);
        System.out.println("====================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-15s%n", namaBarang[i]);
            System.out.printf("%2dx  @%,-10d %,19d%n", jumlahBarang[i], hargaBarang[i], totalBarang[i]);
        }

        System.out.println("====================================");
        System.out.printf("%-15s %10s %,9d%n", "Subtotal", "Rp.", subtotal);
        System.out.printf("%-15s %n%-3s %22s %,9d%n", "Diskon", (int)(diskonRate*100) + "%", "- Rp.", diskon);
        System.out.println("====================================");
        System.out.printf("%-15s %10s %,9d%n", "Total", "Rp.", total);
        System.out.printf("%-15s %10s %,9d%n", "Bayar", "Rp.", bayar);
        System.out.println("====================================");
        System.out.printf("%-15s %9s %,9d%n", "Kembali", "- Rp", kembali);
        System.out.println("====================================");
        System.out.println("   Terima Kasih Telah Berbelanja");
        System.out.println("     di GAFFA FADHLANUL ROZAQ");
    }
}
