package method;

import java.util.Scanner;

public class fakto {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(rekursif(n));

    }

    public static int rekursif(int n) {
        if (n==1) return 1;
        return n * rekursif(n-1);  
    }

}
