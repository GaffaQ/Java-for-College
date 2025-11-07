

import java.util.Random;

public class MartUtils {
    
    public static int generateInvoiceNumber() {
        Random rand = new Random();
        int number = rand.nextInt(900000) + 100000; // generate a random 6-digit number
        return number;
    }


}
