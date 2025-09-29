package others;

public class Modul3Soal2 {

    /*
     * Gaffa Fadhlanul Rozaq
     * 255150401111015
     */
    public static void main(String[] args) {

        /*
         *  GGGGG
         * G     G
         * G
         * G  GGG
         * G     G
         *  GGGGG
         */
        
        for (int i=0; i<6; i++) {
            for (int j=0; j<7; j++) {
                if ((i==0 || i==5) && (j>0 && j<6)) {
                    System.out.print("G");
                } else if ((i==1 || i==4) && (j==0 || j==6)) {
                    System.out.print("G");
                } else if (i==2 && j==0) {
                    System.out.print("G");
                } else if (i==3 && (j==0 || (j>3 && j<7))) {
                    System.out.print("G");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }

        /*
         *    A   
         *   A A  
         *  A   A
         * A     A
         * A A A A
         * A     A
         */

         for(int i=0; i<6; i++) {
            for (int j=0; j<7; j++) {
                if (i==0 && j==3) {
                    System.out.print("A");
                } else if (i==1 && (j==2 || j==4)) {
                    System.out.print("A");
                } else if (i==2 && (j==1 || j==5)) {
                    System.out.print("A");
                } else if (i==3 && (j==0 || j==6)) {
                    System.out.print("A");
                } else if (i==4 && (j%2==0)) {
                    System.out.print("A");
                } else if (i==5 && (j==0 || j==6)) {
                    System.out.print("A");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
         System.out.println();

         /*
          * FFFFF
          * F
          * FFF
          * F
          * F
          * F
          */

          for (int i=0; i<6; i++) {
            for (int j=0; j<5; j++) {
                if (i==0) {
                    System.out.print("F");
                } else if ((i==1 || i==3 || i==4 || i==5) && j==0) {
                    System.out.print("F");
                } else if (i==2 && (j>=0 && j<4)) {
                    System.out.print("F");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
          }
          System.out.println();

          for (int i=0; i<6; i++) {
            for (int j=0; j<5; j++) {
                if (i==0) {
                    System.out.print("F");
                } else if ((i==1 || i==3 || i==4 || i==5) && j==0) {
                    System.out.print("F");
                } else if (i==2 && (j>=0 && j<4)) {
                    System.out.print("F");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
          }

          for(int i=0; i<6; i++) {
            for (int j=0; j<7; j++) {
                if (i==0 && j==3) {
                    System.out.print("A");
                } else if (i==1 && (j==2 || j==4)) {
                    System.out.print("A");
                } else if (i==2 && (j==1 || j==5)) {
                    System.out.print("A");
                } else if (i==3 && (j==0 || j==6)) {
                    System.out.print("A");
                } else if (i==4 && (j%2==0)) {
                    System.out.print("A");
                } else if (i==5 && (j==0 || j==6)) {
                    System.out.print("A");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
         System.out.println();

    }
    
}
