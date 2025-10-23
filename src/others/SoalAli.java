package others;

import java.util.Scanner;

public class SoalAli {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int p = 0; p < t; p++) {
            String namaKota = in.next();
            int jumlahHari = in.nextInt();
            double rataAns;
            String type = "";
            double[] suhuMaks = new double[jumlahHari];
            double[] suhuMin = new double[jumlahHari];
            double[] suhuHarian = new double[jumlahHari];
            double selisih = 0;
            for (int i = 0; i < jumlahHari; i++) {
                suhuMaks[i] = in.nextDouble();
                suhuMin[i] = in.nextDouble();
                suhuHarian[i] = (suhuMaks[i]+suhuMin[i]);
            }

            double maks=0,mins=0;
            for (int i = 0; i<jumlahHari;i++) {
                if(i==0){
                    maks = suhuMaks[i];
                    mins = suhuMin[i]; 
                    continue;
                }
                if (maks < suhuMaks[i]) {
                    maks = suhuMaks[i];
                }
                if (mins > suhuMin[i]) {
                    mins = suhuMin[i]; 
                }
            }
            selisih = maks-mins;

            double ovr=0;
            for (int i = 0; i < jumlahHari; i++){
                ovr+=suhuHarian[i];
            }

            rataAns = ovr/(jumlahHari*2);
            if (rataAns >= 35) {
                type = "Panas";
            }else if (rataAns >= 25) {
                type = "Normal";
            }else if (rataAns >= 15) {
                type = "Sejuk";
            }else if (rataAns < 15) {
                type = "Dingin";
            }

            System.out.printf("%s %.2f %.2f %s", namaKota, rataAns, selisih, type);
        }


    }


}
