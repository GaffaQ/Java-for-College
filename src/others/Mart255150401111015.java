import java.util.Random;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mart255150401111015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Nama Barang 1: ");
        String nama1 = sc.nextLine();
        System.out.print("Jumlah Barang 1: ");
        int jml1 = sc.nextInt();
        System.out.print("Harga Barang 1: ");
        int harga1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Nama Barang 2: ");
        String nama2 = sc.nextLine();
        System.out.print("Jumlah Barang 2: ");
        int jml2 = sc.nextInt();
        System.out.print("Harga Barang 2: ");
        int harga2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Nama Barang 3: ");
        String nama3 = sc.nextLine();
        System.out.print("Jumlah Barang 3: ");
        int jml3 = sc.nextInt();
        System.out.print("Harga Barang 3: ");
        int harga3 = sc.nextInt();
        sc.nextLine();

        System.out.print("Nama Barang 4: ");
        String nama4 = sc.nextLine();
        System.out.print("Jumlah Barang 4: ");
        int jml4 = sc.nextInt();
        System.out.print("Harga Barang 4: ");
        int harga4 = sc.nextInt();
        sc.nextLine();

        System.out.print("Nama Kasir: ");
        String kasir = sc.nextLine();

        int total1 = jml1 * harga1;
        int total2 = jml2 * harga2;
        int total3 = jml3 * harga3;
        int total4 = jml4 * harga4;

        int subtotal = total1 + total2 + total3 + total4;

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
        System.out.printf("%-15s%n", nama1);
        System.out.printf("%2dx  @%,-10d %,19d%n", jml1, harga1, total1);
        System.out.printf("%-15s%n", nama2);
        System.out.printf("%2dx  @%,-10d %,19d%n", jml2, harga2, total2);
        System.out.printf("%-15s%n", nama3);
        System.out.printf("%2dx  @%,-10d %,19d%n", jml3, harga3, total3);
        System.out.printf("%-15s%n", nama4);
        System.out.printf("%2dx  @%,-10d %,19d%n", jml4, harga4, total4);

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
