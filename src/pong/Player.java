package pong;

import java.awt.*;

public class Player {

    public boolean up, down;
    public int x, y;

    public Player(int x , int y){
        this.x = x;
        this.y = y;
    }

    public void tick(){
        if(up){
            y--;
        } else if (down) {
            y++;
        }

    }

    public void render(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(x, y, 10, 40 );
    }

}
