package OOP.Kampues;

public class Walking {
    
    int x;
    int y;
    Player player;
    int baris, kolom;

    public Walking(Player user, int n, int m){
        this.player = user;
        this.baris = n;
        this.kolom = m;
    }

    public void moveRight(int y){
        if (this.player.getY()+y >= this.kolom) {
            this.player.setY(-1+y);
        }else{
            this.player.setY(this.player.getY()+y);
        }
    }

    public void moveLeft(int y){
        if(this.player.getY()-y < 0){
            this.player.setY(this.kolom-y);
        }else{
            this.player.setY(this.player.getY()-y);
        }
        
    }

    public void moveTop(int x){
        if(this.player.getX()-x < 0){
            this.player.setX(this.baris-x);
        }else{
            this.player.setX(this.player.getX()-x);
        }
    }

    public void moveDown(int x){
        if(this.player.getX()+x >= this.baris){
            this.player.setX(-1+x);
        }else{
            this.player.setX(this.player.getX()+x);
        }
    }

}
