package others;

import java.util.*;

public class hasnext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sesuatu: ");

        if (sc.hasNextInt()) {
            int angka = sc.nextInt(); // ambil input angka
            System.out.println("Input kamu adalah angka: " + angka);
        } else if (sc.hasNext()) {
            String teks = sc.next(); // ambil input teks
            System.out.println("Input kamu adalah teks: " + teks);
        } else {
            System.out.println("Tidak ada input yang terbaca.");
        }

        sc.close();
    }
}
