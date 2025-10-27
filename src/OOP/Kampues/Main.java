package OOP.Kampues;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n,m;
        n = in.nextInt();
        m = in.nextInt();

        String[][] arena = new String[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arena[i][j] = "_";
            }
        }

        Player sultan = new Player("Sultan", 0, 0);
        Walking walker = new Walking(sultan, n,m);

        boolean flag = true;
        while(flag){
            int opt = in.nextInt();
            switch (opt) {
                case 1:
                    walker.moveRight(1);
                    break;
                case 2:
                    walker.moveLeft(1);
                    break;
                case 3:
                    walker.moveTop(1);
                    break;
                case 4:
                    walker.moveDown(1);
                    break;
                case 5:
                    walker.moveDiagoTopRight(1, 1);
                    break;
                case 6:
                    walker.moveDiagoTopLeft(1, 1);
                    break;
                case 7:
                    walker.moveDiagoDownRight(1, 1);
                    break;
                case 8:
                    walker.moveDiagoDownLeft(1, 1);
                    break;
                default:
                   flag = false; 
                    break;
            }

            int posX = sultan.getX();
            int posY = sultan.getY();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(posX == i && posY == j){
                        arena[i][j] = "O";
                    }else{
                        arena[i][j] = "_";
                    }
                }
            }

            for(int i = 0; i < n; i++){
                for (int j = 0; j < m; j++) {
                    System.out.print(arena[i][j]);
                }
                System.out.println();
            }
        }

    }


}
