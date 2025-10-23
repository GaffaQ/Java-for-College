package method;

public class palindrom {
    

    public static void main(String[] args) {
        
        String s = "madam";
        
        

    }

    public static boolean paliindrom(String s){
        if (s.length() <= 1) return true;

        return ((s.charAt(0) == s.charAt(s.length()-1)) && (paliindrom(s.substring(1, s.length()-1))));
    }

}
