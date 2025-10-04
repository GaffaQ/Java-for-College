package others;

import java.util.Scanner;

public class Modul4Soal2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[][] kereta = {
            {"Ekonomi", "50000", "2", "Tidak Ada", "Tidak Ada"},
            {"Bisnis", "100000", "5", "Ada", "Tidak Ada"},
            {"Eksekutif", "200000", "7", "Ada", "Tidak Ada"},
            {"Pariwisata", "300000", "10", "Ada", "Ada"}
        };

        String[][] pesanan = new String[100][3];
        int jumlahPesanan = 0;

        int pilihan;
        do {
            System.out.println("\n===== MENU KERETA API =====");
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = in.nextInt();

            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.println("=== DAFTAR KERETA API ===");
                    for (int i = 0; i < kereta.length; i++) {
                        System.out.println((i + 1) + ". " + kereta[i][0] + 
                            " | Harga: " + kereta[i][1] + 
                            " | Diskon: " + kereta[i][2] + "%" + 
                            " | AC: " + kereta[i][3] + 
                            " | Colokan: " + kereta[i][4]);
                    }
                    break;

                case 2:
                    System.out.println("=== KERETA API DENGAN AC ===");
                    for (int i = 0; i < kereta.length; i++) {
                        if (kereta[i][3].equalsIgnoreCase("Ada")) {
                            System.out.println(kereta[i][0] + " | Harga: " + kereta[i][1]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("=== KERETA API DENGAN COLOKAN ===");
                    for (int i = 0; i < kereta.length; i++) {
                        if (kereta[i][4].equalsIgnoreCase("Ada")) {
                            System.out.println(kereta[i][0] + " | Harga: " + kereta[i][1]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("=== PEMESANAN TIKET ===");
                    System.out.println("Pilih jenis kereta (1-4): ");
                    for (int i = 0; i < kereta.length; i++) {
                        System.out.println((i + 1) + ". " + kereta[i][0] + " (" + kereta[i][1] + ")");
                    }
                    System.out.print("Masukkan pilihan: ");
                    int pilihKereta = in.nextInt();

                    if (pilihKereta >= 1 && pilihKereta <= 4) {
                        System.out.print("Masukkan nama pemesan: ");
                        in.nextLine(); 
                        String nama = in.nextLine();

                        String jenis = kereta[pilihKereta - 1][0];
                        int harga = Integer.parseInt(kereta[pilihKereta - 1][1]);
                        int diskon = Integer.parseInt(kereta[pilihKereta - 1][2]);
                        double total = harga - (harga * (diskon / 100.0));

                        System.out.println("Total harga setelah diskon: " + total);

                        pesanan[jumlahPesanan][0] = nama;
                        pesanan[jumlahPesanan][1] = jenis;
                        pesanan[jumlahPesanan][2] = String.valueOf(total);
                        jumlahPesanan++;

                        System.out.println("Pesanan berhasil disimpan!");
                    } else {
                        System.out.println("Pilihan tidak valid!");
                    }
                    break;

                case 5:
                    System.out.println("=== DAFTAR PESANAN ===");
                    if (jumlahPesanan == 0) {
                        System.out.println("Belum ada pesanan.");
                    } else {
                        for (int i = 0; i < jumlahPesanan; i++) {
                            System.out.println((i + 1) + ". Nama: " + pesanan[i][0] + 
                                " | Jenis: " + pesanan[i][1] + 
                                " | Total: " + pesanan[i][2]);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

        } while (pilihan != 0);
    }

}
