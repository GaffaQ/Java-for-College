package others;

import java.util.Scanner;

public class Modul3Soal3 {
    
    /*
     * Gaffa Fadhlanul Rozaq
     * 255150401111015
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("MENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.println();
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            int n = in.nextInt();
            in.close();

            switch (n) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.print("MASUKKAN PANJANG: ");
                    int p = in.nextInt();
                    System.out.print("MASUKKAN LEBAR: ");
                    int l = in.nextInt();
                    System.out.print("MASUKKAN TINGGI: ");
                    int t = in.nextInt();
                    int volumeBalok = p * l * t;
                    System.out.println("VOLUME BALOK: " + volumeBalok);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("MASUKKAN JARI-JARI: ");
                    int r = in.nextInt();
                    int volumeBola = (int) ((4/3) * Math.PI * r * r * r);
                    System.out.println("VOLUME BOLA: " + volumeBola);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("MASUKKAN JARI-JARI: ");
                    int r2 = in.nextInt();
                    System.out.print("MASUKKAN TINGGI: ");
                    int t2 = in.nextInt();
                    int volumeKerucut = (int) ((1.0/3.0) * Math.PI * r2 * r2 * t2);
                    System.out.println("VOLUME KERUCUT: " + volumeKerucut);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("MASUKKAN JARI-JARI: ");
                    int r3 = in.nextInt();
                    System.out.print("MASUKKAN TINGGI: ");
                    int t3 = in.nextInt();
                    int volumeSilinder = (int) (Math.PI * r3 * r3 * t3);
                    System.out.println("VOLUME SILINDER: " + volumeSilinder);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("MASUKKAN ALAS: ");
                    int a = in.nextInt();
                    System.out.print("MASUKKAN TINGGI: ");
                    int t4 = in.nextInt();
                    int volumeLimasSegitiga = (int) ((1.0/3.0) * (0.5 * a * a) * t4);
                    System.out.println("VOLUME LIMAS SEGITIGA: " + volumeLimasSegitiga);
                    System.out.println();
                    break;
                default:
                    System.out.println("PILIHAN TIDAK VALID");
                    System.out.println();
                    break;
            }
        }

    }

}
