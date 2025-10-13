package method;

import java.util.Scanner;

public class fibbo {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibbon(n));

    }

    public static int fibbon (int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        return (fibbon(n-2) + fibbon(n-1));
    }

}
