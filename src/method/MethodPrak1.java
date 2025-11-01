package method;

import java.util.Scanner;

public class MethodPrak1 {


    public static int faktorrial(int n) {
        if(n == 1) return 1;
        return n * faktorrial(n-1);
    }

    public static int permutation(int n, int r){
        return faktorrial(n)/faktorrial(n-r);
    }

    public static int combination(int n, int r){
        return faktorrial(n)/(faktorrial(n-r)*faktorrial(r));
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Program Penghitung Permutasi dan Kombinasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            int option, n,r;
            System.out.print("Masukkan pilihan anda : ");
            option = in.nextInt();
            switch (option) {
            case 1:
                System.out.print("Masukkan nilai n : ");
                n = in.nextInt();
                System.out.print("Masukkan nilai r : ");
                r = in.nextInt();
                System.out.println("        n!");
                System.out.println("nPr = ------ = " + permutation(n, r));
                System.out.println("      (n-r)!");
                System.out.println("Maka hasil permutasinya adalah : " + permutation(n, r));
                break;
            case 2:
                System.out.print("Masukkan nilai n : ");
                n = in.nextInt();
                System.out.print("Masukkan nilai r : ");
                r = in.nextInt();
                System.out.println("          n!");
                System.out.println("nCr = ---------- = " + combination(n, r));
                System.out.println("     (n-r)! x r!");
                System.out.println("Maka hasil kombinasinya adalah : " + combination(n, r));
                break;
            case 3:
                flag = false;
                break;
            }
        }

    }

    
}
