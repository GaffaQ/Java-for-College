package others;

import java.util.Scanner;

public class Modul4Soal1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int kapasitas = 10;
        int[] data = new int[kapasitas];
        int jumlahData = 0;
        int pilihan;

        do {
            System.out.println("====== MENU ======");
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = in.nextInt();
            in.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data (ketik 'x' untuk berhenti):");
                    while (true) {
                        System.out.print("Data ke-" + (jumlahData + 1) + ": ");
                        String input = in.nextLine();

                        if (input.equalsIgnoreCase("x")) {
                            break;
                        }

                        boolean valid = true;
                        for (int i = 0; i < input.length(); i++) {
                            char c = input.charAt(i);
                            if (c < '0' || c > '9') {
                                valid = false;
                                break;
                            }
                        }

                        if (valid) {
                            int nilai = Integer.parseInt(input);
                            if (jumlahData >= kapasitas) {
                                int kapasitasBaru = kapasitas + 10;
                                int[] temp = new int[kapasitasBaru];
                                for (int j = 0; j < kapasitas; j++) {
                                    temp[j] = data[j];
                                }
                                data = temp;
                                kapasitas = kapasitasBaru;
                            }

                            data[jumlahData] = nilai;
                            jumlahData++;
                        } else {
                            System.out.println("invalid mas! Masukkin angka atau 'x' untuk berhenti.");
                        }
                    }
                    break;

                case 2:
                    if (jumlahData == 0) {
                        System.out.println("Belum ada data yang kamu inputin mas!");
                    } else {
                        System.out.println("DAFTAR DATA: ");
                        for (int i = 0; i < jumlahData; i++) {
                            System.out.println(i+1 + ". " + data[i]);
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (jumlahData == 0) {
                        System.out.println("Data kosong mas!");
                    } else {
                        int total = 0;
                        for (int i = 0; i < jumlahData; i++) {
                            total += data[i];
                        }
                        double avg = (double) total / jumlahData;
                        System.out.println("Rata-rata = " + avg);
                    }
                    break;

                case 4:
                    if (jumlahData == 0) {
                        System.out.println("Data kosong mas!");
                    } else {
                        int sum = 0;
                        for (int i = 0; i < jumlahData; i++) {
                            sum += data[i];
                        }
                        System.out.println("Jumlah/Sum = " + sum);
                    }
                    break;

                case 5:
                    if (jumlahData == 0) {
                        System.out.println("Data kosong mas!");
                    } else {
                        int max = data[0];
                        for (int i = 1; i < jumlahData; i++) {
                            if (data[i] > max) {
                                max = data[i];
                            }
                        }
                        System.out.println("Nilai maksimum = " + max);
                    }
                    break;

                case 6:
                    if (jumlahData == 0) {
                        System.out.println("Data kosong mas!");
                    } else {
                        int min = data[0];
                        for (int i = 1; i < jumlahData; i++) {
                            if (data[i] < min) {
                                min = data[i];
                            }
                        }
                        System.out.println("Nilai minimum = " + min);
                    }
                    break;

                case 0:
                    System.out.println("Program selesai :>");
                    break;

                default:
                    System.out.println("Pilihan tidak valid mas!");
                    break;
            }

            System.out.println();
        } while (pilihan != 0);
    }

}
