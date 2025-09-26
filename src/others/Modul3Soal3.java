package others;

import java.util.Scanner;

public class Modul3Soal3 {
    
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
                    double p = in.nextDouble();
                    System.out.print("MASUKKAN LEBAR: ");
                    double l = in.nextDouble();
                    System.out.print("MASUKKAN TINGGI: ");
                    double t = in.nextDouble();
                    double volumeBalok = p * l * t;
                    System.out.println("VOLUME BALOK: " + volumeBalok);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("MASUKKAN JARI-JARI: ");
                    double r = in.nextDouble();
                    double volumeBola = (4.0/3.0) * Math.PI * r * r * r;
                    System.out.println("VOLUME BOLA: " + volumeBola);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("MASUKKAN JARI-JARI: ");
                    double r2 = in.nextDouble();
                    System.out.print("MASUKKAN TINGGI: ");
                    double t2 = in.nextDouble();
                    double volumeKerucut = (1.0/3.0) * Math.PI * r2 * r2 * t2;
                    System.out.println("VOLUME KERUCUT: " + volumeKerucut);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("MASUKKAN JARI-JARI: ");
                    double r3 = in.nextDouble();
                    System.out.print("MASUKKAN TINGGI: ");
                    double t3 = in.nextDouble();
                    double volumeSilinder = Math.PI * r3 * r3 * t3;
                    System.out.println("VOLUME SILINDER: " + volumeSilinder);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("MASUKKAN ALAS: ");
                    double a = in.nextDouble();
                    System.out.print("MASUKKAN TINGGI: ");
                    double t4 = in.nextDouble();
                    double volumeLimasSegitiga = (1.0/3.0) * (0.5 * a * a) * t4;
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
