import java.util.Scanner;

public class latihan4a {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan bilangan 1: ");
        int bil1 = in.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        int bil2 = in.nextInt();

        System.out.println("PILIH OPERASI");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");

        System.out.print("Masukkan pilihanmu (1/2/3/4): ");
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println(penjumlahan(bil1, bil2));
                break;
        
            case 2:
                System.out.println(pengurangan(bil1, bil2));
                break;
            
            case 3:
                System.out.println(pembagian(bil1, bil2));
                break;
            
            case 4:
                System.out.println(perkalian(bil1, bil2));
                break;
        }
    }

    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    public static int pengurangan(int a, int b) {
        return a-b;
    }

    public static int perkalian(int a, int b){
        return a*b;
    }

    public static int pembagian(int a, int b) {
        return a/b;
    }
}
