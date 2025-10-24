package others;

import java.util.Scanner;

public class latihanutp {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n,k,j;
        n = in.nextInt();
        k = in.nextInt();
        j = in.nextInt();
        int ans =n;

        System.out.print(n + " ");
        while (n < j) {

            if (n % 2 == 0 ){
                n+=k;
            }else{
                n*=2;
            }
            
            if (n < j) {
                ans += n;
                System.out.print(n + " ");
            }
        }
        System.out.println();
        System.out.println(ans);

    }

}