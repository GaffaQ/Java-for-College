package method;

import java.util.Scanner;

public class MethodPrak2 {

    public static boolean[] prime = new boolean[101];

    public static void checkPrime(){
        for (int i = 2; i*i <= 100; i++) {
            if(prime[i]){
                for (int j = i*i; j <= 100; j+=i) {
                    prime[j] = false;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        for (int i = 0; i <= 100; i++) {
            prime[i] = true;
        }
        checkPrime();

        System.out.print("Masukkan bilangan: ");
        int n = in.nextInt();

        if(prime[n]) {
            System.out.println("Ya");
        }else{
            System.out.println("Tidak");
        }
    }


}
