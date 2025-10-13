package method;

import java.util.Scanner;

public class sumdigit {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(sumdigity(n));

    }

    public static int sumdigity(int n) {
        if (n % 10 == 0) return 0;
        
        return (n%10) + sumdigity(n/10);
    }

}
