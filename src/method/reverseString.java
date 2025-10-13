package method;

import java.util.Scanner;

public class reverseString {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(rev(s));

    }

    public static String rev(String s){
        if (s.length() <= 1) return s;

        return s.charAt(s.length()-1) + rev(s.substring(0, s.length()-1));
    }

}
